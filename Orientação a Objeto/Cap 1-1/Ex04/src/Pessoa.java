public class Pessoa {
  private String nome;
  private double altura;
  private char sexo;

  public Pessoa () {
    this.nome = null;
    this.altura = 0.00;
    this.sexo = 'm';
  }

  public Pessoa (String nome, double altura, char sexo) {
    this.nome = nome;
    this.altura = altura;
    this.sexo = sexo;
  }

  // Getters
  public String getNome() {
    return this.nome;
  }

  public double getAltura() {
    return this.altura;
  }

  public char getSexo() {
    return this.sexo;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
}
