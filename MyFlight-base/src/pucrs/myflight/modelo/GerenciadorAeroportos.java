package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
	private ArrayList<Aeroporto> aeroportos;// CRIANDO UM OBJETO DO TIPO AEROPORTO
	
public GerenciadorAeroportos() {
	aeroportos = new ArrayList<>(); // CRIANDO UMA LISTA DE OBEJTOS =  AEROPORTOS
}

public void AdicionarAeroporto(Aeroporto aeros) {
	aeroportos.add(aeros);
}

public Aeroporto buscarCodigo(String cod) {//METODO QUE  BUSCA OBJETO PELO CODIGO
	for (Aeroporto aeros: aeroportos)
        if (cod.equals(aeros.getCodigo()))
            return aeros;
    // Não encontrou, retorna null
    return null;
}

public Aeroporto  buscarNome(String nome) {//METODO QUE  BUSCA OBJETO PELO NOME
	for (Aeroporto aeros: aeroportos)
        if (nome.equals(aeros.getNome()))
            return aeros;
    // Não encontrou, retorna null
    return null;
}

public Aeroporto buscarGeo(String geo) {//METODO QUE  BUSCA OBJETO PELO CODIGO
	for (Aeroporto aeros: aeroportos)
        if (geo.equals(aeros.getLocal()))
            return aeros;
    // Não encontrou, retorna null
    return null;
}


}


