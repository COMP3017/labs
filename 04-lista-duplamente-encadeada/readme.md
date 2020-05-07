# Laboratório 4

Nesta atividade, vocês deverão alterar o método `public int get(int _posicao)` da classe `ListDuplamenteEncadeada`. O método deve ter os seguintes comportamentos:

- Continua sendo uma busca simples de um elemento, onde passamos o índice desejado, e ele retorna o valor armazenado
- Quando o índice for menor que a metade do vetor, o algoritmo deve percorrer naturalmente, ou seja, incrementando os índices do laço positivamente
- Quando o índice for maior que a metade do vetor, o algoritmo deve percorrer de "trás para frente"
- O algoritmo recebe índices negativos, e deve percorrer os elementos de "trás para frente", sendo o `-1` o último elemento, `-2` o penúltimo, e assim por diante.

Para ilustrar rapidamente o comportamento, segue exemplo abaixo com os _outputs_ esperados:

```java
ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
for (int i = 0; i < 10; i++) {
    lista.adicionar(i+1);
}
> [1,2,3,4,5,6,7,8,9,10]

lista.get(3);
> 4
lista.get(-6);
> 5
lista.get(-3);
> 8
lista.get(7);
> 8
```
