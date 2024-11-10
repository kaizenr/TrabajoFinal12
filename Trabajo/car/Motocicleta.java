package car;

public class Motocicleta extends Vehiculo{
	private String tipoManillar;
    private int numRuedas;
    private String tipoFreno;
    private int cilindrada;
    
	public Motocicleta(String marca, String modelo, String vin, String color, int kilometraje, int anio,
			String tipoManillar, int numRuedas, String tipoFreno, int cilindrada) {
		
		super(marca, modelo, vin, color, kilometraje, anio);
		this.tipoManillar = tipoManillar;
		this.numRuedas = numRuedas;
		this.tipoFreno = tipoFreno;
		this.cilindrada = cilindrada;
	}
	public String getTipoManillar() {
		return tipoManillar;
	}
	public void setTipoManillar(String tipoManillar) {
		this.tipoManillar = tipoManillar;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public String getTipoFreno() {
		return tipoFreno;
	}
	public void setTipoFreno(String tipoFreno) {
		this.tipoFreno = tipoFreno;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
    
    

}
