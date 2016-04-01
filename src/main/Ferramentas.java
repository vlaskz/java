/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * classe de ferramentas para ajudar (no momento), com arrays.
 *
 * @author Sam Velasquez
 */
public class Ferramentas {

    /**
     * método para aumentar em 1 o comprimento do array passado como argumento
     * devolvendo-o com os dados já inseridos.
     *
     * @param o
     * @return o (array de objetos)
     */
    public int[] avaliarArray(int[] o) {
        if (o[o.length - 1] != 0) {
            int[] p = o;
            o = new int[o.length + 1];
            System.arraycopy(p, 0, o, 0, p.length);

            return o;
        } else {
            return o;
        }
    }

    public Funcionario[] avaliarArray(Funcionario[] o) {
        if (o[o.length - 1] != null) {
            Funcionario[] p = o;
            o = new Funcionario[o.length + 1];
            System.arraycopy(p, 0, o, 0, p.length);

            return o;
        } else {
            return o;
        }
    }

    public Conta[] avaliarArray(Conta[] o) {
        if (o[o.length - 1] != null) {
            Conta[] p = o;
            o = new Conta[o.length + 1];
            System.arraycopy(p, 0, o, 0, p.length);

            return o;
        } else {
            return o;
        }
    }

    public int posLivreArray(Funcionario[] f) {

        int i;
        for (i = 0; i < f.length; i++) {
            if (f[i] == null) {
                break;
            }
        }
        return i;
    }

    public int posLivreArray(Conta[] c) {

        int i;
        for (i = 0; i < c.length; i++) {
            if (c[i] == null) {
                break;
            }
        }
        return i;
    }
}
