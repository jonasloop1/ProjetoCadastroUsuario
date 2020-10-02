package br.com.unesa.controle;

import br.com.unesa.modelo.Cliente;
import br.com.unesa.modelo.ClienteDAO;
import java.util.List;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @author Victor Augusto Fonseca da Silva<victorfonsecass@outlook.com>
 * @brief  Faz o controle dos usuarios
 * @date 29/09/2020
 */
public class ControleCliente {
    private ClienteDAO Cdao = new ClienteDAO();
    
    public void incluir(Cliente client){
        Cdao.incluir(client);
    }
    
    public List<Cliente> ObterListar(){
       return Cdao.listar();
    }
}
