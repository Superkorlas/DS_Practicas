require('./BicicletaMontana.rb');
require('./BicicletaCarretera.rb');
require('./CarreraMontana.rb');
require('./CarreraCarretera.rb');

module Ruby_Prototypes
	public
	class CarrerasPrototypeFactory
    public
		def initialize()
			@_prototypeBicicletaMontana = BicicletaMontana.createBici
			@_prototypeBicicletaCarretera = BicicletaCarretera.createBici
			@_prototypeCarreraMontana = CarreraMontana.createCarrera
			@_prototypeCarreraCarretera = CarreraCarretera.createCarrera
		end
    attr_reader :_prototypeBicicletaMontana, :_prototypeBicicletaCarretera, :_prototypeCarreraMontana, :_prototypeCarreraCarretera
	end
end
