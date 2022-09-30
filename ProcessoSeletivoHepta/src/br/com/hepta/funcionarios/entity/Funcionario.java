package br.com.hepta.funcionarios.entity;

public class Funcionario extends SetorFinanceiro {

	private int id;
	private String nome;
	private int cpf;
	private String setor;
	private String endereco;

	public final String getEndereco() {
		return endereco;
	}

	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public final int getCpf() {
		return cpf;
	}

	public final void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getSetor() {
		return setor;
	}

	public final void setSetor(String setor) {
		this.setor = setor;
	}

}
