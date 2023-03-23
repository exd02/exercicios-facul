import java.util.Scanner;

public class PC {
  private String cpu;
  private double ram;
  private double diskSpace;
  private boolean isSsd;

  public PC() {
    this.cpu = null;
    this.ram = 0.0;
    this.diskSpace = 0.0;
    this.isSsd = false;
  }

  public PC(String cpu, double ram, double diskSpace, boolean isSsd) {
    this.cpu = cpu;
    this.ram = ram;
    this.diskSpace = diskSpace;
    this.isSsd = isSsd;
  }

  // Construtor de cópia, chama o método copy()
  public PC(PC cp) {
    copy(cp);
  }

  // Chama o método copy()
  public void copiar(PC cp) {
    copy(cp);
  }

  // Faz o ojeto atual copiar os atributos do parâmetro
  public void copy(PC cp) {
    this.cpu = cp.getCpu();
    this.ram = cp.getRam();
    this.diskSpace = cp.getDiskSpace();
    this.isSsd = cp.getIsSsd();
  }

  // Getters
  public String getCpu() {
    return this.cpu;
  }
  public double getRam() {
    return this.ram;
  }
  public double getDiskSpace() {
    return this.diskSpace;
  }
  public boolean getIsSsd() {
    return this.isSsd;
  }

  // Setters
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }
  public void setRam(double ram) {
    this.ram = ram;
  }
  public void setDiskSpace(double diskSpace) {
    this.diskSpace = diskSpace;
  }
  public void setIsSsd(boolean isSsd) {
    this.isSsd = isSsd;
  }

  // Pede para o usuário dar entrada com os dados do PC
  public void insert() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe os dados do PC: ");
    System.out.print("- CPU: ");
    setCpu(sc.nextLine());

    System.out.print("- Quantidade de RAM (gb): ");
    setRam(sc.nextDouble());

    System.out.print("- Tamanho do disco: ");
    setDiskSpace(sc.nextDouble());

    System.out.print("O disco é SSD? (true/false): ");
    setIsSsd(sc.nextBoolean());

    sc.close();
  }

  // Chama o método insert()
  public void preencher() {
    insert();
  }

  // Printa todas as informações do PC 
  public void print() {
    System.out.print("Dados do PC solicitado: \n");
    System.out.print("- CPU: " + getCpu() + "\n");
    System.out.print("- Quantidade de RAM (gb): " + getRam() + "\n");
    System.out.print("- Tamanho do disco: " + getDiskSpace() + "\n");
    System.out.print("- O disco é SSD?: " + ((getIsSsd()) ? 'S' : 'N') + "\n");
  }

  // Chama o método print()
  public void imprimir() {
    print();
  }
}