/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.ClassesFornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class FornecedorDAO {
    
    //a partir daqui, começa o CRUD para a tabela fornecedor
    
    public String excluirpecaFornecedor(ClassesFornecedor fornecedor) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM fornecedor WHERE Cod_fornecedor = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getCod_fornecedor());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }
    
    public String AlterarpecaFornecedor(ClassesFornecedor fornecedor) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE fornecedor set Cod_fornecedor = ?,nome_fornecedor = ? ";
            sql+= "WHERE Cod_fornecedor = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getCod_fornecedor());
            ps.setString(2, fornecedor.getNome_fornecedor());
            ps.setString(3, fornecedor.getCod_fornecedor());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }
    
    public String gravarFornecedor(ClassesFornecedor fornecedor) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO FORNECEDOR(cod_fornecedor,nome_fornecedor) ";
            sql += "VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getCod_fornecedor());
            ps.setString(2, fornecedor.getNome_fornecedor());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
    
    public ClassesFornecedor PesquisaFornecedor(String Cod_fornecedor) {
 ClassesFornecedor fornecedor = new ClassesFornecedor();
 try {
 Connection con = dao.Conecta.getConexao();
 String sql = "SELECT * FROM fornecedor WHERE COD_FORNECEDOR = ?";
 PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1, Cod_fornecedor);
 ResultSet rs = ps.executeQuery();
 if (rs.next()) {
 
 fornecedor.setNome_fornecedor(rs.getString("NOME_FORNECEDOR"));
 
 } else {
 fornecedor = null;
 }
 rs.close();
 ps.close();
 con.close();
 } catch (Exception e) {
 fornecedor = null;
 }
 return fornecedor;
 }//termino dos metodos da tabela fornecedor
    
}
