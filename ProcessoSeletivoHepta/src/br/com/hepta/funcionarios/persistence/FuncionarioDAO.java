package br.com.hepta.funcionarios.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.hepta.funcionarios.entity.Funcionario;


public class FuncionarioDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public FuncionarioDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Funcionario funcionario) {
		String sql = "insert into funcionario (funcao,cargo,genero,salario,email,id,nome,cpf, setor, endereco) "
				+ "values (?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getFuncao());
			ps.setString(2, funcionario.getCargo());
			ps.setString(3, funcionario.getGenero());
			ps.setDouble(4, funcionario.getSalario());
			ps.setString(5, funcionario.getEmail());
			ps.setInt(6, funcionario.getId());
			ps.setString(7, funcionario.getNome());
			ps.setInt(8, funcionario.getCpf());
			ps.setString(9, funcionario.getSetor());
			ps.setString(10,funcionario.getEndereco());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	/**
	 * 
	 * Metodo feito para deletar toda a tabela 
	 *
	 */
	public String deletar(Funcionario funcionario) {
		String sql = "delete from where funcionario";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	/**
	 * 
	 * metodo para deletar determinado nome da tabela
	 * 
	 */
	public String deletarDois(Funcionario funcionario) {
		String sql = "delete from funcionario where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}


	

	public String alterar(Funcionario funcionario) {
		String sql = "update funcionario set endereco= ? where nome = ?" ;
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getEndereco());
			ps.setString(2, funcionario.getNome());
			
		
		
			
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
