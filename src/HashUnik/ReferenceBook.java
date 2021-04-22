package HashUnik;

import java.util.*;

public class ReferenceBook<K, V> implements Book<K, V> {
    private Node<K, V>[] hashTable;
    private int size = 0;
    private float threshold;

    public ReferenceBook() {
        hashTable = new Node[16];
        threshold = hashTable.length * 0.75f;
    }

    @Override
    public boolean insert(final K key, final V value) {
        if (size + 1 >= threshold) {
            threshold *= 2;
            arrayDoubling();
        }

        Node<K, V> newNode = new Node<>(key, value);
        int index = newNode.hash();

        if (hashTable[index] == null) {
            return simpleAdd(index, newNode);
        }

        List<Node<K, V>> nodeList = hashTable[index].getNodes();

        for (Node<K, V> node : nodeList) {
            if (keyExistButValueNew(node, newNode, value) ||
                    collisionProcessing(node, newNode, nodeList)
            ) {

                return true;
            }
        }

        return false;
    }

    private boolean simpleAdd(int index, Node<K, V> newNode) {
        hashTable[index] = new Node<>(null, null);
        hashTable[index].getNodes().add(newNode);
        size++;
        return true;
    }

    private boolean keyExistButValueNew(
            final Node<K, V> nodeFromList,
            final Node<K, V> newNode,
            final V value) {

        if (newNode.getKey().equals(nodeFromList.getKey()) &&
                !newNode.getValue().equals(nodeFromList.getValue())
        ) {

            nodeFromList.setValue(value);
            return true;
        }

        return false;
    }

    private boolean collisionProcessing(
            final Node<K, V> nodeFromList,
            final Node<K, V> newNode,
            final List<Node<K, V>> nodes) {

        if (newNode.hashCode() == nodeFromList.hashCode() &&
                !Objects.equals(newNode.key, nodeFromList.key) &&
                !Objects.equals(newNode.value, nodeFromList.value)
        ) {

            nodes.add(newNode);
            size++;
            return true;
        }

        return false;
    }

    private void arrayDoubling() {
        Node<K, V>[] oldHashTable = hashTable;
        hashTable = new Node[oldHashTable.length * 2];
        size = 0;
        for (Node<K, V> node : oldHashTable) {
            if (node != null) {
                for (Node<K, V> n : node.getNodes()) {
                    insert(n.key, n.value);
                }
            }
        }
    }

    @Override
    public boolean delete(final K key) {
        int index = hash(key);
        if (hashTable[index] == null)
            return false;

        if (hashTable[index].getNodes().size() == 1) {
            hashTable[index].getNodes().remove(0);
            return true;
        }

        List<Node<K, V>> nodeList = hashTable[index].getNodes();
        for (Node<K, V> node : nodeList) {
            if ((key.equals(node.getKey()))) {
                nodeList.remove(node);
                return true;
            }
        }

        return false;
    }

    @Override
    public V get(final K key) {
        int index = hash(key);
        if (index < hashTable.length &&
                hashTable[index] != null) {

            List<Node<K, V>> list = hashTable[index].getNodes();
            for (Node<K, V> node : list) {
                if (key.equals(node.getKey())) {
                    return node.getValue();
                }
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private int hash(final K key) {

//        int hash = 0;
//
//        for (int i = 0; i < key.toString().length(); i++) {
//            hash = (31 * hash + key.hashCode()) % size;
//        }
//        return hash;

        int hash = 31;
        hash = hash * 17 + key.hashCode();
        return hash % hashTable.length;
    }

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            int counterArray = 0;
            int valuesCounter = 0;
            Iterator<Node<K, V>> subIterator = null;

            @Override
            public boolean hasNext() {
                if (valuesCounter == size)
                    return false;

                if (subIterator == null || !subIterator.hasNext()) {
                    if (moveToNextCell()) {
                        subIterator = hashTable[counterArray].getNodes().iterator();
                    } else {
                        return false;
                    }
                }

                return subIterator.hasNext();
            }

            private boolean moveToNextCell() {
                counterArray++;
                while (hashTable[counterArray] == null) {
                    counterArray++;
                }
                return hashTable[counterArray] != null;
            }


            @Override
            public V next() {
                valuesCounter++;
                return subIterator.next().getValue();
            }
        };
    }

    private class Node<K, V> {
        private List<Node<K, V>> nodes;
        private int hash;
        private K key;
        private V value;

        private Node(K key, V value) {
            this.key = key;
            this.value = value;
            nodes = new LinkedList<Node<K, V>>();
        }

        private List<Node<K, V>> getNodes() {
            return nodes;
        }

        private int hash() {
            return hashCode() % hashTable.length;
        }

        private K getKey() {
            return key;
        }

        private V getValue() {
            return value;
        }

        private void setValue(V value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            hash = 31;
            hash = hash * 17 + key.hashCode();
            return hash % hashTable.length;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj instanceof Node) {
                Node<K, V> node = (Node) obj;
                return (Objects.equals(key, node.getKey()) &&
                        Objects.equals(value, node.getValue()) ||
                        Objects.equals(hash, node.hashCode()));
            }
            return false;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
    public static void main(String[] args) {
        ReferenceBook<Integer, String> r = new ReferenceBook();

        String[] str1 = {"Hello", "World", "Goodbye"};
        for (int i = 0; i < str1.length; i++) {
            String str5 = testMulti.multi(str1[i]);
            r.insert(i, str5);
        }
        System.out.println("==================");
        for (int i = 0; i < r.size(); i++) {
            System.out.println("HashKey: " + r.get(i) + " = " + "Value: " + str1[i]);
            //System.out.println(str1[i]);
        }
       // System.out.println(r.size());
        //System.out.println(r.get(1));
        //System.out.println(r.get(1));
       // System.out.println(r.get(2));
        //System.out.println(r.size());
        //System.out.println(r.get(1));



    //HashMap<Integer, String> h = new HashMap<>();

        //r.insert("hu", 1);
        //System.out.println(r.get("hu"));

//        String[] str = {"qwe"};
//        String[] str1 = {"asd"};
//        String[] str2 = {"zxc"};
//        String[] str3 = {"dfg"};
//        String[] str4 = {"vbn"};


      //  String s = ar.crypto(str);
       // String s1 = ar.crypto(str1);
//        String s2 = ar.crypto(str2);
//        String s3 = ar.crypto(str3);
//        String s4 = ar.crypto(str4);


       // System.out.println("+++++++++++++++++++++++++++++++++++");
       // r.insert(1, s);
      //  r.insert(2, s1);
//        r.insert(3, s2);
//        r.insert(4, s3);
//        r.insert(5, s4);
       // System.out.println(r.get(1));
       // System.out.println(r.get(2));
//        System.out.println(r.get(3));
//        System.out.println(r.get(4));
//        System.out.println(r.get(5));
        //System.out.println("+++++++++++++++++++++++++++++++++++");
        //System.out.println(r.get(1));


//        System.out.println(r.size());
//        System.out.println(r.hash("a"));
//        System.out.println(r.get("a"));
    }
}
//Залупа не работает, больше 1 элемента выдает нул! Вернуть таблицу в исходный порядок и переделать шифрование!