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
public class Casa {
     String cor;
    Porta[] porta;

    Casa(int i) {
        porta = new Porta[i];
    }

    void pintar(String s) {
        this.cor = s;
    }

    int quantasPortasEstaoAbertas() {
        int i, k = 0;
        for (i = 0; i < this.porta.length; i++) {
            if (porta[i] != null && this.porta[i].estaAberta()) {

                k++;
            }
        }
        return k;
    }

    void adicionarPorta(Porta p) {
        int i;
        for (i = 0; i < this.porta.length; i++) {
            if (porta[i] == null) {
                porta[i] = p;
                break;

            }
        }

    }

    int totalDePortas() {
        int i, k = 0;
        for (i = 0; i < this.porta.length; i++) {
            if (porta[i] != null) {
                k++;
            }
        }
        return k;
    }

    void resumo() {
        System.out.println("portas abertas:" + this.quantasPortasEstaoAbertas());
        System.out.println("total de portas:" + this.totalDePortas());
    }
    
}
