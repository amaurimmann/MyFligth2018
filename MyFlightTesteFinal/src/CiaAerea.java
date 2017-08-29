
public class CiaAerea {
	
	private String Nome;
	private String Destino;
	private String Origem;
	
	public CiaAerea(String nome, String destino, String origem) {
		super();
		Nome = nome;
		Destino = destino;
		Origem = origem;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	@Override
	public String toString() {
		return "CiaAerea [Nome=" + Nome + ", Destino=" + Destino + ", Origem=" + Origem + "]";
	}
	

}
