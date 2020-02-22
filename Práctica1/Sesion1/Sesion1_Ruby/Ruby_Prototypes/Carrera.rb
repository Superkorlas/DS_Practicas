module Ruby_Prototypes
	public
	class Carrera
		private_class_method :new
		def initialize()
      @bicicletas = Array.new
		end
    public
    def self.createCarrera
      new
    end
    def anadirBicicleta(bici)
      @bicicletas << bici
    end
    def getBicicletas
      @bicicletas
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
