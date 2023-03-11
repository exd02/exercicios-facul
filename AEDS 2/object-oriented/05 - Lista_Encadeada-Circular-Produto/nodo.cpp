#include "nodo.h"

nodo::nodo()
{
    this->item.preencherCampos();
    this->prox = nullptr;
}

nodo::nodo(produto &p)
{
    this->item.copiar(p);
    this->prox = nullptr;
}

nodo *nodo::getProx()
{
    return this->prox;
}

produto nodo::getItem()
{
    return this->item;
}

void nodo::setItem(produto item)
{
    this->item = item;
}

void nodo::setProx(nodo* newAdress)
{
    this->prox = newAdress;
}