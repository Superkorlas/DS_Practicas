require "./CarrerasPrototypeFactory"

module Ruby_Prototypes
  
  factory = CarrerasPrototypeFactory.new
  
  puts "Elija tipo de carrera: montana (1), carretera (2)"
  tipo = gets.to_i
  puts "Introduzca numero de bicis para la carrera:"
  numero = gets.to_i
  carrera = tipo == 1 ? factory._prototypeCarreraMontana.clone : factory._prototypeCarreraCarretera.clone
  carrera.inicializarCarrera(numero)

end
