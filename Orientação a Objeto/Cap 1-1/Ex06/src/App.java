/* Exercício 06
 * Faça um modelo para a classe **Carro**.
 * Pense em cada atributo que este novo tipo deve ter, se necessário pode usar outro tipo abstrato recém criado
*/
public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("bmw", "320I", "Prata", 1999);
        System.out.println("Marca: " + c1.getMarca() + ", Modelo: " + c1.getNome() + ", Cor: " + c1.getCor() + ", Ano: " + c1.getAno());

        c1.setMarca("BMW");
        c1.setNome("320i");
        c1.setCor("Preto");
        c1.setAno(2023);
        System.out.println("Marca: " + c1.getMarca() + ", Modelo: " + c1.getNome() + ", Cor: " + c1.getCor() + ", Ano: " + c1.getAno());
    }
    
}
