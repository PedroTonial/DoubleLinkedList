public class QueueOfInteger {
    private DoubleLinkedListOfInteger queue;

    public QueueOfInteger(){
        queue = new DoubleLinkedListOfInteger();
    }

    public Integer enqueue (Integer element){
        queue.add(element);
        return element;
    }

    public Integer dequeue(){
        if (queue.isEmpty()){
           throw new RuntimeException("Fila vazia!");
        }
        return queue.removeByIndex(0);
    }

    public Integer head(){
        if (queue.isEmpty()){
            throw new RuntimeException("Fila vazia!");
        }
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void clear() {
        queue.clear();
    }
    public void enqueuePriority(Integer element) {

        if (isEmpty() || element > queue.get(0)) {
            queue.add(0, element);
        } else {
            //Percorrer a fila para encontrar a posição que equivale a sua prioridade
            int index = 0;
            while (index < queue.size() && element <= queue.get(index)) {
                index++;
            }
            queue.add(index, element);
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
