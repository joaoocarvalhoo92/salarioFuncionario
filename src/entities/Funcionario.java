package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double aumento;
	
	


	public double  salarioBruto() {
	return  salarioBruto - imposto;
	
	}
	
	public double aumento (double percentage) {
		return salarioBruto += salarioBruto * percentage / 100.0;
	}
	
	public String toString() {
		return nome 
		+ ", $ "
		+ String.format("%.2f",salarioBruto());
	}
}
	


