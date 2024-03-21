#pragma once

#include <iostream>
#include <vector>
#include <string>

class Grafo
{
private:
	int tamanho;
	std::vector<std::vector<int>> grafo;

	// é melhor criar uma variável para saber se é simples ou não (analisando ao inserir uma aresta)
	// do que ficar rodando a função EhSimples, que tem complexidade quadrática
	bool ehSimples;

public:
	Grafo(const int tamanho);
	std::string ToString();
	void AddAresta(const int from, const int to, bool isDirected = false);
	
	// Essas funções não são necessárias, pois é melhor usar os atributos da classe que verificam o seu estado quando uma aresta é inserida (mais performático)
	bool EhSimples();
	bool EhConexo();
	bool EhCompleto();
	// bool EhPseudografo();
	// bool EhMultigrafo();

	bool TemLaco();
	bool TemArestaDirigida();

	int GrauVertice(const int v);
	std::vector<int> GrauVertices();
};

