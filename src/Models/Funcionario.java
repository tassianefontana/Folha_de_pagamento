package Models;

import java.util.Date;

public class Funcionario {

	 private String nome;
	    private String cpf;
	    private Date dataNascimento;

	     
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public Date getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(Date dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    @Override
	    public String toString() {
	        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + '}';
	    }
}
