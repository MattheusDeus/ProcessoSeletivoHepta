package br.com.hepta.funcionarios.entity;

public class SetorFinanceiro {

	private String funcao;
	private String cargo;
	private String genero;
	private Double salario;
	private String email;
	

	
	public final String getCargo() {
		return cargo;
	}
	public final void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public final String getGenero() {
		return genero;
	}
	public final void setGenero(String genero) {
		this.genero = genero;
	}
	
	public final String getFuncao() {
		return funcao;
	}
	public final void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public final Double getSalario() {
		return salario;
	}
	public final void setSalario(Double salario) {
		this.salario = salario;
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public String mostrarAtributos() {
		return "Você está no setor Financeiro "; 
	}

}
