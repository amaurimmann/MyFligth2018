package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
	    empresas.add(cia);
    }

    public CiaAerea buscarCodigo(String cod) {
        for (CiaAerea cia: empresas)
            if (cod.equals(cia.getCodigo()))
                return cia;
        // Não encontrou, retorna null
        return null;
    }

    public CiaAerea buscarNome(String nome) {
        for (CiaAerea cia: empresas)
            if (nome.equals(cia.getNome()))
                return cia;
        // Não encontrou, retorna null
        return null;
    }

    public ArrayList<CiaAerea> listarTodas() {
	    ArrayList<CiaAerea> nova = new ArrayList<>();
	    for(CiaAerea cia: empresas)
	        nova.add(cia);
        return nova;
    }
}
