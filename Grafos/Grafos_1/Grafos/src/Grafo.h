#pragma once

#include <iostream>
#include <vector>
#include <string>

class Grafo
{
private:
	int numVertices;
	std::vector<std::vector<int>> grafo;

	// � melhor criar uma vari�vel para saber se � simples ou n�o (analisando ao inserir uma aresta)
	// do que ficar rodando a fun��o EhSimples, que tem complexidade quadr�tica
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
	
	// Essas fun��es n�o s�o necess�rias, pois � melhor usar os atributos da classe que verificam o seu estado quando uma aresta � inserida (mais perform�tico)
	bool EhSimples();
	bool EhConexo();
	bool EhCompleto();
	// pseudografo e multigrafo s�o a mesma coisa
	bool EhPseudografo();
	bool EhRegular();

	bool TemLaco();
	bool TemArestaDirigida();

	int GrauVertice(const int v);
	std::vector<int> GrauVertices();
};

