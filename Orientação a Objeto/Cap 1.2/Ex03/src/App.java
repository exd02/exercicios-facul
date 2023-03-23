/* 
 * Faça uma classe para o modelo “Carro”.
 * Instancie dois objetos para a classe carro e preencha os atributos dos objetos utilizando os métodos set.
 * Depois copie o nome do carro1 para o carro2.
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

        c2.setNome(c1.getNome());

        System.out.println("Marca: " + c2.getMarca() + ", Modelo: " + c2.getNome() + ", Cor: " + c2.getCor() + ", Ano: " + c2.getAno());
    }
    
}
