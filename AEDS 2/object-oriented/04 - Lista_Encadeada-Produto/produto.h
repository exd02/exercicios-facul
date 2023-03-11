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

	/* Retorna o par�metro 'std::string nome' */
	std::string getNome();

	/* Retorna o par�metro 'float custo' */
	float getCusto();

	/* Retorna o par�metro 'float preco' */
	float getPreco();

	/* Retorna o par�metro 'int estoque' */
	int getEstoque();

	/* Altera o par�metro 'std::string nome' */
	void setNome(std::string nome);

	/* Altera o par�metro 'float custo' */
	void setCusto(float custo);

	/* Altera o par�metro 'float preco' */
	void setPreco(float preco);

	/* Altera o par�metro 'int estoque' */
	void setEstoque(int estoque);

	/* Pede para o usu�rio inserir todos os dados do produto */
	void preencherCampos();

	/* Imprime todos os dados do produto */
	void imprimirProduto();
};
