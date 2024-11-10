package car;


public class Vehiculo {
    private String marca;
    private String modelo;
    private String vin;
    private String color;
    private int kilometraje;
    private int anio;
	public Vehiculo(String marca, String modelo, String vin, String color, int kilometraje, int anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vin = vin;
		this.color = color;
		this.kilometraje = kilometraje;
		this.anio = anio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
      
}

  