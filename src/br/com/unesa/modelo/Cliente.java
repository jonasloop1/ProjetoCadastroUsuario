package br.com.unesa.modelo;

/**
 *
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @author Victor Augusto Fonseca da Silva<victorfonsecass@outlook.com>
 * @brief Classe que guarda dados do usuário
 * @date 29/09/2020
 */
public class Cliente {

    private String cpf;
    private String nome;
    private String idade;
    private String email;
    private String sexo;
    private String profissao;
    private String formacao;
    private String habilitacao;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String idade, String email, String sexo, String profissao, String formacao, String habilitacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.sexo = sexo;
        this.profissao = profissao;
        this.formacao = formacao;
        this.habilitacao = habilitacao;
    }//Fiz apenas o construto, fui dormir pq estava cheio de sono, caso contrario, teria feito mais coisas!!!!!!!!!!!!!!!!!
}
