void main(List<String> args) {
  final numbers = [12,3,4,5,6,7,8,8,912,12,42,45,456,523,2,1,];


  print('lista original : $numbers');
  print('tamaño : ${numbers.length}');
  print('Indez 0 : ${numbers[0]}');
  print('First  : ${numbers.first}');
  print('Last  : ${numbers.last}');
  //print('Reverse  : ${numbers.reversed}');


  final reversedNumbers = numbers.reversed;
  print('Iterable : $reversedNumbers');
  print('Iterable : ${reversedNumbers.toList()}');
  print('Set : ${reversedNumbers.toSet()}');


  final numbersMasQue5 = numbers.where((int numbers) {
    return numbers > 5;
  });

  print('numeros mayores que 5 : ${numbersMasQue5.toSet()}');


}