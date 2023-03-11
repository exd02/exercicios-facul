#pragma once

#include "produto.h"

class nodo
{
private:
    produto item;
    nodo *prox;
public:
    nodo();
    nodo(produto &p);

    nodo *getProx();
    produto getItem();

    void setItem(produto item);
    void setProx(nodo* newAdress);
};