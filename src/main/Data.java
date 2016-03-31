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
public class Data {

    Data() {

    }

    Data(int d, int m, int a) {
        this.setData(d, m, a);
    }

    private Integer dia;
    private Integer mes;
    private Integer ano;

    private boolean validarData(int d, int m, int a) {
        boolean v = false;

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d >= 1 && d <= 31) {
                    v = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d >= 1 && d <= 30) {
                    v = true;
                }
                break;
            case 2:
                if ((d >= 1 && d <= 29) && (a % 100 != 0) && (a % 4 == 0)) {
                    v = true;
                } else if ((d >= 1 && d <= 28)) {
                    v = true;
                }
                break;
        }

        return v;
    }

    String formatada() {

        return (this.dia + "/" + this.mes + "/" + this.ano);
    }

    public void setData(int d, int m, int a) {
        if (validarData(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            System.out.println("Data incoerente");
            this.dia = null;
            this.mes = null;
            this.ano = null;
        }

    }

    public Data getData() {
        Data d = new Data();
        d.setData(this.dia, this.mes, this.ano);
        return d;
    }
}
