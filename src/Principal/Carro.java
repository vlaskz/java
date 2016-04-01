/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Sam Velasquez
 */
public class Carro {

    Motor motor = new Motor();
    String cor;
    String modelo;
    double vMax;
    double vAtual;

    void ligarCarro() {
        if (this.motor.ativo == true) {
            System.out.println("Carro já está ligado.");
        } else {
            motor.ativo = true;
            System.out.println("Carro ligado com sucesso.");
        }
    }

    void acelerar(double quantidade) {
        if (this.vAtual + quantidade > vMax) {
            vAtual = vMax;
            System.out.println("Velocidade máxima atingida.");
        } else {
            vAtual += quantidade;
            System.out.println("Acelerado com sucesso.");
        }
    }

    int pegarMarcha() {
        if (vAtual < 0) {
            return -1;
        } else if (vAtual >= 0 && vAtual < 40) {
            return 1;
        } else if (vAtual >= 40 && vAtual < 80) {
            return 2;
        } else {
            return 3;
        }

    }
}
