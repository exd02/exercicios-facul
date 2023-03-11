#include "cliente.h"

cliente::cliente()
{
  this->nome = "";
  this->sexo = 'M';
  this->idade = 0;
  this->cpf = "";
  this->telefone = "";
}

cliente::cliente(std::string nome, char sexo, int idade, std::string cpf, std::string telefone)
{
  this->nome = nome;
  this->sexo = sexo;
  this->idade = idade;
  this->cpf = cpf;
  this->telefone = telefone;
}

std::string cliente::getNome()
{
  return this->nome;
}

char cliente::getSexo()
{
  return this->sexo;
}

int cliente::getIdade()
{
  return this->idade;
}

std::string cliente::getCpf()
{
  return this->cpf;
}

std::string cliente::getTelefone()
{
  return this->telefone;
}

void cliente::setNome(std::string nome)
{
  this->nome = nome;
}

void cliente::setSexo(char sexo)
{
  this->sexo = sexo;
}

void cliente::setIdade(int idade)
{
  this->idade = idade;
}

void cliente::setCpf(std::string cpf)
{
  this->cpf = cpf;
}

void cliente::setTelefone(std::string telefone)
{
  this->telefone = telefone;
}

void cliente::copy(const cliente toCopy)
{
  this->nome = toCopy.nome;
  this->sexo = toCopy.sexo;
  this->idade = toCopy.idade;
  this->cpf = toCopy.cpf;
  this->telefone = toCopy.telefone;
}

void cliente::preencherCampos()
{
  std::cout << "Digite o seu nome: ";
  std::getline(std::cin , this->nome);

  this->sexo = '\0';
  while (this->sexo != 'M' && this->sexo != 'F')
  {
    std::cout << "Digite seu sexo (M ou F): ";
    std::cin >> this->sexo;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
    this->sexo = std::toupper(this->sexo);
  }

  this->idade = 0;
  while (this->idade <= 0)
  {
    std::cout << "Digite a sua idade: ";
    std::cin >> this->idade;
  }

  this->cpf = '\0';
  while (!cpfValido(this->cpf))
  {
    std::cout << "Digite o seu CPF (ex.: 123.456.789-10): ";
    std::cin >> this->cpf;
    stripStringIntoNumbers(this->cpf);
  }

  std::cout << "Digite o seu telefone: ";
  std::cin >> this->telefone;
}

void cliente::printarCliente()
{
  std::cout << "-----------InfoCliente-----------" << "\n";
  std::cout << "Nome -> " << this->nome << "\n";
  std::cout << "Sexo -> " << this->sexo << "\n";
  std::cout << "Idade -> " << this->idade << "\n";
  std::cout << "CPF -> " << cpfFormatado(this->cpf) << "\n";
  std::cout << "Telefone -> " << this->telefone << "\n";
  std::cout << "---------------------------------" << "\n";
}

void cliente::printarClienteCurto()
{
  std::cout << this->nome << " - ";
  std::cout << "[" << this->sexo << "] - ";
  std::cout << "(" << this->idade << ") - ";
  std::cout << cpfFormatado(this->cpf) << " - ";
  std::cout <<  this->telefone << "\n";
}

void cliente::stripStringIntoNumbers(std::string &cpf)
{
  for (int i=cpf.size()-1; i>=0; i--) // Fazer um loop na string
  {
    if (cpf[i] < 48 || cpf[i] > 57) // Na  tabela ASCII, os números são de 48 até 58
    {
      cpf.erase(i,1);
    }
  }
}

bool cliente::cpfValido(const std::string cpf)
{
  return (cpf.size() == 11); // O tamanho do CPF depois de deixar apenas numeros é 11
}

std::string cliente::cpfFormatado(std::string cpf)
{
  // if (!cpfValido(cpf)) return;
  
  for (int i=cpf.size()-1; i>=0; i--) // Fazer um loop na string
  {
    if (i == 3 || i == 6) // 012.345.678-91
      cpf.insert(i, ".");
    else if (i == 9)
      cpf.insert(i, "-");
  }

  return cpf;
}