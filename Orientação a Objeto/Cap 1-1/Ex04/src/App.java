/*
 * Faça um modelo para a classe Pessoa.
 * Pense em cada atributo que este novo tipo deve ter.
 */


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("EXD", 1.74, 'M');
        System.out.println("Nome: " + p1.getNome() + ", altura: " + p1.getAltura() + ", sexo: " + p1.getSexo());

        p1.setNome("exd");
        p1.setAltura(1.75);
        p1.setSexo('m');
        System.out.println("Nome: " + p1.getNome() + ", altura: " + p1.getAltura() + ", sexo: " + p1.getSexo());
    }
}

