package src;

public class ListaDuplamenteEncadeada {

    private Node inicio;
    private int tamanho;

    /**
     * Metodo para adicionar um elemento inteiro a lista.
     * 
     * @param _valor elemento a ser adicionado.
     */
    public void adicionar(int _valor) {
        Node _node = new Node(_valor);
        if (this.inicio == null) {
            this.inicio = _node;
        } else {
            Node aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(_node);
            _node.setAnterior(aux);
        }
        tamanho++;
    }

    /**
     * Metodo que retorna o valor armazenado em determinada posicao
     * 
     * @param _posicao posicao
     * @return retorna o valor se existir, caso contrario, retorna -99.
     */
    // [0,1,2,3,4,5] - 4 > 3
    // ->
    // <- 6-4 = 2
    // -2
    // [0,1,2,3,4,5]
    // <-
    public int get(int _posicao) {
        if (_posicao > this.tamanho) {
            return -99;
        }
        if (_posicao == 0) {
            return this.inicio.getValor();
        } else {
            Node aux = this.inicio;
            while (aux.getProximo() != null & _posicao > 0) {
                aux = aux.getProximo();
                _posicao--;
            }
            return aux.getValor();
        }
    }

    /**
     * Metodo para remover um valor dentro do vetor
     * 
     * @param _valor
     */
    public void remover(int _valor) {
        Node aux = this.inicio;
        Node anterior = null;
        while (aux.getProximo() != null && aux.getValor() != _valor) {
            anterior = aux;
            aux = aux.getProximo();
        }
        aux.getProximo().setAnterior(anterior);
        anterior.setProximo(aux.getProximo());
        this.tamanho--;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node aux = this.inicio;
        while (aux.getProximo() != null) {
            str.append(aux.getValor() + " ");
            aux = aux.getProximo();
        }
        str.append("]");
        return str.toString();
    }

}