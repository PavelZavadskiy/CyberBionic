/*
* Создайте класс MyList. Реализуйте в простейшем приближении возможность использования его экземпляра аналогично
* экземпляру класса List. Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод
* добавления элемента, индексатор для получения значения элемента по указанному индексу и свойство только для
* чтения для получения общего количества элементов. */

/*
* Создайте класс MyDictionary. Реализуйте в простейшем приближении возможность использования его экземпляра.
* Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления пар элементов,
* индексатор для получения значения элемента по указанному индексу и свойство только для чтения для получения
* общего количества пар элементов.*/

public class Main {
    public static void main(String[] args) {
        System.out.println("================MyList <T>==============");
        int size = 2;
        System.out.println("----------------Constructor--------------");
        System.out.println("----------------<Integer>new MyList()--------------");
        MyList<Integer> myList2 = new MyList<>();
        System.out.println(myList2);

        System.out.println("----------------<Integer>new MyList<>(size)--------------");
        MyList<Integer> myList = new MyList<>(size);
        System.out.println(myList);

        System.out.println("----------------<Integer>new MyList(T ... elems)--------------");
        MyList<Integer> myList1 = new MyList<>(1, 9, 12, 12, 3, 6, 7, 3);
        System.out.println(myList1);

        System.out.println("----------------<Integer>boolean add(T in)--------------");
        for (int i = 0; i<size+3; i++ ){
            myList.add(i);
        }
        System.out.println(myList);

        System.out.println("----------------<Integer>boolean remove(int idx)--------------");
        myList.remove(3);
        System.out.println(myList);

        System.out.println("----------------<Integer>public T get(int idx)--------------");
        System.out.println(myList.get(2));


        System.out.println("----------------<Integer>boolean set(int idx, T in)--------------");
        myList.set(2, 98);
        System.out.println(myList.get(2));

        System.out.println("----------------<Integer>void clear()--------------");
        myList.clear();
        System.out.println(myList);

        System.out.println("----------------<Integer>isEmpty()--------------");
        System.out.println(myList.isEmpty());

        System.out.println("----------------<Integer>clone()--------------");
        System.out.println(myList1);
        MyList myList4 = myList1.clone();
        System.out.println(myList4);

        //=============================================================================================================

        System.out.println("================MyDictionary <TKey,TValue>==============");
        MyDictionary<String, String> myDictionary = new MyDictionary<>();

        System.out.println("----------------boolean add(TKey key, TValue value)--------------");
        myDictionary.add("Hello", "world");
        myDictionary.add("world", "hello");
        System.out.printf("Dictionary size should have two elem: %d\n", myDictionary.size());
        System.out.printf("Add should return false: %b\n", myDictionary.add("Hello", "school"));

        System.out.println("----------------boolean remove(TKey key)--------------");
        System.out.printf("Remove should return true: %b\n", myDictionary.remove("Hello"));
        System.out.printf("Dictionary size should have one elem: %d\n", myDictionary.size());
        System.out.printf("Remove should return false: %b\n", myDictionary.remove("Hello"));

        System.out.println("----------------boolean containsKey(TKey key)--------------");
        System.out.printf("containsKey should return true: %b\n", myDictionary.containsKey("world"));
        System.out.printf("containsKey should return false: %b\n", myDictionary.containsKey("Hello"));

        System.out.println("----------------TValue getValue(TKey key)--------------");
        System.out.printf("getValue should return \"hello\": %s\n", myDictionary.getValue("world"));
        System.out.printf("getValue should return null: %s\n", myDictionary.getValue("Hello"));

        System.out.println("----------------boolean replace(TKey key, TValue value)--------------");
        System.out.printf("replace should return true: %b\n", myDictionary.replace("world", "school"));
        System.out.printf("replace should return false: %b\n", myDictionary.replace("Hello", "school"));

        System.out.println("----------------boolean isEmpty()--------------");
        System.out.printf("isEmpty should return false: %b\n", myDictionary.isEmpty());
        MyDictionary<Integer, Integer> myDictionary1 = new MyDictionary<>();
        System.out.printf("isEmpty should return true: %b\n", myDictionary1.isEmpty());

        System.out.println("----------------MyList<TKey> keyList()--------------");
        System.out.printf("keyList: %s\n", myDictionary.keyList());

        System.out.println("----------------void clear()--------------");
        myDictionary.clear();
        System.out.printf("isEmpty should return true: %b\n", myDictionary.isEmpty());
        System.out.printf("Dictionary size should have 0 elem: %d\n", myDictionary.size());
    }
}
