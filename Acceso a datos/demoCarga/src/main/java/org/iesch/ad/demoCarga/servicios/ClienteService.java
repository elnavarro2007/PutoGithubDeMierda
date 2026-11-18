package org.iesch.ad.demoCarga.servicios;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoCarga.modelo.Cliente;
import org.iesch.ad.demoCarga.repositorio.ClienteRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Logica de negocio

@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepositorio clienteRepositorio;

    private static final Logger logger = LoggerFactory.getLogger(ClienteService.class);


    @Transactional
    public void mostrarDatos(long id) {

        logger.trace("entra en mostrarDatos");
        logger.debug("id"+ id);

        Optional<Cliente> clienteOptional = clienteRepositorio.findById(id);


        Optional<Cliente> clienteOptional = clienteRepositorio.findById(id);

        if (clienteOptional.isPresent()){
            Cliente cliente = clienteOptional.get();
            System.out.println(cliente.getNombre());
            System.out.println(cliente.getId());

            System.out.println(cliente.getPedidos().size());

        }else {
            System.out.println("no existe" + id);
        }


    }

    @Transactional
    public void mostrarDatos() {
        List<Cliente> clienteList = clienteRepositorio.findAll();
        System.out.println(clienteList.size());

        for (Cliente c : clienteList){
            System.out.println("cliente : "+c.getId() + " nombre : "+c.getNombre() + " pedidos : "+c.getPedidos().size());
        }
    }

    public void arregloN1() {
        List<Cliente> clienteList = clienteRepositorio.findAllConPedidos();
        System.out.println(clienteList);
    }
}
