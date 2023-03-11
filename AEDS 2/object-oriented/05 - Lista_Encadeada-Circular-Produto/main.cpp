#include <iostream>
#include <string>

#include "produto.h"
#include "nodo.h"
#include "encadeada.h"

int main() {
  encadeada lista;

  for (int i = 0; i < 3; i++)
    lista.insert();
  
  std::cout << "Head: " << lista.getHead() << "\n";

  nodo* pp = lista.getElemento(3);
  std::cout << "Proximo do ultimo elemento: " << pp->getProx() << "\n";
  
  return 0;
}