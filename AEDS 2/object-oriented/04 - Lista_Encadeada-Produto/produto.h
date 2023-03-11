#pragma once

#include <iostream>
#include <string>

class produto
{
private:
	std::string nome;
	float custo;
	float preco;
	int estoque;
public:
	/* Construtor */
	produto();
	produto(std::string nome, float custo, float preco, int estoque);

	/* Copiar */
	void copiar(const produto outro);

	/* Retorna o parâmetro 'std::string nome' */
	std::string getNome();

	/* Retorna o parâmetro 'float custo' */
	float getCusto();

	/* Retorna o parâmetro 'float preco' */
	float getPreco();

	/* Retorna o parâmetro 'int estoque' */
	int getEstoque();

	/* Altera o parâmetro 'std::string nome' */
	void setNome(std::string nome);

	/* Altera o parâmetro 'float custo' */
	void setCusto(float custo);

	/* Altera o parâmetro 'float preco' */
	void setPreco(float preco);

	/* Altera o parâmetro 'int estoque' */
	void setEstoque(int estoque);

	/* Pede para o usuário inserir todos os dados do produto */
	void preencherCampos();

	/* Imprime todos os dados do produto */
	void imprimirProduto();
};
