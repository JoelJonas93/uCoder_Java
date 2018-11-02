

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Integer> listaProdutos = new ArrayList<>();
		
		int valorTotal =  0;
		int qnt = entrada.nextInt();
		
		for(int i = 0; i < qnt;i++) {
			int qntPTotal = entrada.nextInt();
			for(int j = 0; j < qntPTotal; j++) {
				int qntP = entrada.nextInt();
				int valorP = entrada.nextInt();
				valorTotal = valorTotal + (qntP * valorP);
			}
			listaProdutos.add(valorTotal);
			int dinheiro = entrada.nextInt();
			listaProdutos.add(dinheiro);
			valorTotal = 0;
		}
		
		int a = 0;
		int c = 1;
		while(c < listaProdutos.size() + 1){
			System.out.println(listaProdutos);
			if((listaProdutos.get(c) - listaProdutos.get(a)) >= 0) {
				System.out.println(listaProdutos.get(c) - listaProdutos.get(a));
			}else {
				System.out.println("DINHEIRO INSUFICIENTE");
			}
			a = c + 1;
			c = a + 1;
			System.out.println(a + " " + c);
		}
		
	}

}
