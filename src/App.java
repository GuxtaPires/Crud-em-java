import java.util.Scanner;

public class App{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner(System.in);
	int resp;

	System.out.println("Olá! Qual seria o tamanho da sua lista?");
	int tamanhoLista = sc.nextInt();

	ListaDeNumeros lista1 = new ListaDeNumeros (tamanhoLista);
	do{

		System.out.println("==============================");
		System.out.println("Interface para manipular fila:");
		System.out.println("1 - inserir dado");
		System.out.println("2 - deletar dado");
		System.out.println("3 - Listar dados");
		System.out.println("0 - Sair do programa");
		System.out.println("==============================");

		resp = sc.nextInt();

		switch (resp) {
		case 1:
			System.out.print("Digite o valor a ser inserido: ");
			int valorInserir = sc.nextInt();
			lista1.inserir(valorInserir);
			System.out.println("==============================");
			break;
		
		case 2:
			System.out.print("Digite o valor a ser deletado: ");
			int valorDeletado = sc.nextInt();
			lista1.deletar(valorDeletado);
			System.out.println("==============================");
			break;
		
		case 3:
			System.out.println("Sua lista:");
			lista1.listar();
			System.out.println("==============================");
			break;

		default:
			break;
		}
	}while (resp != 0);
  }
}

