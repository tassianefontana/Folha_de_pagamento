package Views;

import Controllers.FolhaController;
import Controllers.FuncionarioController;
import Models.Folha;
import Models.Funcionario;
import java.util.Scanner;

public class CadastrarFolha {

	private static Scanner print = new Scanner(System.in);
	private static Folha folha;
	private static String cpf;
	private static Funcionario func;

	public static void renderizar(){
		folha = new Folha();
		System.out.println("Digite o cpf do funcionário");
		cpf = print.next();
		func = FuncionarioController.buscarPorCpf(cpf);
		if(func != null){
			folha.setFunc(func);
			System.out.println("digite o mês da folha de pagamento");
			folha.setMes(print.nextInt());
			System.out.println("Digite o ano da folha de pagamento");
			folha.setAno(print.nextInt());
			System.out.println("Digite o número de horas trabalhadas");
			folha.setHorasTrab(print.nextInt());
			System.out.println("Digite o valor da hora");
			folha.setValorHora(print.nextDouble());

		}else {
			System.out.println("Funcionário inexistente. Por favor, insira um funcionário existente");
		}

		if(FolhaController.cadastrar(folha)){
			System.out.println("Folha cadastrada com sucesso");
		} else{
			System.out.println("A folha de pagamento já existe!" );
		}

	}

}
