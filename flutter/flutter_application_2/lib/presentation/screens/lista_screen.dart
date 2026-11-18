import 'package:flutter/material.dart';

// 1. Modelo de datos para cada tarea
class Tarea {
  String titulo;
  bool completada;

  Tarea({required this.titulo, this.completada = false});
}


class ListaScreen extends StatefulWidget {
  const ListaScreen({super.key});

  @override
  State<ListaScreen> createState() => _ListaScreenState();
}

class _ListaScreenState extends State<ListaScreen> {
  final List<Tarea> _tareas = [];
  final TextEditingController _controladorTexto = TextEditingController();

  void _agregarTarea(String titulo) {
    if (titulo.trim().isEmpty) return;
    setState(() {
      _tareas.add(Tarea(titulo: titulo.trim()));
    });
    _controladorTexto.clear();
  }

  void _alternarEstado(int index) {
    setState(() {
      _tareas[index].completada = !_tareas[index].completada;
    });
  }

  void _eliminarTarea(int index) {
    setState(() {
      _tareas.removeAt(index);
    });
  }

  @override
  void dispose() {
    _controladorTexto.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Lista'),
      ),
      body: Column(
        children: [
          // Caja del puto texto 
          Padding(
            padding: const EdgeInsets.all(16.0),
            child: Row(
              children: [
                Expanded(
                  child: TextField(
                    controller: _controladorTexto,
                    decoration: const InputDecoration(
                      hintText: 'Escribe unua tarea.',
                      border: OutlineInputBorder(),
                    ),
                    onSubmitted: _agregarTarea,
                  ),
                ),
                const SizedBox(width: 10),
                ElevatedButton(
                  onPressed: () => _agregarTarea(_controladorTexto.text),
                  style: ElevatedButton.styleFrom(
                    padding: const EdgeInsets.symmetric(vertical: 16, horizontal: 20),
                  ),
                  child: const Icon(Icons.add),
                ),
              ],
            ),
          ),
          // La lista 
          Expanded(
            child: _tareas.isEmpty
                ? const Center(
                    child: Text(
                      'No hay tareas pendientes.',
                      style: TextStyle(fontSize: 16, color: Colors.grey),
                    ),
                  )
                : ListView.builder(
                    itemCount: _tareas.length,
                    itemBuilder: (context, index) {
                      final tarea = _tareas[index];
                      return Dismissible(
                        key: Key('${tarea.titulo}_$index'),
                        direction: DismissDirection.endToStart,
                        onDismissed: (_) => _eliminarTarea(index),
                        background: Container(
                          color: Colors.red,
                          alignment: Alignment.centerRight,
                          padding: const EdgeInsets.only(right: 20),
                          child: const Icon(Icons.delete, color: Colors.white),
                        ),
                        child: CheckboxListTile(
                          title: Text(
                            tarea.titulo,
                            style: TextStyle(
                              decoration: tarea.completada
                                  ? TextDecoration.lineThrough
                                  : TextDecoration.none,
                              color: tarea.completada ? Colors.grey : null,
                            ),
                          ),
                          value: tarea.completada,
                          onChanged: (_) => _alternarEstado(index),
                          controlAffinity: ListTileControlAffinity.leading,
                        ),
                      );
                    },
                  ),
          ),
        ],
      ),
    );
  }
}
