public class StackOfInteger {
    private DoubleLinkedListOfInteger stack;

    public StackOfInteger(){
        stack = new DoubleLinkedListOfInteger();
    }

    //remove o último elemento adicionado e retorna esse mesmo elemento
    public Integer pop(){
        if (stack.isEmpty()){
            throw new RuntimeException("Pilha vazia!");
        }
        return stack.removeByIndex(stack.size()-1);
    }

    public Integer push(Integer element){
        stack.add(element);
        return element;
    }

    public Integer top(){
        if (stack.isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return stack.get(stack.size()-1);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void clear(){
        stack.clear();
    }

    public static int[] reverseArrayUsingStack(int[] array) {
        StackOfInteger stack = new StackOfInteger();
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = stack.pop();
        }

        return reversedArray;
    }

}
