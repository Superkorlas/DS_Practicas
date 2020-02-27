module Ruby_Prototypes
	public
	class Carrera
		private_class_method :new
		def initialize
      @bicicletas = Array.new
		end
    public
    def self.createCarrera
      new
    end
    def inicializarCarrera(numero)
      i = 0
      while i < numero
        bici = @biciPrototype.clone
        bici.setId(i+1)
        @bicicletas << bici
        i = i + 1
      end
      puts "#{self.to_s} creada"
      self.iniciarCarrera(@abandono)
    end
    def iniciarCarrera(abandono)
      total_carrera = 60
      abandonan = @bicicletas.size * abandono
      i = 0
      while i < abandonan.to_i
        sleep(10/5)
        puts "Han pasado 10 segundos"
        total_carrera = total_carrera - 10
        puts "Bici con dorsal #{@bicicletas.last.getId} abandona"
        @bicicletas = @bicicletas.slice(0, @bicicletas.size - 1)
        i = i + 1
      end
      sleep(10/5)
      puts "Han pasado 10 segundos"
      total_carrera = total_carrera - 10
      dorsales = Array.new
      @bicicletas.each { |i| dorsales << i.getId  }
      puts "Siguen en la carrera las bicicletas con dorsales: #{dorsales}"
      sleep(total_carrera/5)
      puts "Han pasado #{total_carrera} segundos"
      puts "#{self.to_s} terminada"
    end
	end
end
