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
        // Não encontrou, retorna null
        return null;
	}
	
	public Aeronave buscarDescricao(String descri) { // METODO QUE BUSCA DESCRIÇÃO NA LISTA
        for (Aeronave nave: aeronaves)
            if (descri.equals(nave.getDescricao()))
                return nave;
        // Não encontrou, retorna null
        return null;
    }
	
	public Aeronave buscarCapacidade(int capa) { // METODO QUE BUSCA CAPACIDADE NA LISTA
        for (Aeronave nave: aeronaves)
            if (capa == nave.getCapacidade())
                return nave;
        // Não encontrou, retorna null
        return null;
    }
	
}
