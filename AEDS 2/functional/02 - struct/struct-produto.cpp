#include <iostream>
#include <vector>
#include <string.h>
/*
  Temos uma lista de produtos, cada produto deve conter as seguintes informações: nome, custo, preco e
  estoque.
  *Faça um relatorio com os produtos. Considere abaixo de 10.
  *Calcule o percentual de lucro de cada produto.
  *Qual o valor em mercadoria que o comerciante tem?
*/

struct PRODUTO {
  std::string nome;
  float custo;
  float preco;
  int estoque;
};

// função contrutora do produto
void novoProduto(PRODUTO &produto, const std::string nome, const float custo, const float preco, const int estoque) {
  produto.nome = nome;
  produto.custo = custo;
  produto.preco = preco;
  produto.estoque = estoque;
}

void printarProduto(PRODUTO &produto) {
  std::cout << "---- INFORMACOES DO PRODUTO ----"<< "\n";
  std::cout << "Nome: \t\t" << produto.nome << "\n";
  std::cout << "Custo: \t\t$" << produto.custo << "\n";
  std::cout << "Preco: \t\t$" << produto.preco << "\n";
  std::cout << "Estoque: \t" << produto.estoque << "\n";
  std::cout << "--------------------------------" << "\n\n";
}

float calcularPorcentagemDeLucro(PRODUTO &produto) {
  return (((produto.preco*100)/produto.custo)-100);
}

float calcularValorEmMercadoria(PRODUTO *produto, const int SIZE) {
  float total=0;

  for (int i=0; i<SIZE; i++) {
    total += produto[i].custo;
  }

  return total;
}

void printarPercentuaisDeLucro(PRODUTO *produto, const int SIZE) {
  std::cout << "---- PERCENTUAL DE LUCRO ----"<< "\n";
  for (int i=0; i<SIZE; i++) {
    std::cout << produto[i].nome << " (" << calcularPorcentagemDeLucro(produto[i]) << "%)" << "\n";
  }
  std::cout << "-----------------------------" << "\n\n";
}

int main(){
  constexpr int SIZE = 5;
  PRODUTO *produtos;
  produtos = new PRODUTO[SIZE];

  novoProduto(produtos[0], "Salsicha", 1.0, 2.0, 5);
  novoProduto(produtos[1], "Sardinha", 5.0, 8.0, 8);
  novoProduto(produtos[2], "Arroz", 20.0, 30.0, 10);
  novoProduto(produtos[3], "Feijao", 5.0, 7.0, 15);
  novoProduto(produtos[4], "Salada", 4.0, 8.0, 1);

  for (int i=0; i<SIZE; i++) {
    printarProduto(produtos[i]);
  }

  printarPercentuaisDeLucro(produtos, SIZE);

  std::cout << "Total em mercadoria: $" << calcularValorEmMercadoria(produtos, SIZE) << "\n";
  
  return 0;
}