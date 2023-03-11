#include <iostream>
#include <string>

/*
  Escreva um trecho de codigo para fazer a criac¸ ´ ao dos novos tipos de dados conforme ˜
  solicitado abaixo:
  • Horario: composto de hora, minutos e segundos. ´
  • Data: composto de dia, mes e ano. ˆ
  • Compromisso: composto de uma data, horario e texto que descreve o compromisso.
*/

/* A documentação da microsoft sugere que as structs sejam criadas em CAPS, portanto seguirei o padrão */
struct HORARIO {
  int h;
  int m;
  int s;
};

struct DATA {
  int d;
  int m;
  int a;
};

struct COMPROMISSO {
  DATA data;
  HORARIO horario;
  std::string desc;
};

void checarFormValido(int min, int max, int &val) {
  while (val<min || val>max) {
    std::cout << "Insira novamente (valores entre " << min << " e " << max << "): ";
    std::cin >> val;
  }
}

void printarCompromisso(COMPROMISSO &c) {
  std::cout << c.desc << " - " << c.data.d <<"/"<< c.data.m <<"/"<< c.data.a <<"" << " (as "<< c.horario.h <<"h "<< c.horario.m <<"m "<< c.horario.s <<"s)" << std::endl;
}

int main() {

  COMPROMISSO cpms;
  std::cout << "Insira o dia: ";
  std::cin >> cpms.data.d;
  checarFormValido(1, 31, cpms.data.d);
  std::cout << "Insira o mes: ";
  std::cin >> cpms.data.m;
  checarFormValido(1, 12, cpms.data.m);
  std::cout << "Insira o ano: ";
  std::cin >> cpms.data.a;
  // checar se cpms.data.a >= anoAtual usando a lib chrono

  std::cout << "Insira as horas: ";
  std::cin >> cpms.horario.h;
  checarFormValido(0, 23, cpms.horario.h);
  std::cout << "Insira os minutos: ";
  std::cin >> cpms.horario.m;
  checarFormValido(0, 59, cpms.horario.m);
  std::cout << "Insira os segundos: ";
  std::cin >> cpms.horario.s;
  checarFormValido(0, 59, cpms.horario.s);

  // checar se a data inserida eh menor do que a data atual, se for, pedir para inserir novamente

  
  std::cout << "Insira a descricao do compromisso: ";
  std::cin.ignore();
  std::getline( std::cin , cpms.desc );
  // std::cin >> cpms.desc;

  printarCompromisso(cpms);

  return 0;
}