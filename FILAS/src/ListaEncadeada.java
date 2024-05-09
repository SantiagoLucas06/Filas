public class ListaEncadeada {
    private Node head;
    private int size;

    public ListaEncadeada() {
        head = null;
        size = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public Node pop() {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        if (previous != null) {
            previous.next = null;
        } else {
            head = null;
        }
        size--;
        return current;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));

        System.out.println("Lista:");
        lista.printList();

        System.out.println("Elemento removido do fim: " + lista.pop().data);
        System.out.println("Lista após a remoção:");
        lista.printList();

        lista.insert(1, new Node(25));
        System.out.println("Lista após a inserção:");
        lista.printList();

        lista.remove(1);
        System.out.println("Lista após a remoção:");
        lista.printList();

        System.out.println("Elemento no índice 1: " + lista.elementAt(1).data);
        System.out.println("Tamanho da lista: " + lista.size());
    }
}
//Esta implementação possui uma classe Node que representa um nó na lista encadeada e uma classe ListaEncadeada que manipula os nós.
// Os métodos push() e pop() adicionam e removem um nó no final da lista, respectivamente.
// O método insert() adiciona um nó em uma posição específica da lista, enquanto remove() remove um nó de uma posição específica.
// O método elementAt() retorna o nó em uma posição específica da lista e size() retorna o tamanho da lista. O método printList() é utilizado para imprimir os elementos da lista encadeada.
// O método main() é utilizado para testar a implementação.