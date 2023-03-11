#pragma once

#include "produto.h"

class listaContigua
{
private:
	/* Variables */
	int tamanho;
	int quantidade;
	produto *Lista;

	/* Retorna verdadeiro se a Lista ainda tem espaço */
	bool temEspaco();

	/* Retorna verdadeiro se a o index passado existe */
	bool temIndexValido(int index);

	/* Arrasta todos os índices para o começo */
	void shiftFront(int index);

	/* Arrasta todos os índices para o final */
	void shiftEnd(int index);

public:
	/* Construtor */
	listaContigua(int tamanho=10);

	/* Retorna a quantidade ja inserida na lista */
	int getQuantidade();

	/* Retorna o tipo Produto relativo ao index */
	produto getProdutoByIndex(int index);

	/*
	 * Inserir um novo Produto na Lista
	 * Chamar sem parametro (index) pede o usuário para inserir os dados do produto
	 * Chamar com o produto como parametro para inseri-lo diretamente
	 */
	void inserir(int index = 0);
	void inserir(const produto prod, int index=0);

	/*
	 * Printar a Lista
	 * Chamar sem parametro (index) para printar toda lista
	 */
	void print();
	void print(int index);

	/* Apaga o produto relativo ao index */
	void remover(int index=0);
};

