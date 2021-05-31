package Views;

import Controllers.FolhaController;
import Models.Folha;
import java.util.Scanner;

public class ConsultarFolha {

	private static Scanner print = new Scanner(System.in);
	private static Folha folha;
	private static String cpf;
	private static int ano, mes;
	private static double salarioBruto,iRenda, inss, fgts, salarioLiquido;

	public static void renderizar(){
		System.out.println("Digite o cpf do funcion�rio");
		cpf = print.next();
		System.out.println("Digite o ano correspondente a folha");
		ano = print.nextInt();
		System.out.println("Digite o m�s correspondente a folha");
		mes = print.nextInt();
		folha = FolhaController.buscarFolha(cpf, ano, mes);

		if(FolhaController.buscarFolha(cpf, ano, mes) != null){
			
			salarioBruto = FolhaController.SalarioBruto(folha.getHorasTrab(),folha.getValorHora());
			
			//Imposto de Renda
			iRenda = FolhaController.ImpostoRenda(salarioBruto);

			//INSS
			inss = FolhaController.inss(salarioBruto);

			//FGTS

			fgts = FolhaController.fgts(salarioBruto);

			//Sal�rio l�quido

			salarioLiquido = FolhaController.salarioLiquido(salarioBruto, iRenda, inss);
			
			System.out.println("Nome: " + folha.getFunc().getNome());
			System.out.println("Sal�rio bruto: " + salarioBruto);
			System.out.print("Valor do imposto de renda: " + iRenda);  
			System.out.print("\nValor do INSS: " + inss); 
			System.out.print("\nValor do FGTS: "+ fgts); 
			System.out.print("\nValor do sal�rio l�quido: " + salarioLiquido); 



		} else{

			System.out.println("Folha de pagamento n�o encontrada");
		}

	}

}
