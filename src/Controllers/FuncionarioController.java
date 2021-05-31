package Controllers;

import Models.Funcionario;
import java.util.ArrayList;

public class FuncionarioController {

	private static ArrayList<Funcionario> funcionarios  = new ArrayList<>();

	public static boolean cadastrar(Funcionario func){
		for(Funcionario funcionarioCadastrado: funcionarios){
			if (funcionarioCadastrado.getCpf().equals(func.getCpf())){
				return false;
			}

		}
		funcionarios.add(func);
		return true;
	}

	public static Funcionario buscarPorCpf(String cpf){
		for(Funcionario funcCadastrado: funcionarios ){
			if (funcCadastrado.getCpf().equals(cpf)){
				return funcCadastrado;
			}
		}

		return null;    
	}

}
