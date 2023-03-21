public class App {
    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto();
        p1.preencher();

        Ponto p2 = new Ponto();
        p2.preencher();

        // System.out.println("Distancia entre os dois pontos inseridos: " + Ponto.distanciaEntre2Pts(p1,p2));

        Ponto p3 = new Ponto();
        p3.preencher();
        
        if (Ponto.saoColineares(p1, p2, p3))
            System.out.println("Os 3 pontos inseridos são colineares.");
        else
            System.out.println("A área do triângulo formado entre os 3 pontos é: " + Ponto.areaTriangulo(p1, p2, p3));
        
    }
}
