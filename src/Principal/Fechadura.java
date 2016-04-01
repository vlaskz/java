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
public class Fechadura {

    private boolean aberta = true;
    private static int counter = 0;
    private int senha;

    public boolean abrir(int senha) {
        if (this.aberta == false) {
            if (senha == this.senha) {
                this.aberta = true;
                counter = 0;
                return true;

            } else if (counter < 2) {
                counter++;
                return false;
            } else {
                this.alarme();
            }
        }
        return false;
    }

    public boolean fechar(int senha) {
        if (this.aberta == true) {
            this.aberta = false;
            this.senha = senha;

            return true;

        } else {
            return false;
        }
    }

    public boolean estado() {
        return this.aberta;
    }

    private void alarme() {
        System.out.println("Alarme disparado");
    }
}
