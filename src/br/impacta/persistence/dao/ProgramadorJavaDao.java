package br.impacta.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.impacta.persistence.factory.ConnectionFactory;
import br.impacta.model.ProgramadorJava;


public class ProgramadorJavaDao {

public boolean salvaNoBanco(ProgramadorJava programadorJava) {
		
		boolean salvo;
	
		String sql = "INSERT INTO programador_java (matricula, nome, salario, certificacao_oracle) VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.criaConexaoComMySql();
			
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(1,programadorJava.getMatricula());
			pstm.setString(2,programadorJava.getNome());
			pstm.setDouble(3,programadorJava.getSalario());
			pstm.setString(4,programadorJava.getCertificacaoOracle());
		
			
			pstm.execute();
			
			System.out.println("Programador Java Salvo com Sucesso!!");
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


	public List<ProgramadorJava> BuscarListaProgramadorJava(){
	
		String sql = "SELECT * FROM programador_java";
		List<ProgramadorJava> programadoresJava = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.criaConexaoComMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = 	pstm.executeQuery();
			
			while(rset.next()) {
				ProgramadorJava programadorJava = new ProgramadorJava();
				
				
				
				programadorJava.setMatricula(rset.getString("matricula"));
				programadorJava.setNome(rset.getString("nome"));
				programadorJava.setSalario(rset.getDouble("salario"));
				programadorJava.setCertificacaoOracle(rset.getString("certificacao_oracle"));
				
				programadoresJava.add(programadorJava);
		
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
		
		return programadoresJava;
	
	}
	
	public boolean deletarPelaMatricula(String matricula) {
		String sql = "DELETE FROM programador_java WHERE matricula = ?";
		
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
	
	
	public boolean alterarProgramadorJavaNoBanco(ProgramadorJava programadorJava) {
		String sql = "UPDATE programador_java SET matricula = ?,nome = ?, salario = ?, certificacao_oracle = ?  WHERE matricula = ? ";
	
		boolean alterado = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.criaConexaoComMySql();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, programadorJava.getMatricula());
			pstm.setString(2, programadorJava.getNome());
			pstm.setDouble(3, programadorJava.getSalario());
			pstm.setString(4, programadorJava.getCertificacaoOracle());
		
			
			pstm.setString(5, programadorJava.getMatricula());
			
			
			
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
