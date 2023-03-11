#include "encadeada.h"

encadeada::encadeada()
{
  this->head = nullptr;
  qtd = 0;
}

void encadeada::insert()
{
  nodo* novo = new nodo;
  novo->setProx(head); // O nodo novo irá apontar para o atual head
  this->head = novo; // Agora a head aponta para o novo nodo
  this->qtd++;

  // Fazer o último apontar para o primeiro para fazer a lista circular
  nodo* ultimo = getElemento(this->qtd);
  ultimo->setProx(this->head);
}

void encadeada::remove()
{
  if (this->qtd <= 0)
    return;
  
  head->setProx(head->getProx());
  this->qtd--;
}

nodo* encadeada::getElemento(int n)
{
  nodo *p = this->head;
  int i = 1;
  while(i < n && p->getProx() != nullptr){
    p = p->getProx();
    i++;
  }
  if (i == n)
    return p;
  else
    return nullptr;
}

nodo* encadeada::getHead()
{
  return this->head;
}