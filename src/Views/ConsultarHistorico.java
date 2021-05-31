package Views;

import Controllers.FolhaController;
import Models.Folha;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsultarHistorico {

	private static int mes, ano;
	private static Scanner print = new Scanner(System.in);
	private static ArrayList<Folha> folhasData = new ArrayList<>();
	private static double salarioBruto,iRenda, inss, fgts, salarioLiquido, somaSalarios;

	public static void renderizar(){
		System.out.println("Digite o m�s desejado:");
		mes = print.nextInt();
		System.out.println("Digite o ano desejado:");
		ano = print.nextInt();
		folhasData = FolhaController.buscarFolhaData(ano, mes);

		if (folhasData != null){
			for(Folha folhaCadastrada: folhasData) {
				
				salarioBruto = FolhaController.SalarioBruto(folhaCadastrada.getHorasTrab(),folhaCadastrada.getValorHora());
				
				iRenda = FolhaController.ImpostoRenda(salarioBruto);

				inss = FolhaController.inss(salarioBruto);

				fgts = FolhaController.fgts(salarioBruto);

				salarioLiquido = FolhaController.salarioLiquido(salarioBruto, iRenda, inss);
				
				System.out.print("\n".repeat(2));
				System.out.println(folhaCadastrada.getFunc().getNome());
				System.out.println(folhaCadastrada.getMes()+"/"+folhaCadastrada.getAno());
				System.out.println("Sal�rio bruto: " + salarioBruto);
				System.out.print("Valor do imposto de renda: " + iRenda);  
				System.out.print("\nValor do INSS: " + inss); 
				System.out.print("\nValor do FGTS: "+ fgts); 
				System.out.print("\nValor do sal�rio l�quido: " + salarioLiquido); 

				somaSalarios += salarioLiquido;
			}
			 System.out.print("\n".repeat(2));
			 System.out.print("Soma sal�rios l�quidos: " + somaSalarios);
			 
		}else{
			System.out.println("N�o existem folhas cadastradas neste per�odo");
		}


	}

}
