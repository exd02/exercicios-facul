#include <iostream>
#include <string>
#include "produto.h"
#include "listaContigua.h"

int main()
{
	listaContigua lista;

	for (int i = 0; i < 8; i++)
	{
		lista.inserir();
	}

	/* 
	* Pede pro usu�rio inserir 8 produtos na lista
	* Loop para encontrar o maior custo
	* remove o com maior custo
	*/
	
	float custo = 0.0, maiorCusto = 0.0;
	int indexMaiorCusto = 0;
	for (int i = 0; i < 8; i++)
	{
		custo = lista.getProdutoByIndex(i).getCusto();
		if (custo > maiorCusto)
		{
			maiorCusto = custo;
			indexMaiorCusto = i;
		}
	}

	lista.print();
	std::cout << "maior - " << indexMaiorCusto;
	lista.remover(indexMaiorCusto);
	lista.print();
	

	return 0;
}