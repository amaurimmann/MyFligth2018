package pucrs.myflight.modelo;

//import java.time.Duration;
//import java.time.Instant;
import java.util.ArrayList;
//import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		System.out.println("teste GITHUB");

		System.out.println("Teste 02");

		System.out.println("teste 03");

		// System.out.println("https://github.com/matheusmorcinek/MyFlightPOO/blob/master/MyFlight-base/src/pucrs/myflight/modelo/Aeronave.java");

		ArrayList<Aeronave> nave = new ArrayList<Aeronave>();// CRIANDO UM ARRAYLIST DE OBJETOS DO TIPO AERONAVES

		Aeronave nave1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave nave2 = new Aeronave("73G", "Boeing 737-700", 126);
		Aeronave nave3 = new Aeronave("380", "Airbus Industrie A380", 644);
		Aeronave nave4 = new Aeronave("764", "Boeing 767-400", 304);

		nave.add(nave1);
		nave.add(nave2);
		nave.add(nave3);
		nave.add(nave4);

		System.out.println(nave.toString()); // PRINTANDO NA TELA O ARRAYLIST DE OBJETOS AERONAVES

		ArrayList<CiaAerea> cia = new ArrayList<CiaAerea>();// CRIANDO UM ARRAYLIST DE OBJETOS DO TIPO CIAAEREA

		CiaAerea cia1 = new CiaAerea("JJ", "LATAM");
		CiaAerea cia2 = new CiaAerea("G3", "GOL");
		CiaAerea cia3 = new CiaAerea("TP", "TAP");
		CiaAerea cia4 = new CiaAerea("AD", "AZUL");

		cia.add(cia1);
		cia.add(cia2);
		cia.add(cia3);
		cia.add(cia4);

		System.out.println(cia.toString()); // PRINTANDO NA TELA O ARRAYLIST DE OBJETOS COMPANHIAS AEREAS

		ArrayList<Geo> geo = new ArrayList<Geo>();// CRIANDO UM ARRAYLIST DE OBJETOS DO TIPO GEO

		Geo geo1 = new Geo(-29.9939, -51.1711);
		Geo geo2 = new Geo(-23.4356, -46.4731);
		Geo geo3 = new Geo(38.7742, -9.1342);
		Geo geo4 = new Geo(25.7933, -80.2906);

		geo.add(geo1);
		geo.add(geo2);
		geo.add(geo3);
		geo.add(geo4);

		System.out.println(geo.toString());// PRINTANDO NA TELA O ARRAYLIST DE OBJETOS GEO

		ArrayList<Aeroporto> aeroporto = new ArrayList<Aeroporto>();// CRIANDO UM ARRAYLIST DE OBJETOS DO TIPO AEROPORTO

		Aeroporto aeroporto1 = new Aeroporto("POA", "Salgado Filho Intl Apt", geo1);
		Aeroporto aeroporto2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", geo2);
		Aeroporto aeroporto3 = new Aeroporto("LIS", "Lisbon", geo3);
		Aeroporto aeroporto4 = new Aeroporto("MIA", "Miami International Apt", geo4);

		aeroporto.add(aeroporto1);
		aeroporto.add(aeroporto2);
		aeroporto.add(aeroporto3);
		aeroporto.add(aeroporto4);

		System.out.println(aeroporto.toString());// PRINTANDO NA TELA O ARRAYLIST DE OBJETOS AEROPORTOS

		ArrayList<Rota> rota = new ArrayList<Rota>();// CRIANDO UM ARRAYLIST DE OBJETOS DO TIPO ROTA

		Rota rota1 = new Rota(cia1, aeroporto1, aeroporto2, nave1);
		Rota rota2 = new Rota(cia2, aeroporto2, aeroporto1, nave2);
		Rota rota3 = new Rota(cia3, aeroporto3, aeroporto4, nave3);
		Rota rota4 = new Rota(cia4, aeroporto4, aeroporto3, nave4);

		rota.add(rota1);
		rota.add(rota2);
		rota.add(rota3);
		rota.add(rota4);

		System.out.println(rota.toString());// PRINTANDO NA TELA O ARRAYLIST DE OBJETOS ROTA
		
		//pesquisar sobre metódo local date time e duration

		// Instant inicio = Instant.now();
		// Instant fim =Instant.now();
		// Duration duracao = Duration.between(inicio, fim);
		// long duracaoEmMilissegundos = duracao.toMillis();

		// ArrayList<Voo>voo = new Voo(rota1, 2007-12-03T10:15:30);

		/** Cadastre, pelo menos, todos os dados de cias aéreas, aeronaves, aeroportos ,
		 * rotas e vôos apresentados como exemplo*/
		
		

	}
}
