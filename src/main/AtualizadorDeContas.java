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
public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private final double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("anterior:"+c.getSaldo());
        c.atualizar(selic);
        saldoTotal += c.getSaldo();
        System.out.println("atual:"+c.saldo);

    }
    public double getSaltoTotal(){
        return this.saldoTotal;
}

}
