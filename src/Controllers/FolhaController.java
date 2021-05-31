package Controllers;

import Models.Folha;
import java.util.ArrayList;

public class FolhaController {

	private static ArrayList<Folha> folhasPag = new ArrayList<>();

	public static boolean cadastrar (Folha folha){
		for(Folha folhaCadastrada: folhasPag){
			if((folhaCadastrada.getAno() == (folha.getAno()) && (folhaCadastrada.getMes() == (folha.getMes()) && (folhaCadastrada.getFunc().equals(folha.getFunc()))))){
				return false;
			}

		} 

		folhasPag.add(folha);
		return true;

	}  

	public static Folha buscarFolha(String cpf, int ano, int mes){
		for(Folha folhaCadastrada:folhasPag){
			if((folhaCadastrada.getFunc().getCpf().equals(cpf) && (folhaCadastrada.getAno() == (ano) && (folhaCadastrada.getMes() == (mes))))){
				return folhaCadastrada;
			}

		}
		return null;

	}

	public static ArrayList<Folha> buscarFolhaData(int ano, int mes){
		ArrayList<Folha> folhasData = new ArrayList<>();       
		for(Folha folhaCadastrada:folhasPag){
			if(((folhaCadastrada.getAno() == (ano) && (folhaCadastrada.getMes() == (mes))))){
				folhasData.add(folhaCadastrada);
			}

		}
		if (folhasData.size() > 0){
			return folhasData;
		}else{
			return null;
		}

	}
	

	public static double SalarioBruto (int horasTrabalhadas, double valorHora) {
		
		return horasTrabalhadas * valorHora;
		
	}
	
	public static double ImpostoRenda(double salarioBruto){
		if(salarioBruto <= 1903.98){
			return 0;
		}else if(salarioBruto <= 2826.65){
			return (0.075 * salarioBruto) - 142.80;
		}else if(salarioBruto <= 3751.05){
			return (0.15 * salarioBruto) - 354.80;
		}else if(salarioBruto <= 4664.68){
			return (0.225 * salarioBruto) - 636.13;
		} else{
			return (0.275 * salarioBruto) - 869.36;
		}
	}

	public static double inss (double salarioBruto){
		if(salarioBruto <= 1693.72){
			return 0.08 * salarioBruto;
		}else if(salarioBruto <= 2822.90){
			return 0.09 * salarioBruto; 
		} else if(salarioBruto <= 5645.80){
			return 0.011 * salarioBruto; 
		} else{
			return 621.03;
		}
	}

	public static double fgts( double salarioBruto){
		return salarioBruto * 0.08;
	}

	public static double salarioLiquido( double salarioBruto, double iRenda, double inss){
		return salarioBruto - iRenda - inss;
	}

	

}
