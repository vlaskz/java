package main;

/**
 * pacote de testes com códigos dos exercícios dos livros HeadFirst Java, FJ-11
 da Caelum e Java - Como programar do Harvey Main \o/
 *
 * @author Sam Velasquez
 */
public class Main {

   
    public static void main(String[] args) {
        Banco b = new Banco();

        Conta c;
        Conta c1;
        Conta c2;
        Conta c3;
        
        b.addConta(c = new ContaCorrente());
        b.addConta(c1 = new ContaPoupanca());
        b.addConta(c2 = new ContaPoupanca());
        b.addConta(c3 = new ContaCorrente());
        
        
        for (Conta ct : b.contas) {
            ct.depositar(300);
        }
        AtualizadorDeContas ac = new AtualizadorDeContas(3);
        for (Conta ct : b.contas) {
        ac.roda(ct);
        }
     

        System.out.println("\n\ntotal de contas:" + Conta.getTotalContas());

    }}
