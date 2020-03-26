require('./Bicicleta.rb');

module Ruby_Prototypes
	public
	class BicicletaMontana < Bicicleta
		public
    def to_s
      "Bicicleta de montana con numero #{@id}"
    end
	end
end
