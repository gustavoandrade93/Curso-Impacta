package br.impacta.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.impacta.persistence.factory.ConnectionFactory;
import br.impacta.model.ProgramadorPhp;


public class ProgramadorPhpDao {

public boolean salvaNoBanco(ProgramadorPhp programadorPhp) {
		
		boolean salvo;
	
		String sql = "INSERT INTO programador_php (matricula, nome, salario, certificacao_php) VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.criaConexaoComMySql();
			
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(1,programadorPhp.getMatricula());
			pstm.setString(2,programadorPhp.getNome());
			pstm.setDouble(3,programadorPhp.getSalario());
			pstm.setString(4,programadorPhp.getCertificacaoPhp());
			
			
			pstm.execute();
			
			System.out.println("ProgramadorPhpDao Salvo com Sucesso!!");
			salvo = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro na DAO - SALVAR");
			salvo = false;
		}finally {
			
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
					
				}
			}catch(Exception e){
				
				e.printStackTrace();
				
			}
			
		}
		
		return salvo;
		
	}


	public List<ProgramadorPhp> BuscarListaProgramadorPhp(){
	
		String sql = "SELECT * FROM programador_php";
		List<ProgramadorPhp> programadoresPhp = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.criaConexaoComMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = 	pstm.executeQuery();
			
			while(rset.next()) {
				ProgramadorPhp programadorPhp = new ProgramadorPhp();
				
				
				
				programadorPhp.setMatricula(rset.getString("matricula"));
				programadorPhp.setNome(rset.getString("nome"));
				programadorPhp.setSalario(rset.getDouble("salario"));
				programadorPhp.setCertificacaoPhp(rset.getString("certificacao_php"));
				
				programadoresPhp.add(programadorPhp);
		
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu problema no listar!!");
		}finally {
			
			 
				try {
					if(rset != null) {
						rset.close();
					}
					
					if(pstm != null) {
						pstm.close();
					}
					
					if(conn != null) {
						conn.close();
					}
					
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
		}
		
		return programadoresPhp;
	
	}
	
	public boolean deletarPelaMatricula(String matricula) {
		String sql = "DELETE FROM programador_php WHERE matricula = ?";
		
		boolean deletado = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.criaConexaoComMySql();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, matricula);
			pstm.execute();
			deletado = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro no deletar.");
		}finally {
			try {
				if(pstm != null) {
					pstm.close();	
				}
				
				if(conn != null) {
					conn.close();	
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Deu erro na hora de fechar conexão");
			}
			
			
		}
		return deletado;
		
		
	}
	
	
	public boolean alterarProgramadorPhpNoBanco(ProgramadorPhp programadorPhp) {
		String sql = "UPDATE programador_php SET matricula = ?,nome = ?, salario = ?, certificacao_php = ?  WHERE matricula = ? ";
	
		boolean alterado = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.criaConexaoComMySql();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, programadorPhp.getMatricula());
			pstm.setString(2, programadorPhp.getNome());
			pstm.setDouble(3, programadorPhp.getSalario());
			pstm.setString(4, programadorPhp.getCertificacaoPhp());
		
			
			pstm.setString(5, programadorPhp.getMatricula());
			
			
			
			pstm.execute();
			alterado = true;
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro no UPDATE");
		}finally {
			try {
				if(pstm != null) {
					pstm.close();	
				}
				
				if(conn != null) {
					conn.close();	
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Deu erro na hora de fechar conexão");
			}
			
			
		}
		return alterado;
		
	}
	
	
	
	
	
	
}
