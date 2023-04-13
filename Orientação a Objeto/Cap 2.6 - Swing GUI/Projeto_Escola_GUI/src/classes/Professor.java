package classes;

import java.util.Scanner;

public class Professor {

    private String nome;
    private char sexo;
    private int idade;
    private String cpf;

    public Professor() {
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("******* Preenchendo professor ******");
        
        System.out.print("Informe o nome:");
        this.setNome(leitor.next());
        
        System.out.print("Informe o sexo: ");
        this.setSexo(leitor.next().charAt(0));
        
        System.out.print("Informe a idade:");
        this.setIdade(leitor.nextInt());     

        System.out.print("Informe o cpf:");
        this.setCpf(leitor.next());
    }

    public void imprimir() {
        System.out.println("--------- Dados do professor -------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("-------------------------------------");
    }

    public String imprimirParaString() {
        String saida = "";
        saida = "--------- Dados do professor -------\n"
                + "Nome: " + this.getNome() + "\n"
                + "Sexo: " + this.getSexo() + "\n"
                + "Idade: " + this.getIdade() + "\n"
                + "CPF: " + this.getCpf() + "\n"
                + "-------------------------------------\n";
        return saida;
    }

    public void copiar(Professor outro) {
        this.setNome(outro.getNome());
        this.setSexo(outro.getSexo());
        this.setIdade(outro.getIdade());
        this.setCpf(outro.getCpf());
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
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
