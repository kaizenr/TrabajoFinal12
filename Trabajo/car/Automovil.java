package car;

public class Automovil extends Vehiculo{
	 private int numPuertas;
	    private String tipoCombustible;
	    private String transmision;
	    private String traccion;
	    
		public Automovil(String marca, String modelo, String vin, String color, int kilometraje, int anio,
				int numPuertas, String tipoCombustible, String transmision, String traccion) {
			super(marca, modelo, vin, color, kilometraje, anio);
			this.numPuertas = numPuertas;
			this.tipoCombustible = tipoCombustible;
			this.transmision = transmision;
			this.traccion = traccion;
		}

		public int getNumPuertas() {
			return numPuertas;
		}

		public void setNumPuertas(int numPuertas) {
			this.numPuertas = numPuertas;
		}

		public String getTipoCombustible() {
			return tipoCombustible;
		}

		public void setTipoCombustible(String tipoCombustible) {
			this.tipoCombustible = tipoCombustible;
		}

		public String getTransmision() {
			return transmision;
		}

		public void setTransmision(String transmision) {
			this.transmision = transmision;
		}

		public String getTraccion() {
			return traccion;
		}

		public void setTraccion(String traccion) {
			this.traccion = traccion;
		}
	   
		
	    
	    

}
