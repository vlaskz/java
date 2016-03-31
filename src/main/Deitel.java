package main;

/**
 * pacote de testes com códigos dos exercícios dos livros HeadFirst Java, FJ-11
 * da Caelum e Java - Como programar do Harvey Deitel \o/
 *
 * @author Sam Velasquez
 */
public class Deitel {

    public static void main(String[] args) {
Banco b = new Banco(3);
Conta c = new Conta();
Cliente cli = new Cliente();
cli.nome = "Tanulio!!!";
c.saldo = 13000;

b.addConta(c);

System.out.println("total de contas:"+b.c[0].getTotalContas());      
        

    }
}
