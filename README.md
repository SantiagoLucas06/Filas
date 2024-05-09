###Complexidade Assintótica de tempo e espaço para cada método das estruturas de dados implementadas.

### Pilha:

### Método push:
- Tempo: O(1) - Adiciona um elemento ao topo da pilha, independentemente do tamanho da pilha.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

### Método pop:
- Tempo: O(1) - Remove o elemento do topo da pilha, independentemente do tamanho da pilha.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

### Fila:

### Método enqueue:
- Tempo: O(1) - Adiciona um elemento ao final da fila, independentemente do tamanho da fila.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

### Método dequeue:
- Tempo: O(1) - Remove o elemento do início da fila, independentemente do tamanho da fila.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

### Métodos rear e front:
- Ambos os métodos têm complexidade de tempo e espaço O(1) porque simplesmente retornam o valor do primeiro e do último elemento da fila, respectivamente, sem realizar operações complexas.

### Lista Encadeada:

### Método push:
- Tempo: O(n) - Adiciona um nó ao final da lista, onde n é o número de elementos na lista. Precisa percorrer a lista para encontrar o último nó.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

### Método pop:
- Tempo: O(n) - Remove o último nó da lista, onde n é o número de elementos na lista. Precisa percorrer a lista até o penúltimo nó.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

### Método insert:
- Tempo: O(n) - Adiciona um nó em uma posição específica da lista, onde n é o número de elementos na lista. Precisa percorrer a lista até o nó anterior à posição de inserção.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

### Método remove:
- Tempo: O(n) - Remove um nó de uma posição específica da lista, onde n é o número de elementos na lista. Precisa percorrer a lista até o nó anterior ao nó a ser removido.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

####Método elementAt:
- Tempo: O(n) - Retorna o nó em uma posição específica da lista, onde n é o número de elementos na lista. Precisa percorrer a lista até o nó desejado.
- Espaço: O(1) - Utiliza uma quantidade constante de espaço adicional.

Essas análises consideram o comportamento médio dos métodos em cenários típicos de uso. 
Note que os métodos push e pop da pilha e os métodos enqueue e dequeue da fila têm complexidade O(1) porque operam apenas no início ou no final da estrutura de dados, que são acessíveis em tempo constante. 
Já na lista encadeada, a complexidade de tempo depende da posição do nó que está sendo acessado ou modificado, e é proporcional ao tamanho atual da lista.
