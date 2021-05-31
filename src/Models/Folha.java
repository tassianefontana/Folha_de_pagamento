package Models;

public class Folha {
	
	 private Funcionario func;
	    private int mes;
	    private int ano;
	    private int horasTrab;
	    private double valorHora;

	    public Funcionario getFunc() {
	        return func;
	    }

	    public void setFunc(Funcionario func) {
	        this.func = func;
	    }

	    public int getMes() {
	        return mes;
	    }

	    public void setMes(int mes) {
	        this.mes = mes;
	    }

	    public int getAno() {
	        return ano;
	    }

	    public void setAno(int ano) {
	        this.ano = ano;
	    }

	    public int getHorasTrab() {
	        return horasTrab;
	    }

	    public void setHorasTrab(int horasTrab) {
	        this.horasTrab = horasTrab;
	    }

	    public double getValorHora() {
	        return valorHora;
	    }

	    public void setValorHora(double valorHora) {
	        this.valorHora = valorHora;
	    }

	    @Override
	    public String toString() {
	        return "Folha{" + "func=" + func + ", mes=" + mes + ", ano=" + ano + ", horasTrab=" + horasTrab + ", valorHora=" + valorHora + '}';
	    }

}
