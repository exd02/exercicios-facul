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

    std::cout << "[+] Simples? " << (a.EhSimples() ? "Sim" : "Nao") << std::endl;
    std::cout << "\t[-] Tem Laco? " << (a.TemLaco() ? "Sim" : "Nao") << std::endl;
    std::cout << "\t[-] Tem alguma Aresta Dirigida? " << (a.TemArestaDirigida() ? "Sim" : "Nao") << std::endl;
    std::cout << "[+] Eh Conexo? " << (a.EhConexo() ? "Sim" : "Nao") << std::endl;
    std::cout << "[+] Eh Completo? " << (a.EhCompleto() ? "Sim" : "Nao") << std::endl;
    std::cout << "[+] Eh Pseudografo/Multigrafo? " << (a.EhPseudografo() ? "Sim" : "Nao") << std::endl;
    std::cout << "[+] Ordem? " << a.getNumVertices() << std::endl;
    std::cout << "[+] Tamanho? " << std::endl;
    std::cout << "[+] Grau dos vertices: " << std::endl;

    std::vector<int> grauVertices = a.GrauVertices();
    for (int i = 0; i < n; i++)
    {
        std::cout << "\t[-] V[" << i << "]: " << grauVertices[i] << std::endl;
    }

    std::cout << "[+] Grafo regular? " << (a.EhRegular() ? "Sim" : "Nao") << std::endl;
}
