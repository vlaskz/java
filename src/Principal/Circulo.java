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
public class Circulo implements AreaCalculavel{
private double raio;
    
    @Override
    public double calcularArea() {
    return java.lang.Math.PI *this.getRaio();
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
