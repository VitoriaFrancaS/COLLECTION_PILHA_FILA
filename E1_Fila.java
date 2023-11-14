package Collections;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class E1_Fila {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Queue<String> cliente = new LinkedList();
		
		int al;

		
		do {
			
			System.out.println("\n\t\t CLIENTES");
			System.out.println("\n(1) Adicionar o nome do cliente: " );
			System.out.println("\n(2) Listar todos os clientes: " );
			System.out.println("\n(3) Retirar o nome do cliente: " );
			System.out.println("\n(0) Fim! " );
			System.out.println("\n Digite o número desejado: ");
			al = input.nextInt();
			
			
			switch(al) {
			
			case 1:
				input.nextLine();
				System.out.println("\n Digite seu nome: ");
				String nome	= input.nextLine();
				cliente.add(nome);
				System.out.println("\n Cliente adicionado com sucesso!");
				break;
				
			case 2: 
				input.hasNextLine();
				System.out.println("Lista de clientes aguardando: ");
				for (Iterator<String> it = cliente.iterator(); it.hasNext();) {
					System.out.println(it.next());
				} 
				break;
				
			case 3: 
				input.nextLine();
				if(cliente.isEmpty() == true) {
					System.out.println("A fila está vazia");
				}else {
					System.out.printf("O cliente %s já foi chamado", cliente.poll());
					System.out.println("Clientes: ");
						for (Iterator<String> it = cliente.iterator(); it.hasNext();) {
							System.out.println(it.next());
						}
						
				}
				break;
				
			case 0:
				System.out.println("Fim do programa!");
				break;
				
				default:
					System.out.println("Digite um número válido");
			}


		}while(al !=0);
	}

}
