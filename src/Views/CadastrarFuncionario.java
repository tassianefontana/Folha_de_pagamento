package Views;


import Controllers.FuncionarioController;
import Models.Funcionario;
import java.util.Scanner;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;


public class CadastrarFuncionario {

	private static Scanner print = new Scanner(System.in);
	private static Funcionario func;
	private static String dataAniversario;
		
	public static void renderizar(){
		func = new Funcionario();
		System.out.println("Digite o nome do funcionário");
		func.setNome(print.next());  
		System.out.println("Digite o cpf do funcionário");
		func.setCpf(print.next());
		//System.out.println("Digite a data de nascimento do funcionário no formato dia/mês/ano");
		//dataAniversario = print.next();
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		//Date data = formatter.parse(dataAniversario);
	    //func.setDataNascimento(data);

		if (FuncionarioController.cadastrar(func)){
			System.out.println("Funcionário cadastrado com sucesso");
		}else{
			System.out.println("Funcionário existente");
		}
	}

}
