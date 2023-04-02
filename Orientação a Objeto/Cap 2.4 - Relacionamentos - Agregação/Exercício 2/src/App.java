import classes.Carro;
import classes.Proprietario;
import classes.Roda;

public class App {
    public static void main(String[] args) throws Exception {
        Proprietario prop = new Proprietario();
        prop.fill();
        
        Carro c1 = new Carro();
        c1.fill();
        
        Carro c2 = new Carro();
        c2.fill();

        prop.addCarroParaLista(c1);
        prop.addCarroParaLista(c2);

        prop.print();
    }
}
