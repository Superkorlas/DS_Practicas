require('./Carrera.rb');
require('./BicicletaMontana.rb');

module Ruby_Prototypes
	public
	class CarreraMontana < Carrera
		public
    def initialize()
      super
      @biciPrototype = BicicletaMontana.createBici
      @abandono = 0.2
    end
    
    def to_s
      "Carrera de montana con #{@bicicletas.size} bicicletas"
    end
	end
end
