#pragma once

#include "nodo.h"

class encadeada
{
private:
    nodo *head;
    int qtd;
    
    
public:
    encadeada();
    
    void insert();
    void remove();

    nodo* getElemento(int n);
    nodo* getHead();
};