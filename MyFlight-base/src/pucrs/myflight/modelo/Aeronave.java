package pucrs.myflight.modelo;

// https://github.com/matheusmorcinek/MyFlightPOO/blob/master/MyFlight-base/src/pucrs/myflight/modelo/Aeronave.java
//modelo a seguir

public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;
	
	public Aeronave(String codigo, String descricao, int cap) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = cap;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade() {
		return capacidade;
	}
}
