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
public class Conta {

    protected Cliente titular = new Cliente();
    protected int numConta;
    protected double saldo;
    protected double limite;
    public static int totalContas;

    public Conta() {
        Conta.totalContas++;
    }

    /**
     *
     * @return
     */
    public static int getTotalContas() {
        return Conta.totalContas;
    }

    public boolean sacar(double valor) {
        if (this.saldo <= valor) {
            return (false);
        } else {
            this.saldo -= valor;
            return (true);

        }
    }

    public boolean depositar(double valor) {
        this.saldo += valor;
        return (true);
    }

    void imprimeTitular() {
        System.out.println(this.titular);
    }

    double getSaldo() {
        return this.saldo;
    }

    boolean transferirPara(Conta b, double valor) {

        if (this.saldo < valor) {
            System.out.println("Saldo Insuficiente.");
            return (false);
        } else {
            this.sacar(valor);
            b.depositar(valor);
            System.out.println("Transferência efetuada com sucesso.");
            return (true);
        }
    }

    void resumoConta() {
        System.out.print("Conta:" + this.numConta + "\nTitular:" + this.titular.nome + "\nSaldo:" + this.saldo + "\n");
    }

    /**
     * metodo para aplicar taxa ao saldo
     *
     * @param taxa
     */
    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa;
    }

}
