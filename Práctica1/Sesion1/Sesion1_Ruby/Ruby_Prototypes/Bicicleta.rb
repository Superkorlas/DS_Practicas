module Ruby_Prototypes
	public
	class Bicicleta
		private_class_method :new
		def initialize
		end
    public
    def self.createBici
      new
    end
    def setId(numero)
      @id = numero
    end
    def getId
      @id
    end
	end
end
