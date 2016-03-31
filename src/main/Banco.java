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
public class Banco {

    protected Conta[] contas;

    public Banco() {
        this.contas = new Conta[1]; /*TODO: recode to no args*/
    }

    public Banco(int n) {
        this.contas = new Conta[n];

    }

    public void addConta(Conta conta) {
        Ferramentas fer = new Ferramentas();
        contas = fer.avaliarArray(contas);
        contas[fer.posLivreArray(contas)] = conta;

    }

    public Conta getConta(int i) {
        return this.contas[i];
    }
    
    public void resumo(){
        for(Conta c:contas){
            c.resumoConta();
        }
    }

}
