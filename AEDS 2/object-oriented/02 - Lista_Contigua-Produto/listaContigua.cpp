#include "listaContigua.h"

listaContigua::listaContigua(int tamanho) {
	this->tamanho = tamanho;
	this->quantidade = 0;
	this->Lista = new produto[tamanho];
}

int listaContigua::getQuantidade() {
	return this->quantidade;
}

produto listaContigua::getProdutoByIndex(int index) {
	if (!temIndexValido(index))
	{
		std::cout << "Index invalido!\n";
	}

	return this->Lista[index];
}

bool listaContigua::temEspaco() {
	return (this->tamanho > this->quantidade);
}

bool listaContigua::temIndexValido(int index) {
	return (index >= 0 && index < this->quantidade);
}

void listaContigua::shiftFront(int index) {
	for (int i = index; i < this->quantidade; i++)
	{
		this->Lista[i].copiar(this->Lista[i+1]);
	}
}

void listaContigua::shiftEnd(int index) {
	for (int i=this->quantidade; i>index; i--)
	{
		this->Lista[i].copiar(this->Lista[i-1]);
	}
}

void listaContigua::inserir(int index) {
	if (!temEspaco()) {
		std::cout << "Lista Cheia!\n";
		return;
	}

	shiftEnd(index);
	Lista[index].preencherCampos();
	this->quantidade++;
}

void listaContigua::inserir(const produto prod, int index) {
	if (!temEspaco()) {
		std::cout << "Lista Cheia!\n";
		return;
	}

	shiftEnd(index);
	Lista[index].copiar(prod);
	this->quantidade++;
}

void listaContigua::print() {
	if (this->quantidade == 0)
	{
		std::cout << "Nada cadastrado!\n";
		return;
	}

	for (int i=0; i<this->quantidade; i++)
	{
		this->Lista[i].imprimirProduto();
	}
}

void listaContigua::print(int index) {
	if (!temIndexValido(index))
	{
		std::cout << "Index invalido!\n";
		return;
	}

	this->Lista[index].imprimirProduto();
}

void listaContigua::remover(int index) {
	if (!temIndexValido(index))
	{
		std::cout << "Index invalido!\n";
		return;
	}

	shiftFront(index);
	this->quantidade--;
}