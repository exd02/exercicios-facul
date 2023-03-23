public class App {
    public static void main(String[] args) throws Exception {
        Roda[] roda = new Roda[4];
        Carro c1 = new Carro();

        c1.preencher();
        for(int i=0; i<=3; i++)
            roda[i].preencher(c1);
    }
}
