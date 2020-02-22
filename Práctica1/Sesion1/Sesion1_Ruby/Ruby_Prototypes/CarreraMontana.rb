require('./Carrera.rb');

module Ruby_Prototypes
	public
	class CarreraMontana < Carrera
		public
    def to_s
      "Carrera de montana con #{@bicicletas.size} bicicletas"
    end
	end
end
