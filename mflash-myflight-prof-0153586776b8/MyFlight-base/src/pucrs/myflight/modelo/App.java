package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.Duration;

public class App {

	public static void main(String[] args) {
		GerenciadorCias gerCias = new GerenciadorCias();
		
		CiaAerea cia1 = new CiaAerea("JJ", "LATAM");
		CiaAerea cia2 = new CiaAerea("G3", "Gol");
		CiaAerea cia3 = new CiaAerea("TP", "TAP");
		
		gerCias.adicionar(cia1);
		gerCias.adicionar(cia2);
		gerCias.adicionar(cia3);
		
		// Teste: buscando cia pelo código
		CiaAerea result = gerCias.buscarCodigo("G3");
		if(result != null) {
			System.out.println("cia: "+result.getNome());
		}
		
		// Ex: criando objetos data e duração
		LocalDateTime datahora1 = LocalDateTime.of(2017, 8, 14, 22, 3);
		System.out.println("Data e hora: "+datahora1);		
		
		Duration duracao1 = Duration.ofMinutes(90); // 1:30
		System.out.println("Duração: "+duracao1);
		
		Aeroporto origem = new Aeroporto("POA", "Salgado Filho",
				new Geo(-29.9939, -51.1711));
		Aeroporto destino = new Aeroporto("GRU", "Guarulhos",
				new Geo(-23.4356,-46.4731));
		
		Aeronave aeronave = new Aeronave("733", "Boeing 737-300", 140);
		Rota r1 = new Rota(cia1, origem, destino, aeronave);
		
		Voo voo1 = new Voo(r1, datahora1, duracao1);
		Voo voo2 = new Voo(r1, duracao1);
		
		Geo poa = origem.getLocal();
		Geo gru = destino.getLocal();
		double dist = Geo.distancia(poa, gru);
		System.out.println("Dist. POA-GRU: "+dist);
		double dist2 = poa.distancia(gru);
		double dist3 = gru.distancia(poa);
		System.out.println("Dist. POA-GRU: "+dist2);
		System.out.println("Dist. GRU-POA: "+dist3);
		
		
	}
}
