public class MapaDeHash {
    private static final int SIZE = 10;
    private int elementCount = 0;
    private java.util.Stack<Node>[] table;

    @SuppressWarnings("unchecked")
    public MapaDeHash() {
        table = new java.util.Stack[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new java.util.Stack<>();
        }
    }

    private int hash(int key) {
        return Math.abs(key) % SIZE;
    }

    public void put(int key, int value) {
        if (elementCount >= SIZE) {
            return;
        }
        int index = hash(key);
        table[index].push(new Node(key, value));
        elementCount++;
    }

    public Integer delete(int key) {
        int index = hash(key);
        if (table[index].isEmpty()) {
            return null;
        }
        Node top = table[index].peek();
        if (top.key == key) {
            elementCount--;
            return table[index].pop().value;
        }
        return null;
    }

    public Integer get(int key) {
        int index = hash(key);
        if (table[index].isEmpty()) {
            return null;
        }
        for (int i = table[index].size() - 1; i >= 0; i--) {
            Node node = table[index].get(i);
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < SIZE; i++) {
            table[i].clear();
        }
        elementCount = 0;
    }

    private class Node {
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
