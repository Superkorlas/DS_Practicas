require('./Carrera.rb');

module Ruby_Prototypes
	public
	class CarreraCarretera < Carrera
		public
    def to_s
      "Carrera de carretera con #{@bicicletas.size} bicicletas"
    end
	end
end
