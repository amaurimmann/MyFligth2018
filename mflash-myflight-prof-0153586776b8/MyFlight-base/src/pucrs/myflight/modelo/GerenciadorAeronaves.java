package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {

	private ArrayList<Aeronave> aeronaves;
	
	public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
	}
	
	public ArrayList<Aeronave> listarTodas() {
		return new ArrayList<>(aeronaves);			
	}
}
