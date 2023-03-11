/*
 * Faça uma classe para o modelo “Carro” e outra para “Proprietário”.
 * Instancie dois objetos para cada classe e preencha os atributos dos objetos utilizando os métodos set
 */

public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        c1.setMarca("BMW");
        c1.setNome("320i");
        c1.setCor("Preto");
        c1.setAno(2023);

        Carro c2 = new Carro();
        c2.setMarca("Bugatti");
        c2.setNome("Mistral");
        c2.setCor("Preto");
        c2.setAno(2023);

        Proprietario p1 = new Proprietario();
        p1.setNome("exd");
        p1.setAltura(1.75);
        p1.setSexo('m');

        Proprietario p2 = new Proprietario();
        p2.setNome("ze");
        p2.setAltura(1.67);
        p2.setSexo('m');
    }
}
