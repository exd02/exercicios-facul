#include <iostream>

/* devemos passar o tamanho do array como parâmetro para as funções, - https://stackoverflow.com/questions/19894686/getting-size-of-array-from-pointer-c */
int contarOcorrencias(int num, int *lista, int tamanhoLista) {
    int j=0;
    for (int i=0; i<tamanhoLista; i++) {
        if (lista[i] == num)
            j++;
    }
    return j;
}

void mostrarLista(int *lista, int tamanhoLista) {
    for (int i=0; i<tamanhoLista; i++) {
        std::cout <<  lista[i] << " ";
    }
    std::cout << std::endl;
}

void preencherListaNova(int num, int *listaAntiga, int tamanhoListaAntiga, int *listaNova, int tamanhoListaNova) {
    int j=0;
    for(int i=0; i<tamanhoListaAntiga; i++) {
        if (listaAntiga[i] != num) {
            listaNova[j] = listaAntiga[i];
            j++;
        }
    }
}

int main() {
    constexpr int tamanhoLista = 10;
    int lista[tamanhoLista] = {78,1,9,4,78,6,8,9,78,0};
    mostrarLista(lista, tamanhoLista);

    int numRemover = 78;
    int ocorrencias = contarOcorrencias(numRemover, lista, tamanhoLista);
    std::cout << "Ocorrencias do numero  " << numRemover << ": " << ocorrencias <<  std::endl;

    int tamanhoListaNova = tamanhoLista - ocorrencias;
    int *listaNova;
    listaNova = new int [tamanhoListaNova];

    preencherListaNova(numRemover, lista, tamanhoLista, listaNova, tamanhoListaNova);

    mostrarLista(listaNova, tamanhoListaNova);

    return 0;
}