package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {

	private ArrayList<Rota> rotas;

	public GerenciadorRotas() {

		this.rotas = new ArrayList<>();
	}

	public void adicionarRota(Rota rot) {
		rotas.add(rot);
	}
	
	 public Rota buscarRotaCia(String cia) { //METODO QUE CIA CODIGO NA LISTA
	        for (Rota rot: rotas)
	            if (cia.equals(rot.getCia()))
	                return rot;
	        // Não encontrou, retorna null
	        return null;
	    }
	
}
