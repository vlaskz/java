/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Sam Velasquez
 */
public class PessoaFisica {

    private String cpf;

    private boolean validaCPF(String s) {
        return true;

    }

    PessoaFisica(String cpf) {
        String x = this.validaCPF(cpf) ? "pessoa física cadastrada com sucesso!" : "CPF Inválido";
        System.out.println(x);

    }

}
