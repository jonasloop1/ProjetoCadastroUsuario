package br.com.unesa.modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @author Victor Augusto Fonseca da Silva<victorfonsecass@outlook.com>
 * @brief Classe DAO (objeto de acesso a dados).
 * @date 29/09/2020..
 *
 */
public class ClienteDAO {

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection("jdbc:derby://localhost:1527/Cadastro", "MJVG", "MJVG");
    }

    private void closeConnection(Connection cx) {
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Erro de exceção SQL-close");
        }
    }

    public void incluir(Cliente client) {
        Connection cx1 = null;
        try {
            cx1 = getConnection();
            PreparedStatement st = cx1.prepareStatement(
                    "INSERT INTO CADASTRO VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setInt(1, client.getId());
            st.setString(2, client.cpf);
            st.setString(3, client.nome);
            st.setString(4, client.idade);
            st.setString(5, client.email);
            st.setString(6, client.sexo);
            st.setString(7, client.profissao);
            st.setString(8, client.formacao);
            st.setString(9, client.habilitacao);
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro de exceção.-incluir");
        } finally {
            closeConnection(cx1);
        }
    }

    public List<Cliente> listar() {
        ArrayList<Cliente> listaCliente = new ArrayList();
        Connection cx1 = null;

        try {
            cx1 = getConnection();
            Statement estado = cx1.createStatement();
            ResultSet resultado = estado.executeQuery("SELECT * FROM CADASTRO");
            while (resultado.next()) {
                listaCliente.add(new Cliente(
                        resultado.getInt(1), resultado.getString(2), resultado.getString(3),
                        resultado.getString(4), resultado.getString(5), resultado.getString(6),
                        resultado.getString(7), resultado.getString(8), resultado.getString(9)));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro de exceção.-listar");
        } finally {
            closeConnection(cx1);
        }
        return listaCliente;
    }

public List<Cliente> buscar() {
        ArrayList<Cliente> buscarCliente = new ArrayList();
        Connection cx1 = null;

        try {
            cx1 = getConnection();
            Statement estado = cx1.createStatement();
            ResultSet resultado = estado.executeQuery("SELECT ID FROM CADASTRO");
            while (resultado.next()) {
                buscarCliente.add(new Cliente(
                        resultado.getInt(1), resultado.getString(2), resultado.getString(3),
                        resultado.getString(4), resultado.getString(5), resultado.getString(6),
                        resultado.getString(7), resultado.getString(8), resultado.getString(9)));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro de exceção.-Buscar");
        } finally {
            closeConnection(cx1);
        }
        return buscarCliente;
    }

    public void alterar(Cliente client) {
        Connection cx1 = null;
        try {
            cx1 = getConnection();
            PreparedStatement st = cx1.prepareStatement(
                    "UPTADE CADASTRO SET CPF=?, NOME=?, IDADE=?, EMAIL=?, SEXO=?, PROFISSAO=?, FORMACAO=?, HABILITACAO=? WHERE ID=?");

            st.setString(1, client.getCpf());
            st.setString(2, client.getNome());
            st.setString(3, client.getIdade());
            st.setString(4, client.getEmail());
            st.setString(5, client.getSexo());
            st.setString(6, client.getProfissao());
            st.setString(7, client.getFormacao());
            st.setString(8, client.getHabilitacao());
            st.setInt(9, client.getId());
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro de exceção.-alterar");
        } finally {
            closeConnection(cx1);
        }
    }
}
