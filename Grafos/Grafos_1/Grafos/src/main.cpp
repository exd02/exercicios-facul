#include <iostream>

#include "Grafo.h"

int main()
{
    int n = 6;
    Grafo a(n);
    a.AddAresta(2,1);
    a.AddAresta(3,0);
    a.AddAresta(3,1);
    a.AddAresta(3,2);
    a.AddAresta(4,3);
    a.AddAresta(5,3);
    a.AddAresta(5,4);

    std::cout << "[+] Grafo: " << std::endl;
    std::cout << a.ToString() << std::endl;

    std::cout << "[+] Informacoes do Grafo: " << std::endl;
    std::cout << "\t[-] Simples? " << (a.EhSimples() ? "Sim" : "Nao") << std::endl;
    std::cout << "\t\t[-] Tem Laco? " << (a.TemLaco() ? "Sim" : "Nao") << std::endl;
    std::cout << "\t\t[-] Tem alguma Aresta Dirigida? " << (a.TemArestaDirigida() ? "Sim" : "Nao") << std::endl;
    std::cout << "\t[-] Eh Conexo? " << (a.EhConexo() ? "Sim" : "Nao") << std::endl;
    std::cout << "\t[-] Eh Completo? " << (a.EhCompleto() ? "Sim" : "Nao") << std::endl;
    std::cout << "\t[-] Eh Pseudografo? " << "???" << std::endl;
    std::cout << "\t[-] Eh Multigrafo? " << "???" << std::endl;
    std::cout << "\t[-] Ordem? " << "???" << std::endl;
    std::cout << "\t[-] Tamanho? " << "???" << std::endl;
    std::cout << "\t[-] Grau dos vertices: " << std::endl;

    std::vector<int> grauVertices = a.GrauVertices();
    for (int i = 0; i < n; i++)
    {
        std::cout << "\t\t[-] V[" << i << "]: " << grauVertices[i] << std::endl;
    }

    std::cout << "\t[-] Grafo regular? " << "???" << std::endl;
}
