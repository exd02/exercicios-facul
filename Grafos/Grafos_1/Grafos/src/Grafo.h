#pragma once

#include <iostream>
#include <vector>
#include <string>

class Grafo
{
private:
	int numVertices;
	std::vector<std::vector<int>> grafo;

	// é melhor criar uma variável para saber se é simples ou não (analisando ao inserir uma aresta)
	// do que ficar rodando a função EhSimples, que tem complexidade quadrática
	bool ehSimples;
	bool ehDirigido;
	bool ehPseudografo;
	bool ehConexo;

public:
	Grafo(const int tamanho);

    inline int getNumVertices() const {
        return numVertices;
    }

    inline bool getEhSimples() const {
        return ehSimples;
    }

    inline bool getEhDirigido() const {
        return ehDirigido;
    }

    inline bool getEhPseudografo() const {
        return ehPseudografo;
    }

    inline bool getEhConexo() const {
        return ehConexo;
    }

    inline void setTamanho(int tamanho) {
        this->numVertices = tamanho;
    }

    inline void setSimples(bool ehSimples) {
        this->ehSimples = ehSimples;
    }

    inline void setDirigido(bool ehDirigido) {
        this->ehDirigido = ehDirigido;
    }

    inline void setPseudografo(bool ehPseudografo) {
        this->ehPseudografo = ehPseudografo;
    }

    inline void setConexo(bool ehConexo) {
        this->ehConexo = ehConexo;
    }

	std::string ToString();
	void AddAresta(const int from, const int to, bool isDirected = false);
	
	// Essas funções não são necessárias, pois é melhor usar os atributos da classe que verificam o seu estado quando uma aresta é inserida (mais performático)
	bool EhSimples();
	bool EhConexo();
	bool EhCompleto();
	// pseudografo e multigrafo são a mesma coisa
	bool EhPseudografo();
	bool EhRegular();

	bool TemLaco();
	bool TemArestaDirigida();

	int GrauVertice(const int v);
	std::vector<int> GrauVertices();
};

