// Faça um modelo para a classe Roda. Pense em cada atributo que este novo tipo deve ter.

public class App {
    public static void main(String[] args) throws Exception {
        Roda r1 = new Roda("rodas de Liga Leve", "gol G5", 17);
        System.out.println("Nome: " + r1.getNome() + ", Modelo: " + r1.getModelo() + ", Aro: " + r1.getAro());

        r1.setNome("Rodas de Liga Leve");
        r1.setModelo("Gol G5");
        r1.setAro(18);
        System.out.println("Nome: " + r1.getNome() + ", Modelo: " + r1.getModelo() + ", Aro: " + r1.getAro());
    }
}
