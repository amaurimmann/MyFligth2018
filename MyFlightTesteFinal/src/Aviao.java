
public class Aviao {
	private String Modelo;

	public Aviao(String modelo) {
		super();
		Modelo = modelo;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	
	@Override
	public String toString() {
		return "Aviao [Modelo=" + Modelo + "]";
	}
	
	

}
