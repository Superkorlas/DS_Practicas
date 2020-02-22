require "./CarrerasPrototypeFactory"

module Ruby_Prototypes
  factory = CarrerasPrototypeFactory.new
  
  carreraMontana = factory.crearCarreraMontana
  puts "#{carreraMontana.to_s} creada"
  
  puts "Introduzca numero de bicis de montana:"
  numero = gets.to_i
  i = 0
  while i < numero
    bici = factory.crearBicicletaMontana
    carreraMontana.anadirBicicleta(bici)
    i = i + 1
  end
  dorsales = Array.new
  carreraMontana.getBicicletas.each { |i| dorsales << i.getId  }
  puts "#{carreraMontana.to_s}, ids de las bicicletas: #{dorsales}"

  carreraCarretera = factory.crearCarreraCarretera
  puts "#{carreraCarretera.to_s} creada"
  
  puts "Introduzca numero de bicis de carretera:"
  numero = gets.to_i
  i = 0
  while i < numero
    bici = factory.crearBicicletaCarretera
    carreraCarretera.anadirBicicleta(bici)
    i = i + 1
  end
  dorsales = Array.new
  carreraCarretera.getBicicletas.each { |i| dorsales << i.getId  }
  puts "#{carreraCarretera.to_s}, ids de las bicicletas: #{dorsales}"
  
  carreraMontana.iniciarCarrera(0.2)
  carreraCarretera.iniciarCarrera(0.1)
  
end
