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
      @contadorBicicletaMontana = 0
      @contadorBicicletaCarretera = 0
		end
		public
		def crearBicicletaCarretera()
      bici = @_prototypeBicicletaCarretera.clone
      @contadorBicicletaCarretera = @contadorBicicletaCarretera + 1
      bici.setId(@contadorBicicletaCarretera)
      bici
		end

		def crearBicicletaMontana()
      bici = @_prototypeBicicletaMontana.clone
      @contadorBicicletaMontana = @contadorBicicletaMontana + 1
      bici.setId(@contadorBicicletaMontana)
      bici
		end

		def crearCarreraCarretera()
      @_prototypeCarreraCarretera.clone
		end

		def crearCarreraMontana()
      	@_prototypeCarreraMontana.clone
		end
	end
end
