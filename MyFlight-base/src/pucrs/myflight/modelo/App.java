package pucrs.myflight.modelo;

public class App {

	public static void main(String[] args) {
		
		System.out.println("teste GITHUB");
		
		System.out.println("Teste 02");
		
		System.out.println("teste 03");
		
		//System.out.println("https://github.com/matheusmorcinek/MyFlightPOO/blob/master/MyFlight-base/src/pucrs/myflight/modelo/Aeronave.java");

		CiaAerea cia1 = new CiaAerea("JJ", "LATAM");
		CiaAerea cia2 = new CiaAerea("G3", "GOL");
		CiaAerea cia3 = new CiaAerea("TP", "TAP");
		CiaAerea cia4 = new CiaAerea("AD", "AZUL");
		
		Aeronave nave1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave nave2 = new Aeronave("73G", "Boeing 737-700", 126);
		Aeronave nave3 = new Aeronave("380", "Airbus Industrie A380", 644);
		Aeronave nave4 = new Aeronave("764", "Boeing 767-400", 304);
		
		Geo geo1 = new Geo(-29.9939, -51.1711);
		Geo geo2 = new Geo(-23.4356, -46.4731);
		Geo geo3 = new Geo(38.7742, -9.1342);
		Geo geo4 = new Geo(25.7933, -80.2906);
		
		Aeroporto aeroporto1 = new Aeroporto("POA", "Salgado Filho Intl Apt", geo1);
		Aeroporto aeroporto2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", geo2);
		Aeroporto aeroporto3 = new Aeroporto("LIS", "Lisbon", geo3);
		Aeroporto aeroporto4 = new Aeroporto("MIA", "Miami International Apt", geo4);
		
		Rota rota1 = new Rota(cia1, aeroporto1, aeroporto2, nave1);
		Rota rota2 = new Rota(cia2, aeroporto2, aeroporto1, nave2);
		Rota rota3 = new Rota(cia3, aeroporto3, aeroporto4, nave3);
		Rota rota4 = new Rota(cia4, aeroporto4, aeroporto3, nave4);
		
		//Voo voo1 = new Voo(rota1, datahora, duracao);
		
		
		/*Cadastre, pelo menos, todos os dados de cias aéreas, aeronaves, aeroportos
		 * , rotas e vôos apresentados como exemplo*/
		
		
	}
}
