package main;

/**
 * pacote de testes com códigos dos exercícios dos livros HeadFirst Java, FJ-11
 * da Caelum e Java - Como programar do Harvey Deitel \o/
 *
 * @author Sam Velasquez
 */
public class Deitel {

    public static void main(String[] args) {

        Empresa e = new Empresa(1);

        for (int i = 1; i < 5; i++) {
            Funcionario f = new Funcionario();
            f.setNome("Sam Velasquez" + i);
            f.setSalario(123 * i);
            e.setEmpregado(f);
        }
        
        e.mostrarEmpregados();
        
        

    }
}
