package br.com.hepta.funcionario.teste;

import java.sql.Connection;

import br.com.hepta.conexao.Conexao;
import br.com.hepta.funcionarios.entity.Funcionario;
import br.com.hepta.funcionarios.persistence.FuncionarioDAO;

public class FuncionarioServiceTestDelete {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();

		Funcionario funcionario = new Funcionario();
		FuncionarioDAO funcionariodao = new FuncionarioDAO(con);
		
		funcionario.setNome("Matheus de Deus ");
		
		
		System.out.println(funcionariodao.deletarDois(funcionario));

		Conexao.fecharConexao(con);


	}

}
