import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		ArrayList<CiaAerea> ListaCiaAerea = new ArrayList<>(); //CRIANDO ARRAYLIST DE CIAS AEREAS
		ArrayList<Aviao> ListaAviao = new ArrayList<>();//CRIANDO ARRAYLIST DE AVIÕES

		CiaAerea companhia = new CiaAerea("TAM", "POA", "RIO");//CRIANDO OBJ COMPANHIA...
		CiaAerea companhia2 = new CiaAerea("GOL", "POA", "SP");
		CiaAerea companhia3 = new CiaAerea("VARIG", "POA", "BH");
		CiaAerea companhia4 = new CiaAerea("AZUL", "POA", "CANOAS");
		CiaAerea companhia5 = new CiaAerea("TWA", "POA", "NEW YORK");
		CiaAerea companhia6 = new CiaAerea("TAM", "POA", "SP");

		Aviao aviao = new Aviao("AIRBUS380");//CRIANDO OBJ AVIAO...
		Aviao aviao2 = new Aviao("BOEING747");
		Aviao aviao3 = new Aviao("BOEING747");
		Aviao aviao4 = new Aviao("ANTONOV225");
		Aviao aviao5 = new Aviao("B17");
		Aviao aviao6 = new Aviao("AC130");

		ListaCiaAerea.add(0, companhia);//ADICIONANDO OBJS AO ARRAYLIST
		ListaCiaAerea.add(1, companhia2);
		ListaCiaAerea.add(2, companhia3);
		ListaCiaAerea.add(3, companhia4);
		ListaCiaAerea.add(4, companhia5);
		ListaCiaAerea.add(5, companhia6);
		//ListaCiaAerea.add(6, companhia6, aviao6);//ENCADEANDO OBJETOS ENTRE SI

		ListaAviao.add(aviao);//ADICIONANDO OBJS AO ARRAYLIST
		ListaAviao.add(aviao2);
		ListaAviao.add(aviao3);
		ListaAviao.add(aviao4);
		ListaAviao.add(aviao5);
		ListaAviao.add(aviao6);
		
		//ListaCiaAerea.add(0,);

		for (int i = 0; i < ListaCiaAerea.size(); i++) {
			System.out.println("Dados CiaAerea(" +i +"): "+ ListaCiaAerea.get(i));
		}
		System.out.println("DADOS DA ULTIMA POSIÇÂO CIA: " + ListaCiaAerea.get(5));
		System.out.println("----------------------------------------------------------------");
		System.out.println("Companhias Iguais.");
		for (int j = 0; j < ListaCiaAerea.size(); j++) {
			if (ListaCiaAerea.get(j).getNome().equals("TAM")) {
				System.out.println(ListaCiaAerea.get(j));
			}
		}
		System.out.println("----------------------------------------------------------------");
		for(int i = 0; i < ListaAviao.size(); i++){
			System.out.println("Dados Avião("+i+ "): "+ ListaAviao.get(i));
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Aviões Iguais.");
		for(int j = 0; j < ListaAviao.size(); j++){
			if(ListaAviao.get(j).getModelo().equals("BOEING747")){
				System.out.println(ListaAviao.get(j).getModelo());
			}	
		}
	}

}
