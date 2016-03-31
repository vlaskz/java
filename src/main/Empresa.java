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





    Empresa(int i) {
        this.empregados = new Funcionario[i];
    }
    private Funcionario[] empregados ;
    private String cnpj;
    private String razaoSocial;

    public void setRazaoSocial(String s) {
        this.razaoSocial = s;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    /**
     *adiciona empregados utilizando os métodos da classe Ferramentas
     * @param f
     */
    public void addEmpregado(Funcionario f) {
        
        Ferramentas fer;
        fer = new Ferramentas();
        empregados = fer.avaliarArray(empregados);
        empregados[fer.posLivreArray(empregados)] = f;
       
        
        
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

    

    public void mostrarEmpregados() {
        for (Funcionario f : empregados) {
            if (f != null) {
                f.mostra();
                
            }
        }
        System.out.println("Quantidade de Funcionários registrados:"+this.empregados[0].getTotalFuncionarios());
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
