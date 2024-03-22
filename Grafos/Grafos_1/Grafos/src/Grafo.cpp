#include "Grafo.h"

Grafo::Grafo(const int tamanho) {
	this->numVertices = tamanho;
	this->ehSimples = true;
	this->ehDirigido = false;
	this->ehPseudografo = false;

	std::vector<int> linha(tamanho);
	for (int i = 0; i < tamanho; i++)
	{
		this->grafo.push_back(linha);
	}
}

std::string Grafo::ToString() {
	std::string s;
	for (int m = 0; m < numVertices; m++) {
		for (int n = 0; n < numVertices; n++) {
			s += std::to_string(grafo[m][n]) + " ";
		}
		s += '\n';
	}
	return s;
}

void Grafo::AddAresta(const int from, const int to, bool isDirected) {
	grafo[from][to]++;
	if (!isDirected)
		grafo[to][from]++;

	if (isDirected && grafo[from][to] != grafo[to][from])
		ehDirigido = false;

	if (to == from || ehDirigido)
		ehSimples = false;

	if (!ehDirigido && grafo[from][to] > 1)
		ehPseudografo = true;
}

bool Grafo::TemLaco() {
	for (int i = 0; i < numVertices; i++) {
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
	for (int m = 0; m < numVertices; m++) {
		for (int n = 1+m; n < numVertices; n++) {
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
	
	for (int m = 0; m < numVertices; m++) {

		bool fazAlgumaLigacao = false;

		// se o grafo for simples, basta olhar a parte de cima da diagonal principal (1+m), diminuindo a complexidade
		for (int n = ehSimples ? 1 + m : 0; n < numVertices; n++) {
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

	for (int m = 0; m < numVertices; m++) {
		for (int n = ehSimples ? 1 + m : 0; n < numVertices; n++) {
			if (m != n && !grafo[m][n])
				return false;
		}
	}

	return true;
}

int Grafo::GrauVertice(const int v) {
	int grau = 0;

	for (int n = ehSimples ? 1 + v : 0; n < numVertices; n++) {
		if (grafo[v][n])
			grau++;
	}

	return grau;
}

std::vector<int> Grafo::GrauVertices() {
	std::vector<int> grauVertices(numVertices);

	for (int m = 0; m < numVertices; m++) {
		for (int n = 0; n < numVertices; n++) {
			if (grafo[m][n])
				grauVertices[m]++;
		}
	}

	return grauVertices;
}

bool Grafo::EhPseudografo() {
	for (int m = 0; m < numVertices; m++) {
		for (int n = ehSimples ? m : 0; n < numVertices; n++) {
			if (grafo[m][n] > 1)
				return true;
		}
	}
	return false;
}

bool Grafo::EhRegular() {
	std::vector<int> grauVertices = GrauVertices();

	for (int i = 0; i < numVertices-1; i++)
	{
		if (grauVertices[i] != grauVertices[i + 1])
			return false;
	}

	return true;
}