/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Cadastro;
import classes.ClassesFornecedor;
import dao.Conecta;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class CadastroDAO {

    public String gravarpeca(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO placa_mae(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarVideo(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO placa_video(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarprocessador(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO processador(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarMemoriaRam(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO memoria_ram(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarFonte(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO Fonte(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarGabinete(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO Gabinete(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarMouse(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO mouse(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarTeclado(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO teclado(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public String gravarMonitor(Cadastro cadastro) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "INSERT INTO monitor(num_serie,cod_fornecedor,nm_nome,pc_preco,da_tec) ";
            sql += "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());
            ps.setString(2, cadastro.getCod_Fornecedor());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getPreco());
            ps.setString(5, cadastro.getDados_tec());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    public Cadastro buscaPlacaMae(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM placa_mae WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaPlacaDeVideo(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM placa_video WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaProcessador(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM processador WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaMemoriaRam(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM memoria_ram WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaFonte(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM fonte WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaGabinete(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM gabinete WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaMouse(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM mouse WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaTeclado(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM teclado WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public Cadastro buscaMonitor(String NUM_SERIE) {
        Cadastro cadastro = new Cadastro();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM monitor WHERE Num_Serie=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NUM_SERIE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("COD_FORNECEDOR"));
                cadastro.setNome(rs.getString("NM_NOME"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));

            } else {
                cadastro = null;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            cadastro = null;

        }

        return cadastro;

    }

    public String excluirPlacaMae(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM placa_mae WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String excluimemoriaRam(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM memoria_ram WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String excluirplacadevideo(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM placa_video WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String excluiprocessadore(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM processador WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String excluirfonte(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM fonte WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String excluirgabinete(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM gabinete WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String excluirmouse(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM mouse WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;
    }

    public String excluirteclado(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM teclado WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;
    }

    public String excluirmonitor(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "DELETE FROM monitor WHERE Num_serie = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;
    }

    public String alteraPlacaMae(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE placa_mae SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraPlacaDeVideo(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE placa_video SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraProcessador(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE processador SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraMemoriaRam(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE memoria_ram SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraFonte(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE Fonte SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraGabinete(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE gabinete SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraMouse(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE mouse SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraTeclado(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE teclado SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public String alteraMonitor(Cadastro cadastro) {
        String resp = "";

        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "UPDATE monitor SET  nm_nome = ?,pc_preco = ?,da_tec = ? ";
            sql += "WHERE num_serie = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getPreco());
            ps.setString(3, cadastro.getDados_tec());
            ps.setString(4, cadastro.getSerie());

            ps.execute();
            ps.close();
            con.close();

            resp = "OK";

        } catch (SQLException e) {
            resp = "Ops, algo saiu errado." + e.toString();

        }

        return resp;

    }

    public ArrayList<Cadastro> listaPecas() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM placa_mae ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public ArrayList<Cadastro> listaProcessador() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM processador ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public ArrayList<Cadastro> listaPlacaVideo() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM placa_video ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public ArrayList<Cadastro> listaMemoriaRam() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM Memoria_ram ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public ArrayList<Cadastro> listaFonte() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM fonte ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public ArrayList<Cadastro> listaMouse() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM mouse ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public ArrayList<Cadastro> listaTeclado() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM teclado ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public ArrayList<Cadastro> listaMonitor() {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "SELECT * FROM monitor ORDER BY num_serie";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cadastro cadastro = new Cadastro();
                cadastro.setSerie(rs.getString("NUM_SERIE"));
                cadastro.setCod_Fornecedor(rs.getString("Cod_Fornecedor"));
                cadastro.setNome(rs.getString("NM_Nome"));
                cadastro.setPreco(rs.getString("PC_PRECO"));
                cadastro.setDados_tec(rs.getString("DA_TEC"));
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

    public String dadosPlacaMae(Cadastro cadastro, ClassesFornecedor fornecedor) {
        String resp = "";
        try {
            Connection con = dao.Conecta.getConexao();
            String sql = "Select nome_fornecedor,num_serie,pc_preco From placa_mae m ";
            sql += "Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNome_fornecedor());
            ps.setString(2, cadastro.getSerie());
            ps.setString(3, cadastro.getPreco());

            ps.execute();

            ps.close();
            con.close();

            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    

}
