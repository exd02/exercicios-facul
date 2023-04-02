import java.util.Scanner;

public class Ponto {
  private double x;
  private double y;

  public Ponto() {
    this.x = 0.0;
    this.y = 0.0;
  }
  public Ponto(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public Ponto(Ponto pointToCopy) {
    copy(pointToCopy);
  }

  public void copy(Ponto pointToCopy) {
    this.x = pointToCopy.getX();
    this.y = pointToCopy.getY();
  }

  // Getters
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }

  // Setters
  public void setX(double x) {
    this.x = x;
  }
  public void setY(double y) {
    this.y = y;
  }

  // Pedir para inserir os pontos X e Y
  public void preencher() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe as coordenadas: ");

    System.out.print("- X: ");
    setX(sc.nextDouble());

    System.out.print("- Y: ");
    setY(sc.nextDouble());
  }

  // Printar os pontos no formato (X,Y)
  public void print() {
    System.out.println("(" + getX() + "," + getY() + ")");
  }

  // Chama a função distanciaEntre2Pts(Ponto p1, Ponto p2), passando o ponto p1 como o objeto local (this)
  public double distanciaEntre2Pts(Ponto p2) {
    return distanciaEntre2Pts(this, p2);
  }

  // Calcular a distancia entre dois pontos
  public static double distanciaEntre2Pts(Ponto p1, Ponto p2) {
    return (Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow(p1.getY() - p2.getY(), 2)));
  }

  /*
   * Acha o determinante da matriz 3x3
   * OBS: a terceira coluna será completada com 1
   * | p1.x   p1.y   1 |
   * | p2.x   p2.y   1 |
   * | p3.x   p3.y   1 |
   * O determinante serve para verificar se os pontos são colineares caso seja zero,
   * caso não seja, o módulo do determinante dividido por 2 será a área do triangulo formado pelos 3 pontos
   */
  public static double getDeterminante(Ponto p1, Ponto p2, Ponto p3) {
    return (((p1.getX() * p2.getY()) +
             (p1.getY() * p3.getX()) +
             (p2.getX() * p3.getY()))
             -
            ((p2.getY() * p3.getX()) +
             (p1.getY() * p2.getX()) +
             (p1.getX() * p3.getY())));
  }
  
  /* Verificar se os pontos são colineares, isto é, se há uma reta em comum entre os pontos*/
  public static Boolean saoColineares(Ponto p1, Ponto p2, Ponto p3) {
    return (getDeterminante(p1,p2,p3) == 0.0);
  }

  public static double areaTriangulo(Ponto p1, Ponto p2, Ponto p3) {
    return (Math.abs(getDeterminante(p1, p2, p3)) / 2);
  }
}
