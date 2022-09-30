package br.com.hepta.funcionario.teste;

import java.sql.Connection;

import br.com.hepta.conexao.Conexao;
import br.com.hepta.funcionarios.entity.Funcionario;

import br.com.hepta.funcionarios.persistence.FuncionarioDAO;

public class FuncionarioServiceTestInsert {

	public static  void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		
		Funcionario funcionario = new Funcionario();
		FuncionarioDAO funcionariodao = new FuncionarioDAO(con);
		
		
		funcionario.setFuncao("Desenvolver programas na Hepta");
		funcionario.setCargo("Diretoria");
		funcionario.setGenero("masculino");
		funcionario.setSalario(12.000);
		funcionario.setEmail("matheusmeris05@outlook.com");
		funcionario.setId(4502);
		funcionario.setNome("Giulyah Araujo ");
		funcionario.setCpf(523935358);
		funcionario.setSetor("Desenvolvimento Back-end");
		funcionario.setEndereco("Rua Irmao Nicolau da Fonseca 272");
		
			System.out.println(funcionariodao.inserir(funcionario));
			
			Conexao.fecharConexao(con);
		}
				
}