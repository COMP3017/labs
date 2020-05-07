package src;

import java.util.Arrays;

public class Vetor {
    int elementos[];
    int posicoesOcupadas;
    int ultima_posicao;

    Vetor() {
        this.elementos = new int[5];
        this.posicoesOcupadas = 0;
    }

    // [0,0,0,0,0] +1
    // [0,0,0,0,0] +5
    // [0,0,0,0,0] x2
    // [0,0,0,0,0] ^2
    /**
     * Metodo para dicionar um valor no vetor
     * 
     * @param _valor valor a ser adicionado.
     */
    public void adicionar(int _valor) {
        elementos[ultima_posicao] = _valor;
        posicoesOcupadas++;
        // atualizar o indice da ultima_posicao
        // se a proxima posicao nao estiver ocupada.
        if (ultima_posicao == elementos.length - 1) {
            // AUMENTAR O TAMANHO DO "VETOR"
            return;
            // E ADICIONAR O ELEMENTO.
            // elementos[ultima_posicao] = _valor;
        }
        if (elementos[ultima_posicao + 1] == 0) {
            ultima_posicao = ultima_posicao + 1;
        } else {
            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] == 0) {
                    ultima_posicao = i;
                    break;
                }
            }
        }
        // senao procurar a proxima posicao desocupada.

        // for (int i = 0; i < elementos.length; i++) {
        // if(elementos[i] == 0){
        // elementos[i] = _valor;
        // break;
        // }
        // }
    }

    public void remover(int _indice) {
        elementos[_indice] = 0;

        if (ultima_posicao > _indice) {
            ultima_posicao = _indice;
        }

    }

    // [0,7,3,4,8]
    /**
     * Metodo para buscar um determinado valor no vetor. Retorna -1 caso nao
     * encontre.
     * 
     * @param _valor
     * @return retorna o indice do valor encontrado.
     */
    public int buscar(int _valor) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == _valor)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Vetor{" + "elementos=" + Arrays.toString(elementos) + '}';
    }

    public int getTamanho() {
        return this.posicoesOcupadas;
    }

}