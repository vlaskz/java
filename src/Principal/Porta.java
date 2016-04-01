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
public class Porta {

    boolean aberta = false;
    String cor;
    double dimX, dimY, dimZ;

    void abrir() {
        this.aberta = true;
    }

    void fechar() {
        this.aberta = false;
    }

    void pintar(String s) {
        this.cor = s;
    }

    boolean estaAberta() {
        return (this.aberta);

    }

    void setSizePorta(double x, double y, double z) {

        this.dimX = x;
        this.dimY = y;
        this.dimZ = z;
    }

    void mostrar() {
        System.out.println("Dims:" + dimX + "," + dimY + "," + dimZ + "\nCor:" + this.cor + "\nEstado:" + this.estaAberta());
    }

}
