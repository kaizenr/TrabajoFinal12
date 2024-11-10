package car;

public class Camion extends Vehiculo{
	private int capacidadCarga;
	private String tipoCamion;
	private  int longitud;
	private int numeroEjes;
	public Camion(String marca, String modelo, String vin, String color, int kilometraje, int anio, int capacidadCarga,
			String tipoCamion, int longitud, int numeroEjes) {
		super(marca, modelo, vin, color, kilometraje, anio);
		this.capacidadCarga = capacidadCarga;
		this.tipoCamion = tipoCamion;
		this.longitud = longitud;
		this.numeroEjes = numeroEjes;
	}
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public String getTipoCamion() {
		return tipoCamion;
	}
	public void setTipoCamion(String tipoCamion) {
		this.tipoCamion = tipoCamion;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getNumeroEjes() {
		return numeroEjes;
	}
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	
	
	

}
