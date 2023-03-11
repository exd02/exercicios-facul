#include "produto.h"

produto::produto()
{
	this->nome = "";
	this->custo = 0.0;
	this->preco = 0.0;
	this->estoque = 0;
}

produto::produto(std::string nome, float custo, float preco, int estoque)
{
	this->nome = nome;
	this->custo = custo;
	this->preco = preco;
	this->estoque = estoque;
}

void produto::copiar(const produto outro)
{
	this->nome = outro.nome;
	this->custo = outro.custo;
	this->preco = outro.preco;
	this->estoque = outro.estoque;
}

std::string produto::getNome() {
	return this->nome;
}

float produto::getCusto() {
	return this->custo;
}

float produto::getPreco() {
	return this->preco;
}

int produto::getEstoque() {
	return this->estoque;
}

void produto::setNome(std::string nome) {
	this->nome = nome;
}

void produto::setCusto(float custo) {
	this->custo = custo;
}

void produto::setPreco(float preco) {
	this->preco = preco;
}

void produto::setEstoque(int estoque) {
	this->estoque = estoque;
}

void produto::preencherCampos() {
	std::cout << "----- Insira os dados do produto -----\n";
	std::cout << "Nome: ";
	std::cin >> this->nome;

	std::cout << "Preco: ";
	std::cin >> this->preco;

	std::cout << "Custo: ";
	std::cin >> this->custo;

	std::cout << "Estoque: ";
	std::cin >> this->estoque;
	std::cout << "--------------------------------------\n";
}

void produto::imprimirProduto() {
	std::cout << "-------- Ver Dados do Produto --------\n";
	std::cout << "Nome: " << this->nome << "\n";
	std::cout << "Preco: " << this->preco << "\n";
	std::cout << "Custo: " << this->custo << "\n";
	std::cout << "Estoque: " << this->estoque << "\n";
	std::cout << "--------------------------------------\n";
}