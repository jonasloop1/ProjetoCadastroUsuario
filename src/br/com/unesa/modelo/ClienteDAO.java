package br.com.unesa.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @author Victor Augusto Fonseca da Silva<victorfonsecass@outlook.com>
 * @brief  Classe DAO (objeto de acesso a dados).
 * @date 29/09/2020
 * oi ioioi
 */
public class ClienteDAO {
    private Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    return DriverManager.getConnection("jdbc:derby://localhost:1527/Cadastro","MJVG","MJVG");
    }
    
    private void closeConnection(Connection cx){
        try{
            cx.close();
        }catch(SQLException ex){
            System.out.println("Erro de exceção SQL");
        }
    }
}
