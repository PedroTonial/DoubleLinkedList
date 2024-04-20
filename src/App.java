import java.sql.SQLOutput;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
/********************************************************
/Aplicação de teste para a DoubleLinkedListOfInteger
**********************************************************/
        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();
        dlist.add(10);
        dlist.add(35);
        dlist.add(30);
        dlist.add(40);
        dlist.add(50);
        dlist.add(60);
        dlist.add(70);
        dlist.add(80);

        System.out.println("Lista atual: " + dlist);
        System.out.println("Tamanho da lista: " + dlist.size());

        System.out.println("Busca valor na posição 2: " + dlist.get(2));
        System.out.println("Busca valor na posição 6: " + dlist.get(6));
        
        System.out.println("Trocou " + dlist.set(2, 35) + " por 35 na posicao 2.");
        
        System.out.println("Removeu 50? " + dlist.remove(50));
        System.out.println("Removeu 57? " + dlist.remove(57));

        System.out.println("Lista atual: " + dlist);

        dlist.add(0,0);
        dlist.add(dlist.size(),90);
        dlist.add(4,44);
        System.out.println("Lista atual: " + dlist);

        System.out.println("List de trás para frente: " + dlist.toStringBackToFront());
        System.out.println("Ocorrências: " + dlist.countOccurrences(10));
        System.out.println("Removeram-se os pares: " + dlist.removeEvenNumbers());
        System.out.println("Lista atual: " + dlist);


/*****************************************************************************
 * Aplicação de testes para a StackOfInteger
 *******************************************************************************/
        StackOfInteger stack = new StackOfInteger();

        // Adicionando elementos à pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Executando os métodos principais de manipulação
        System.out.println("Topo da pilha: " + stack.top());
        System.out.println("Removido: " + stack.pop());
        System.out.println("Tamanho atual: " + stack.size());
        System.out.println("Pilha vazia: " + stack.isEmpty());

        //Verificando limpeza da pilha
        System.out.println("Limpando a pilha");
        stack.clear();
        System.out.println("Pilha vazia: " + stack.isEmpty());

        //Método estático para inversão de pilha utilizando arrays
        int [] arrayOriginal = {1,2,3,4,5};
        System.out.println("Array original para ser invertido: " + Arrays.toString(arrayOriginal));
        System.out.println("Invertendo um array usando Pilha: " + Arrays.toString(StackOfInteger.reverseArrayUsingStack(arrayOriginal)));


        /******************************************************************
         Manipulando testes para filas
         *******************************************************************/

        QueueOfInteger queue = new QueueOfInteger();
        QueueOfInteger queuePrioritaria = new QueueOfInteger();

        //Criando a lista com valores iniciais
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        //Executando métodos básicos
        System.out.println("Fila inicial: " + queue);
        System.out.println("Elemento na frente da fila: " + queue.head());
        System.out.println("Removido: " + queue.dequeue());
        System.out.println("Fila atual: " + queue);
        System.out.println("Fila vazia: " + queue.isEmpty());

        //Criando fila com ordenamento prioritário
        queuePrioritaria.enqueuePriority(80);
        queuePrioritaria.enqueuePriority(20);
        queuePrioritaria.enqueuePriority(50);

        //Verificando a ordem da fila priotitária
        System.out.println("Lista com prioridades: " + queuePrioritaria);
    }

}
