/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ConnectionFactory.ConnectionFactory;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Marne
 */
public class PessoaDao {
   
    public void create(Pessoa p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cadastro (nome,nascimento,rg,cpf)VALUES(?,?,?,?) ");
            stmt.setString(1, p.getNome());
            stmt.setString(2, String.valueOf(p.getNascimento()));
            stmt.setString(3, String.valueOf(p.getRg()));
            stmt.setString(4, String.valueOf(p.getCpf()));
            
            stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar: "+ex);
          
            } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
        
       
    }
    
    public List<Pessoa> read(){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        try {
            stmt = con.prepareCall("SELECT * FROM cadastro");
            rs = stmt.executeQuery();
            
       while(rs.next()){
           
           Pessoa pessoa = new Pessoa();
           
           pessoa.setId(rs.getInt("id"));
           pessoa.setNome(rs.getString("nome"));
           pessoa.setNascimento(rs.getString("nascimento"));
           pessoa.setRg(rs.getString("rg"));
           pessoa.setCpf(rs.getString("cpf"));
           pessoas.add(pessoa);
       }
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
      
        return pessoas;
    }
    public List<Pessoa> readForNome(String nome){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        try {
            stmt = con.prepareCall("SELECT * FROM cadastro WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
       while(rs.next()){
           
           Pessoa pessoa = new Pessoa();
           
           pessoa.setId(rs.getInt("id"));
           pessoa.setNome(rs.getString("nome"));
           pessoa.setNascimento(rs.getString("nascimento"));
           pessoa.setRg(rs.getString("rg"));
           pessoa.setCpf(rs.getString("cpf"));
           pessoas.add(pessoa);
       }
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
      
        return pessoas;
    }
    
    public void update(Pessoa p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cadastro SET nome = ?,nascimento = ?,rg = ?,cpf = ? WHERE id = ?");
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getNascimento());
            stmt.setString(3,p.getRg());
            stmt.setString(4,p.getCpf());
            stmt.setInt(5,p.getId());
            
            //stmt.executeUpdate();
            stmt.execute();
            
                JOptionPane.showMessageDialog(null, "Atualizado com Sucesso Nome: " + p.getNome() + " ID: " + String.valueOf(p.getId()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Atualizar: "+ex);
          
            } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }   

    /**
     *
     * @param p
     */
    public void delete(Pessoa p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cadastro WHERE id = ?");
            stmt.setInt(1,p.getId());
            
            stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir: "+ex);
          
            } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }   


}
    
