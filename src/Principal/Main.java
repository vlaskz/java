package Principal;

/**
 * pacote de testes com códigos dos exercícios dos livros HeadFirst Java, FJ-11
 * da Caelum e Java - Como programar do Harvey Main \o/
 *
 * @author Sam Velasquez
 */
public class Main {

    public static void main(String[] args) {
        AreaCalculavel a  = new Retangulo(java.lang.Math.PI, 2);
       System.out.println(a.calcularArea());
    }
}
