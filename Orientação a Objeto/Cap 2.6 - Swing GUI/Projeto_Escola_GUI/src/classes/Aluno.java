
package classes;

import java.util.Scanner;

public class Aluno{
    private String nome;
    private char sexo;
    private int idade;
    private String matricula;
    private int anoIngresso;
    
    public Aluno(){
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
        this.matricula = "00000";
        this.anoIngresso = 1900;    
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("***** Preenchendo aluno ******");
        System.out.print("Informe o nome:");
        this.setNome(leitor.next());
        
        System.out.print("Informe o sexo: ");
        this.setSexo(leitor.next().charAt(0));
        
        System.out.print("Informe a idade:");
        this.setIdade(leitor.nextInt());
        
        System.out.print("Informe a matricula:");
        this.setMatricula(leitor.next());
        
        System.out.print("Informe o ano de ingresso:");
        this.setAnoIngresso(leitor.nextInt());       
    }
    
    public void copiar(Aluno outro){
        this.setNome(outro.getNome());
        this.setSexo(outro.getSexo());
        this.setIdade(outro.getIdade());
        this.setMatricula(outro.getMatricula());
        this.setAnoIngresso(outro.getAnoIngresso());               
    }
    
    public void imprimir(){
        System.out.println("---- Dados do aluno ------");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Sexo: "+ this.getSexo());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Matricula: "+ this.getMatricula());
        System.out.println("Ano de ingresso: "+ this.getAnoIngresso());   
    }            

    public String toString(){
        return "---- Dados do aluno ------" + "\n"
        + "Nome: " + this.getNome() + "\n"
        + "Sexo: " + this.getSexo() + "\n"
        + "Idade: " + this.getIdade() + "\n"
        + "Matricula: " + this.getMatricula() + "\n"
        + "Ano de ingresso: " + this.getAnoIngresso() + "\n"
        + "--------------------------\n";
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
