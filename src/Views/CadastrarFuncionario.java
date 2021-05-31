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
		System.out.println("Digite o nome do funcion�rio");
		func.setNome(print.next());  
		System.out.println("Digite o cpf do funcion�rio");
		func.setCpf(print.next());
		//System.out.println("Digite a data de nascimento do funcion�rio no formato dia/m�s/ano");
		//dataAniversario = print.next();
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		//Date data = formatter.parse(dataAniversario);
	    //func.setDataNascimento(data);

		if (FuncionarioController.cadastrar(func)){
			System.out.println("Funcion�rio cadastrado com sucesso");
		}else{
			System.out.println("Funcion�rio existente");
		}
	}

}
