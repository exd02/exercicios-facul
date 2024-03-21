#pragma once

#include <iostream>
#include <vector>
#include <string>

class Grafo
{
private:
	int tamanho;
	std::vector<std::vector<int>> grafo;

	// � melhor criar uma vari�vel para saber se � simples ou n�o (analisando ao inserir uma aresta)
	// do que ficar rodando a fun��o EhSimples, que tem complexidade quadr�tica
	bool ehSimples;

public:
	Grafo(const int tamanho);
	std::string ToString();
	void AddAresta(const int from, const int to, bool isDirected = false);
	
	// Essas fun��es n�o s�o necess�rias, pois � melhor usar os atributos da classe que verificam o seu estado quando uma aresta � inserida (mais perform�tico)
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

