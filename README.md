# DoubleLinkedListOfInteger

Esta classe implementa uma lista duplamente encadeada para armazenar elementos inteiros em Java. A lista oferece operações de inserção, leitura, atualização e remoção, bem como outras funcionalidades úteis.

## Funcionalidades

- **Create (Criar)**: Adiciona novos elementos à lista.
- **Read (Ler)**: Recupera elementos da lista em uma determinada posição.
- **Update (Atualizar)**: Atualiza elementos em uma posição específica da lista.
- **Delete (Excluir)**: Remove elementos da lista, seja por valor ou por índice.
- **Outras Operações**: Verificar se a lista contém um determinado elemento, encontrar o índice de um elemento na lista, limpar a lista, obter o tamanho da lista, verificar se a lista está vazia, percorrer a lista do início ao fim, entre outros.

## Utilização

1. **Criação da Lista**:

```java
DoubleLinkedListOfInteger list = new DoubleLinkedListOfInteger();
```

2. **Adição de Elementos**:
```java
list.add(5); // Adiciona o elemento 5 ao final da lista
list.add(0, 10); // Insere o elemento 10 na primeira posição da lista
```
3. **Leitura de Elementos**:
```java
int element = list.get(0); // Retorna o elemento na primeira posição da lista
```
5. **Atualização de Elementos**:
```java
list.set(1, 20); // Atualiza o elemento na segunda posição da lista para 20

6. **Remoção de elementos**:
```java
list.remove(5); // Remove o elemento 5 da lista
int removedElement = list.removeByIndex(0); // Remove o elemento na primeira posição da lista e retorna seu valor

```
## Novas Funcionalidades
Novas funcionalidades serão implementadas ao decorrer do tempo de desenvolvimento da aplicação:
1. Sublista
Cria um novo arranjo de valores inteiros a partir de um escopo definido da lista original
2. Reverse
Inverte a lista encadeada
3. Contador de Ocorrências
Conta a quantidade de ocorrência de um elemento na lista encadeada

