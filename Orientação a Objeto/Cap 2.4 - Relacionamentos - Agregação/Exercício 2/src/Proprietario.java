public class Proprietario {
  private String nome;
  private String cpf;
  private String email;
  private Carro carros;

  public Proprietario () {
    this.nome = null;
    this.cpf = null;
    this.email = null;
    this.carros = new Carro();
  }

  public Proprietario (String nome, String cpf, String email, Carro carros) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.carros.copiar(carros);
  }

  // Getters
  public String getNome() {
    return this.nome;
  }
  public String getCpf() {
    return this.cpf;
  }
  public String getEmail() {
    return this.email;
  }
  public Carro getCarros() {
    return this.carros;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setCarros(Carro carros) {
    this.carros.copiar(carros);
  }

  public void preencher() {
    
  }
}
