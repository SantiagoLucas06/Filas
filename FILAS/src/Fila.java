import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class Fila {
    private Queue<Integer> queue;

    public Fila() {
        queue = new LinkedList<>();
    }

    public void enqueue(int item) {
        queue.add(item);
        System.out.println("Elemento " + item + " adicionado à fila.");
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        int removedItem = queue.remove();
        System.out.println("Elemento " + removedItem + " removido da fila.");
        return removedItem;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Elemento removido: " + fila.dequeue());

        // Tentando remover de uma fila vazia
        // System.out.println("Elemento removido: " + fila.dequeue());

        // Nesta implementação, utilizei a interface Queue do Java, que é implementada pela classe LinkedList.
        // A função enqueue() adiciona um elemento ao final da fila, enquanto dequeue() remove e retorna o elemento do início da fila.
        // O método isEmpty() é usado para verificar se a fila está vazia. O método main() é utilizado para testar a implementação.
    }
}
