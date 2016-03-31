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
public class Funcionario {

    Funcionario() {
        Funcionario.ID++;
        System.out.println("Funcionário Criado com Sucesso");
    }

    Funcionario(String nome) {
        Funcionario.ID++;
        this.setNome(nome);
        Funcionario.ID++;
    }

    Funcionario(Endereco end) {
        Funcionario.ID++;
        this.setNome(nome);
        this.setEndereco(end);
    }

    private Endereco endereco = new Endereco();
    private String nome;
    private String depto;
    private double salario;
    private Data dataEnt = new Data();
    private String RG;
    private static int ID;

    public int getID() {
        return Funcionario.ID;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setData(Data data) {
        this.dataEnt = data;
    }

    public Data getData() {
        return this.dataEnt;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDepto() {
        return this.depto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getRG() {
        return this.RG;
    }

    public void recebeAumento(double aumento) {
        this.setSalario(this.getSalario() + aumento);
    }

    public double getGanhoAnual() {
        return (this.getSalario() * 12);
    }

    public void mostra() {
        System.out.print("Nome:" + this.getNome() + "\nData de Entrada:"
                + this.getData().formatada() + "\nRG:" + this.getRG() + "\nDepartamento:"
                + this.getDepto() + "\nSalário:" + this.getSalario() + "\n");
    }
}
