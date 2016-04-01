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
public class ContaCorrente extends Conta {

    @Override
    public void atualizar(double taxa) {
        super.atualizar(taxa*2);
    }

    @Override
    public boolean depositar(double valor) {
      return super.depositar(valor-0.10);
    }

}