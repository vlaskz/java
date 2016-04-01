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
public class Funcionario {

    Funcionario() {
        Funcionario.totalFuncionarios++;
    }

    Funcionario(String nome) {
        Funcionario.totalFuncionarios++;
        this.setNome(nome);
        Funcionario.totalFuncionarios++;
    }

    Funcionario(Endereco end) {
        Funcionario.totalFuncionarios++;
        this.setNome(nome);
        this.setEndereco(end);
    }

    private Endereco endereco = new Endereco();
    private String nome;
    private String depto;
    private double salario;
    private Data dataEnt = new Data();
    private String RG;
    private static int totalFuncionarios;

    public int getTotalFuncionarios() {
        return Funcionario.totalFuncionarios;
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
                + this.getDepto() + "\nSalário:" + this.getSalario() + "\n\n");
    }
}
