/*
 * Faça uma classe para o modelo “Roda” e outra para “Produto”. E instancie dois objetos para cada classe
 */
public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Biscoito", 2);
        Produto p2 = new Produto("Batata", 5);
        Roda r1 = new Roda("Rodas de Liga Leve", "Gol G5", 18);
        Roda r2 = new Roda("Rodas VW", "Gol G5", 14);
    }
}
