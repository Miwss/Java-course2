// Java-программа для демонстрации реализации нашего
// собственная хеш-таблица с цепочкой для обнаружения столкновений

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


// узел цепей

class HashNode<K, V>
{
    K key;
    V value;
    // Ссылка на следующий узел
    HashNode<K, V> next;
    // Конструктор
    public HashNode(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
}

//================================================================//
// Класс для представления всей хеш-таблицы
class Map<K, V>
{
    // bucketArray используется для хранения массива цепочек
    private ArrayList<HashNode<K, V>> bucketArray;
    // Текущая емкость списка массивов
    private int numBuckets;
    // Текущий размер списка массивов
    private int size;
    // Конструктор (Инициализирует емкость, размер и
    // пустые цепочки.
    public Map()
    {
        bucketArray = new ArrayList<>();
        numBuckets = 16;
        size = 0;
        // Создать пустые цепочки
        for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }
    public int size() { return size; }
    public boolean isEmpty() { return size() == 0; }
    // Реализует хеш-функцию для поиска индекса
    // для ключа
    private int getBucketIndex(K key)
    {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;
    }
    // Метод для удаления данного ключа
    public V remove(K key)
    {
        // Применяем хеш-функцию для поиска индекса для данного ключа
        int bucketIndex = getBucketIndex(key);
        // Получить голову цепи
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        // Поиск ключа в его цепочке
        HashNode<K, V> prev = null;
        while (head != null)
        {
            // если ключ найден
            if (head.key.equals(key))
                break;
            // Остальное продолжаем вигаться по цепочке
            prev = head;
            head = head.next;
        }
        // Если ключа там не было
        if (head == null)
            return null;
        // Уменьшаем размер
        size--;
        // Удалить ключ
        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex, head.next);
        return head.value;
    }
    // Возвращает значение для ключа
    public V get(K key)
    {
        // Найти начало цепочки для данного ключа
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        // Поиск ключа в цепочке
        while (head != null)
        {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }
        // Если ключ не найден
        return null;
    }
    // Добавляет пару ключ-значение в хеш
    public void add(K key, V value)
    {
        // Найти начало цепочки для данного ключа
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        // Проверяем, присутствует ли ключ
        while (head != null)
        {
            if (head.key.equals(key))
            {
                head.value = value;
                return;
            }
            head = head.next;
        }
        // Вставляем ключ в цепочку
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);
        // Если коэффициент загрузки превышает пороговое значение, то
        // размер двойного хеш-таблицы
        if ((1.0*size)/numBuckets >= 0.7)
        {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucketArray.add(null);
            for (HashNode<K, V> headNode : temp)
            {
                while (headNode != null)
                {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    private int hash(K key) {

        int hash = 0;

        for (int i = 0; i < key.toString().length(); i++) {
            hash = (31 * hash + key.hashCode()) % size;
        }
        return hash;

//        int hash = 31;
//        hash = hash * 17 + key.hashCode();
//        return hash % hashTable.length;
    }
    // Метод драйвера для тестирования класса Map
    public static void main(String[] args)
    {
        Map<String, Integer>map = new Map<>();

        map.add("this",1 );
        map.add("coder",2 );
        map.add("this",4 );
        map.add("hi",5 );

        System.out.println(map.getBucketIndex("hi"));
        System.out.println(map.getBucketIndex("coder"));
        System.out.println(map.hash("this"));
        System.out.println(map.hash("hi"));
        System.out.println(map.bucketArray);
//
//        System.out.println(map.size());
//
//        System.out.println(map.remove("this"));
//
//        System.out.println(map.remove("this"));
//
//        System.out.println(map.size());
//
//        System.out.println(map.isEmpty());

    }

}