/*
 * Faça uma classe para o modelo “Roda”.
 * Instancie dois objetos para a classe carro e preencha os atributos dos objetos utilizando os métodos set
 */
import java.util.Scanner;

 public class App {
    public static void main(String[] args) throws Exception {
        Roda r1 = new Roda();
        r1.preencher();

        Roda r2 = new Roda(r1);
        r2.setAro(70);

        r2.print();
    }
}
