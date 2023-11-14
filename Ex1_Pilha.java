package Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Ex1_Pilha {

	public static void main(String[] args) {
			
		Stack<String> livros = new Stack<String>();
		
		Scanner input = new Scanner (System.in);
		
		for (int i=0; i<livros.size(); i++);
		
		int qnt;		
		do {
			
			System.out.println("\n\t\t LIVRARIA PESSOAL");
			System.out.println("\n(1) Adicione um novo livro a estante: ");
			System.out.println("\n(2) Liste todos os títulos: ");
			System.out.println("\n(3) Retirar livro da estante: ");
			System.out.println("\n(0) Sair da estante virtual: ");
			qnt = input.hashCode();
			
			switch(qnt) {
				 
			case 1:
				input.nextLine();
				System.out.println("Adicione um título: ");
				String titulo = input.nextLine();
				livros.push(titulo);
				if (titulo.isEmpty() == true) {
					System.out.println("Título adicionada");
				} else {
					System.out.println("Erro ao adicionat título");
				}
					break;
				
			case 2: 
				input.hasNext();
				System.out.println("Liste todos os títulos");
				System.out.println(livros);
				
			break;
				
			case 3: 
				input.nextLine();
				if (livros.isEmpty()) {
					String livroRmv = livros.pop();
					System.out.println("O título"+livroRmv+"foi removido");
				}else {
					System.out.println("A estante está vazia");
				}
				break;
				
			case 0: 
				System.out.println("\n A estante foi fechada");
				break;
				
				default:
					System.out.println("Opção inválida, tente novamente");
					
					break;
					
			}
			
		}while(qnt !=0);
				
				
			
			
				
		}

		

			
	
	}
