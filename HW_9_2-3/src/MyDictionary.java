
public class MyDictionary <TKey,TValue> {
    class Elem{
        public TKey key;
        public TValue value;

        public Elem(TKey key, TValue value) {
            this.key = key;
            this.value = value;
        }
    }

    MyList<Elem> elements = new MyList<>();

    public MyDictionary() { }

    private Elem getElemByKey(TKey key){
        for (int i = 0; i < elements.getLength(); i++){
            Elem elem = elements.get(i);
            if(elem.key.equals(key)) {
                return elem;
            }
        }
        return null;
    }

    private int getIdxElemByKey(TKey key){
        for (int i = 0; i < elements.getLength(); i++){
            if(elements.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(TKey key) {
        for (int i = 0; i < elements.getLength(); i++){
            if(elements.get(i).key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(TKey key, TValue value){
        return (!containsKey(key)) ? elements.add(new Elem(key, value)) : false;
    }

    public boolean remove(TKey key) {
        int idx = getIdxElemByKey(key);
        return (idx == -1) ? false : elements.remove(idx);
    }

    public TValue getValue(TKey key){
        Elem elem = getElemByKey(key);
        return (elem == null) ? null : elem.value;
    }

    public boolean replace(TKey key, TValue value) {
        int idx = getIdxElemByKey(key);
        if( idx != -1 ) {
            Elem elem = elements.get(idx);
            elem.value = value;
            return elements.set(idx, elem);
        }
        return false;
    }

    public boolean isEmpty() {
        return (elements.getLength() > 0) ? false : true;
    }

    public MyList<TKey> keyList() {
        MyList<TKey> keyList = new MyList<>();
        for (int i = 0; i < elements.getLength(); i++){
            Elem elem = elements.get(i);
            keyList.add(elem.key);
        }
        return keyList;
    }

    public void clear(){
        elements.clear();
    }

    public int size() {
        return  elements.getLength();
    }
}
