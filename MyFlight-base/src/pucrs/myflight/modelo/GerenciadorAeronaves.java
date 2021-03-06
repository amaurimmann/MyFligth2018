package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {

	private ArrayList<Aeronave> aeronaves; // CRIANDO LISTA DE OBJETOS. AERONAVES = LISTA DE AERONAVE

	public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
	}

	public void Adicionar(Aeronave nave) {//METODO QUE ADICIONA OBJETO A LISTA
		aeronaves.add(nave);
	}

	public Aeronave buscarCodigo(String cod) {//METODO QUE  BUSCA OBJETO PELO CODIGO
		for (Aeronave nave: aeronaves)
            if (cod.equals(nave.getCodigo()))
                return nave;
        // N�o encontrou, retorna null
        return null;
	}
	
	public Aeronave buscarDescricao(String descri) { // METODO QUE BUSCA DESCRI��O NA LISTA
        for (Aeronave nave: aeronaves)
            if (descri.equals(nave.getDescricao()))
                return nave;
        // N�o encontrou, retorna null
        return null;
    }
	
	public Aeronave buscarCapacidade(int cap) { // METODO QUE BUSCA CAPACIDADE NA LISTA
        for (Aeronave nave: aeronaves)
            if (cap == nave.getCapacidade())
                return nave;
        // N�o encontrou, retorna null
        return null;
    }

	 public ArrayList<Aeronave> listarTodas() { // CRIA LISTA COM TODAS AS COMPANHIAS AEREAS
		    ArrayList<Aeronave> nova = new ArrayList<>();
		    for(Aeronave nave: aeronaves)
		        nova.add(nave);
	        return nova;
	    }

	@Override
	public String toString() {
		return "GerenciadorAeronaves [aeronaves=" + aeronaves + "]";
	}
	 
	 
	
}
