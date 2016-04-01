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
public class Diretor extends Funcionario implements Autenticavel{
private int senha;

    /**
     *
     * @param senha
     * @return
     */
    @Override
    public boolean autenticar(int senha){
        return this.getSenha()==senha;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}
