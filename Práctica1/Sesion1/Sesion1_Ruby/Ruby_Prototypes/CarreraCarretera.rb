require('./Carrera.rb');
require('./BicicletaCarretera.rb');

module Ruby_Prototypes
	public
	class CarreraCarretera < Carrera
		public
    def initialize()
      super
      @biciPrototype = BicicletaCarretera.createBici
      @abandono = 0.1
    end
    def to_s
      "Carrera de carretera con #{@bicicletas.size} bicicletas"
    end
	end
end
