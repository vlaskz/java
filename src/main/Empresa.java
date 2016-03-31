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
public class Empresa {

    Empresa() {
        System.out.println("Empresa criada com Sucesso");
    }

    Empresa(int i) {
        this.empregados = new Funcionario[i];
    }
    private Funcionario[] empregados = new Funcionario[10];
    private String cnpj;
    private String razaoSocial;

    public void setRazaoSocial(String s) {
        this.razaoSocial = s;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setEmpregado(Funcionario f) {
        this.addEmpregado(f);
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

    private void addEmpregado(Funcionario f) {

        boolean flag = true;

        for (int i = 0; flag; i++) {
            if (this.empregados[i] == null) {
                this.empregados[i] = f;
                flag = false;
                f.mostra();
                break;

            }
        }
        if (flag) {
            System.out.println("Numero máximo de funcionários atingido.");
        }

    }

    private void mostrarEmpregados() {
        for (Funcionario f : empregados) {
            if (f != null) {
                f.mostra();
            }
        }
    }

    boolean contem(Funcionario f) {
        boolean status = false;
        for (Funcionario empregado : empregados) {
            if (empregado == f) {
                status = true;
            }
        }
        return status;

    }
}
