public class Roda {
  private String nome;
  private String modelo;
  private int aro;

  public Roda () {
    this.nome = null;
    this.modelo = null;
    this.aro = 0;
  }

  public Roda (String nome, String modelo, int aro) {
    this.nome = nome;
    this.modelo = modelo;
    this.aro = aro;
  }

  // Getters
  public String getNome() {
    return this.nome;
  }
  public String getModelo() {
    return this.modelo;
  }
  public int getAro() {
    return this.aro;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public void setAro(int aro) {
    this.aro = aro;
  }

}
