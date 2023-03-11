#pragma once

#include "cliente.h"
#include <random>

class listaCliente
{
private:
  int tamanho;
  int quantidade;
  cliente *lista;

  /* Mover todos os membros da pilha para o final (chama o metodo shiftEnd(0)) */
  void shiftEnd();

  /* Mover todos os membros da pilha para o final a partir do index passado como parametro */
  void shiftEnd(const int pos);

  /* Mover todos os membros da pilha para frente (chama o metodo shiftFront(0)) */
  void shiftFront();

  /* Mover todos os membros da pilha para frente a partir do index passado como parametro */
  void shiftFront(const int pos);

  /* Verificar se a Lista tem espaço */
  bool hasSpace();

  /* Verificar se a Lista está vazia */
  bool isEmpty();

  /* Verificar se o index faz referência a um item válido da lista */
  bool isValidId(const int id);
public:
  listaCliente();
  listaCliente(int tamanho);

  void copy(const cliente toCopy);

  /* Adicionar um novo cliente na lista (pede para o usuário preencher os campos da classe cliente) */
  void addCliente();
  /* Adicionar um novo cliente na lista (copiando o do parâmetro passado) */
  void addCliente(cliente add);

  /* Retorna o cliente a partir do id referente a lista */
  cliente getClientByListId(int id);
  void addClientesAleatorios(int qtd);
  cliente buscaPorCpf(std::string cpf);

  /* Printar os 5 últimos clientes */
  void printTail();
  /* Printar os X últimos clientes */
  void printTail(int qtd);

  /* Printar os 5 primeiros clientes */
  void printHead();
  /* Printar os X primeiros clientes */
  void printHead(int qtd);

};