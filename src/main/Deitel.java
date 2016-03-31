package main;

/**
 * pacote de testes com códigos dos exercícios dos livros HeadFirst Java, FJ-11
 * da Caelum e Java - Como programar do Harvey Deitel \o/
 *
 * @author Sam Velasquez
 */
public class Deitel {

    public static void main(String[] args) {
        Banco b = new Banco();
        Conta c = new Conta();
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        b.addConta(c);
        b.addConta(c1);
        b.addConta(c2);
        b.resumo();

        System.out.println("total de contas:" + Conta.getTotalContas();

    }
}
