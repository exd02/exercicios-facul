#include "listaCliente.h"

void listaCliente::shiftEnd()
{
  shiftEnd(0);
}

void listaCliente::shiftEnd(const int pos)
{
  if (isEmpty() || !isValidId(pos))
    return;
  
  for (int i=this->quantidade; i>=pos; i--)
  {
    this->lista[i+1].copy(this->lista[i]);
  }
}

void listaCliente::shiftFront()
{
  shiftFront(0);
}

void listaCliente::shiftFront(const int pos)
{
  if (isEmpty() || !isValidId(pos))
    return;
  
  for (int i=pos; i<quantidade-1; i++)
  {
    this->lista[i].copy(this->lista[i+1]);
  }
}

bool listaCliente::hasSpace()
{
  return (this->quantidade < this->tamanho);
}

bool listaCliente::isEmpty()
{
  return (this->quantidade == 0);
}

bool listaCliente::isValidId(const int id)
{
  return (id>0 || id<this->quantidade);
}

listaCliente::listaCliente()
{
  // Não consegui chamar o "listaCliente(10)", preciso de uma maneira mais otimizada de fazer isso.
  this->tamanho = 10;
  this->quantidade = 0;
  this->lista = new cliente[10];
}

listaCliente::listaCliente(int tamanho)
{
  if (tamanho <= 0)
    tamanho = 10;

  this->tamanho = tamanho;
  this->quantidade = 0;
  this->lista = new cliente[tamanho];
}

void listaCliente::addCliente()
{
  if (!hasSpace())
    return;

  shiftEnd(0);
  this->lista[0].preencherCampos();
  this->quantidade++;
}

void listaCliente::addCliente(cliente add)
{
  if (!hasSpace())
    return;

  shiftEnd(0);
  this->lista[0].copy(add);
  this->quantidade++;
}

cliente listaCliente::getClientByListId(int id)
{
  /*if (isEmpty() || !isValidId(id))
  {
    return;
  }*/

  return this->lista[id];
}

void listaCliente::addClientesAleatorios(int qtd)
{
  if (qtd > (this->tamanho - this->quantidade)) // Não tem espaço para tal quantidade
    return;
  
  cliente add;
  for (int i=0; i<=qtd; i++)
  {
    std::string pessoaAleatoria = "PessoaAleatoria ";
    add.setNome(pessoaAleatoria.append(std::to_string(i)));
    add.setSexo('M');
    add.setIdade(rand() % 100);
    add.setCpf(std::to_string(rand() % 99999999999 + 10000000000));
    add.setTelefone(std::to_string(rand() % 99999999999 + 10000000000));

    addCliente(add);
  }
}

cliente listaCliente::buscaPorCpf(std::string cpf)
{
  cliente::stripStringIntoNumbers(cpf);

  /* Se mesmo depois de dar strip no cpf e ele continuar inválido
    * retornaremos o primeiro cliente da lista */
  if (!cliente::cpfValido(cpf))
    return this->lista[0];
  
  for(int i=0; i<=quantidade; i++)
  {
    if (this->lista[i].getCpf() == cpf)
      return this->lista[i];
  }

  return this->lista[0];
}

void listaCliente::printTail()
{
  printTail(5);
}

void listaCliente::printTail(int qtd)
{
  if (this->quantidade < qtd)
    return;
    
  std::cout << "\n";
  for (int i = this->quantidade-1; i >= this->quantidade-qtd; i--)
  {
    lista[i].printarClienteCurto();
  }
  std::cout << "\n";
}

void listaCliente::printHead()
{
  printHead(5);
}

void listaCliente::printHead(int qtd)
{
  if (this->quantidade < qtd-1)
    return;

  std::cout << "\n";
  for (int i=0; i<qtd; i++)
  {
    lista[i].printarClienteCurto();
  }
  std::cout << "\n";
}