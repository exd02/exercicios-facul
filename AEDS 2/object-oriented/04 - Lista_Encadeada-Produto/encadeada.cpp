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
}

void encadeada::remove()
{
  if (this->qtd <= 0)
    return;
  
  head->setProx(head->getProx());
  this->qtd--;
}