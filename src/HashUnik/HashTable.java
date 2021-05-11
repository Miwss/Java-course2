package HashUnik;

public class HashTable {
    private int hash(String key)
    {
        int hash = 0;

        for(int i = 0; i < key.length(); i++)
            hash = (31 * hash + key.charAt(i)) % size;

        return hash;
    }

    class Item{

        private String key;

        public Item(String key)
        {
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
    //массив для хранения элементов
    private Item[] table;
    //количество элементов в таблице
    private int count;
    //размер таблицы
    private int size;

    public HashTable(int size)
    {
        this.size = size;
        table = new Item[size];
    }
    public void insert(String key)
    {
        Item item = new Item(key);
        int hash = hash(key);
        while(table[hash] != null)
        {
            hash++;
            hash %= size;
        }
        table[hash] = item;
    }
    public void print()
    {
        for(int i = 0; i < size; i++)
            if(table[i] != null)
                System.out.println(i + " : " + table[i].getKey());
    }
    public Item get(String key)
    {
        int hash = hash(key);
        while(table[hash] != null)
        {
            if(table[hash].getKey().equals(key))
                return table[hash];
            hash++;
            hash = hash % size;
        }

        return null;
    }

    public static void main(String[] args) {
        HashTable hash1 = new HashTable(97);
        String[] str1 = {"Hello", "World", "Goodbye"};
        for (int i = 0; i < str1.length; i++) {
            String str5 = testMulti.multi(str1[i]);
            hash1.insert(str5);
        }
        System.out.println("==================");
        hash1.print();
//        for (int i = 0; i < hash1.size; i++) {
//            System.out.println("HashKey: " + has + " = " + "Value: " + str1[i]);
//            //System.out.println(str1[i]);
//        }
        System.out.println("==================");
    }
}

