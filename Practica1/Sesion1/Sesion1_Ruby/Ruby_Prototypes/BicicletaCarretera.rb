require('./Bicicleta.rb');

module Ruby_Prototypes
	public
	class BicicletaCarretera < Bicicleta
		public
    def to_s
      "Bicicleta de carretera con numero #{@id}"
    end
	end
end
