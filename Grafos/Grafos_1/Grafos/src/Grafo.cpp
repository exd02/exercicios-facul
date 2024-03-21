#include "Grafo.h"

Grafo::Grafo(const int tamanho) {
	this->tamanho = tamanho;
	this->ehSimples = true;

	std::vector<int> linha(tamanho);
	for (int i = 0; i < tamanho; i++)
	{
		this->grafo.push_back(linha);
	}
}

std::string Grafo::ToString() {
	std::string s;
	for (int m = 0; m < tamanho; m++) {
		for (int n = 0; n < tamanho; n++) {
			s += std::to_string(grafo[m][n]) + " ";
		}
		s += '\n';
	}
	return s;
}

void Grafo::AddAresta(const int from, const int to, bool isDirected) {
	grafo[from][to] = 1;
	if (!isDirected)
		grafo[to][from] = 1;

	if (to == from || isDirected)
		ehSimples = false;
}

bool Grafo::TemLaco() {
	for (int i = 0; i < tamanho; i++) {
		// a diagonal principal não pode ser 1 (grafo simples não tem laço)
		if (grafo[i][i]) {
			return true;
		}
	}
	return false;
}

bool Grafo::TemArestaDirigida() {
	// basta verificar se a parte acima da diagonal principal é igual a de baixo ([m][n] == [n][m])
	// pois no gráfico simples as ligações são não dirigidas (tudo que vai volta)
	//          N=0  N=1  N=2  N=3
	// M=0 ->   -    1    0    0
	// M=1 ->   1    -    0    0
	// M=2 ->   0    0    -    1
	// M=3 ->   0    0    1    -
	// exemplo: [0][1] == [1][0]?
	for (int m = 0; m < tamanho; m++) {
		for (int n = 1+m; n < tamanho; n++) {
			if (grafo[m][n] != grafo[n][m])
				return true;
		}
	}
	return false;
}

bool Grafo::EhSimples() {
	if (TemLaco() || TemArestaDirigida())
		return false;

	return true;
}

bool Grafo::EhConexo() {
	
	for (int m = 0; m < tamanho; m++) {

		bool fazAlgumaLigacao = false;

		// se o grafo for simples, basta olhar a parte de cima da diagonal principal (1+m), diminuindo a complexidade
		for (int n = ehSimples ? 1 + m : 0; n < tamanho; n++) {
			if (grafo[m][n]) {
				fazAlgumaLigacao = true;
				break;
			}
		}

		if (!fazAlgumaLigacao)
			return false;
	}

	return true;
}

bool Grafo::EhCompleto() {

	for (int m = 0; m < tamanho; m++) {
		for (int n = ehSimples ? 1 + m : 0; n < tamanho; n++) {
			if (!grafo[m][n])
				return false;
		}
	}

	return true;
}

int Grafo::GrauVertice(const int v) {
	int grau = 0;

	for (int n = ehSimples ? 1 + v : 0; n < tamanho; n++) {
		if (grafo[v][n])
			grau++;
	}

	return grau;
}

std::vector<int> Grafo::GrauVertices() {
	std::vector<int> grauVertices(tamanho);

	for (int m = 0; m < tamanho; m++) {
		for (int n = ehSimples ? 1 + m : 0; n < tamanho; n++) {
			if (grafo[m][n])
				grauVertices[m]++;
		}
	}

	return grauVertices;
}