#pragma once

#include <iostream>
#include <string>

/*
 * https://stackoverflow.com/questions/25090594/while-loop-chars-c
 * usado para limpar o buffer do std::cin
 */
#include <limits>

class cliente
{
private:
  std::string nome;
  char sexo;
  int idade;
  std::string cpf;
  std::string telefone;

  
public:
  /* Quando o método é chamado sem parametros ele pede para que usuário digite cada um dos campos */
  cliente();
  cliente(std::string nome, char sexo, int idade, std::string cpf, std::string telefone);

  // Getters
  std::string getNome();
  char getSexo();
  int getIdade();
  std::string getCpf();
  std::string getTelefone();

  // Setters
  void setNome(std::string nome);
  void setSexo(char sexo);
  void setIdade(int idade);
  void setCpf(std::string cpf);
  void setTelefone(std::string telefone);
  

  void copy(cliente toCopy);
  /* Pede o usuário pra inserir cada um dos campos da classe cliente */
  void preencherCampos();
  void printarCliente();
  void printarClienteCurto();

  /* Usado para formatar por exemplo o CPF, deixa apenas números na string
   * (Quando o usuário insere 111.222.333-44 transforma em 11122233344)
   * Assim, ficará mais fácil de fazer a busca binária futuramente
   */
  static void stripStringIntoNumbers(std::string &cpf);
  static bool cpfValido(const std::string cpf);
  static std::string cpfFormatado(std::string cpf);
};

