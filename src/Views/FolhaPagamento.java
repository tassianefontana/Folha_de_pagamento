package Views;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner print = new Scanner(System.in);    
		int op;


		do{

			System.out.println("\n");
			System.out.println("-- FOLHA DE PAGAMENTO --");
			System.out.println("Digite uma op��o:");
			System.out.println("1 - Cadastrar funcion�rio");
			System.out.println("2 - Cadastrar folha de pagamento");
			System.out.println("3 - Consultar folha de pagamento");
			System.out.println("4 - Consultar hist�rico de folhas de pagamento do m�s");
			System.out.println("0 - Sair");

			op = print.nextInt();

			switch (op){
			case 1: 
				CadastrarFuncionario.renderizar();


				break;
			case 2:
				CadastrarFolha.renderizar();

				break;
			case 3:
				ConsultarFolha.renderizar();
				break;
			case 4:
				ConsultarHistorico.renderizar();
				
				break;
			case 0:
				System.out.println("Aplica��o finalizada!");
				break;
			default: 
				System.out.println("Digite um n�mero v�lido");
				break;
			}
		}while (op != 0);
		print.close();
	}

}
