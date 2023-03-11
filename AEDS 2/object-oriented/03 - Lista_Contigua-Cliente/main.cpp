#include <iostream>
#include <string>
#include "cliente.h"
#include "listaCliente.h"

int main() {
  listaCliente lista(100);
  lista.addCliente();
  
  lista.addClientesAleatorios(10);

  lista.printHead(3);
  lista.printTail(3);

  cliente buscado = lista.buscaPorCpf("123.456.789-10");
  buscado.printarCliente();

  return 0;
}