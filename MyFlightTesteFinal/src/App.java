import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		ArrayList<CiaAerea> Lista = new ArrayList<>();

		CiaAerea companhia = new CiaAerea("TAM", "POA", "RIO");
		CiaAerea companhia2 = new CiaAerea("GOL", "POA", "SP");
		CiaAerea companhia3 = new CiaAerea("VARIG", "POA", "BH");
		CiaAerea companhia4 = new CiaAerea("AZUL", "POA", "CANOAS");
		CiaAerea companhia5 = new CiaAerea("TWA", "POA", "NEW YORK");

		Lista.add(0, companhia);
		Lista.add(1, companhia2);
		Lista.add(2, companhia3);
		Lista.add(3, companhia4);
		Lista.add(4, companhia5);

		for (int i = 0; i < Lista.size(); i++) {
			System.out.println("DADOS: " + Lista.get(i));

		}
		System.out.println("DADOS da ultima pos: " + Lista.get(4));
	}

}
