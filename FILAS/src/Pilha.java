import java.util.EmptyStackException;

public class Pilha {
    private int[] array;
    private int top;
    private int capacity;

    public Pilha(int size) {
        capacity = size;
        array = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
            return;
        }
        array[++top] = item;
        System.out.println("Elemento " + item + " adicionado à pilha.");
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = array[top--];
        System.out.println("Elemento " + poppedElement + " removido da pilha.");
        return poppedElement;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());

        // Tentando remover de uma pilha vazia
        // System.out.println("Elemento removido: " + pilha.pop());

        //Esta classe Pilha tem um array para armazenar os elementos, um inteiro top para manter o índice do topo da pilha e um inteiro capacity para definir o tamanho máximo da pilha.
        // Os métodos push() e pop() são implementados, juntamente com os métodos isEmpty() e isFull() para verificar se a pilha está vazia ou cheia.
        // O método main() é usado para testar a implementação.
    }
}