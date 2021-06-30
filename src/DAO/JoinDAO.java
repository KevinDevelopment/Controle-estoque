/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Cadastro;
import classes.ClasseJoin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class JoinDAO {
    
    
    public ArrayList<ClasseJoin> listaInner() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From placa_mae m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
    public ArrayList<ClasseJoin> listaVideo() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From placa_video m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
    public ArrayList<ClasseJoin> listaProcessador() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From processador m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    public ArrayList<ClasseJoin> listaMemoria() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From memoria_ram m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
    public ArrayList<ClasseJoin> listaFonte() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From fonte m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
    public ArrayList<ClasseJoin> listaGabinete() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From gabinete m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
    public ArrayList<ClasseJoin> listaMouse() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From mouse m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
    public ArrayList<ClasseJoin> listaTeclado() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From teclado m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
    public ArrayList<ClasseJoin> listaMonitor() {
        ArrayList<ClasseJoin> lista = new ArrayList<ClasseJoin>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From monitor m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClasseJoin cadastro = new ClasseJoin();
                cadastro.setCD_frc(rs.getString("NOME_FORNECEDOR"));
                cadastro.setCD_Serie(rs.getString("NUM_SERIE"));
                cadastro.setPeca_preco(rs.getString("PC_PRECO"));

                lista.add(cadastro);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    
}
