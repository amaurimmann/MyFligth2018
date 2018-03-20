package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas; //CRIA LIST DE OBJETOS. EMPRESAS = VARIOS OBJETOS DO TIPO CIAaEREA 
	
	public GerenciadorCias() {
		empresas = new ArrayList<>(); // CRIA NOVA LISTA DE OBJETOS
	}

	public void adicionar(CiaAerea cia) { //METODO QUE ADICIONA OBJETO A LISTA
	    empresas.add(cia);
    }

    public CiaAerea buscarCodigo(String cod) { //METODO QUE BUSCA CODIGO NA LISTA
        for (CiaAerea cia: empresas)
            if (cod.equals(cia.getCodigo()))
                return cia;
        // Não encontrou, retorna null
        return null;
    }

    public CiaAerea buscarNome(String nome) { // METODO QUE BUSCA NOME NA LISTA
        for (CiaAerea cia: empresas)
            if (nome.equals(cia.getNome()))
                return cia;
        // Não encontrou, retorna null
        return null;
    }

    public ArrayList<CiaAerea> listarTodas() { // CRIA LISTA COM TODAS AS COMPANHIAS AEREAS
	    ArrayList<CiaAerea> nova = new ArrayList<>();
	    for(CiaAerea cia: empresas)
	        nova.add(cia);
        return nova;
    }
}
