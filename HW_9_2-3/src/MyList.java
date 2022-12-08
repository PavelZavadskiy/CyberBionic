public class MyList <T> {
    private final int DEFAULT_SIZE = 10;
    private final int STEP_SIZE = 5;
    private int size;
    private int length;
    private T[] array;

    public MyList() {
        this.length = 0;
        this.size = DEFAULT_SIZE;
        this.array = (T[]) new Object[this.size];
    }
    public MyList(int size) {
        this.length = 0;
        if(size > 0)
            this.size = size;
        else
            this.size = DEFAULT_SIZE;
        this.array = (T[]) new Object[this.size];
    }

    @SafeVarargs
    public MyList(T ... elems) {
        if(elems.length == 0) {
            this.size = DEFAULT_SIZE;
            return;
        }
        this.array = (T[]) new Object[elems.length];
        for (int i = 0; i < elems.length ; i++)
        {
            this.array[i] = elems[i];
        }
        this.size = this.length = elems.length;
    }

    public int getSize(){
        return this.size;
    }

    public int getLength(){
        return this.length;
    }

    public boolean add(T in){
        if(this.length >= this.size){
            int tempSize = this.size;
            T[] temp = (T[]) new Object[this.size];
            for(int i = 0; i < tempSize; i++){
                temp[i] = this.array[i];
            }
            this.size += STEP_SIZE;
            this.array = (T[]) new Object[this.size];
            for(int i = 0; i < tempSize; i++){
                this.array[i] = temp[i];
            }
        }
        this.array[this.length++] = in;
        return true;
    }

    public boolean remove(int idx){
        if(idx >= this.length || idx < 0) return false;
        T[] temp = (T[]) new Object[this.size];
        int counter  = 0;
        for(int i = 0; i < this.length; i++){
            if(i != idx) {
                temp[counter++] = this.array[i];
            }
        }
        this.array = temp;
        this.length--;
        return true;
    }

    public T get(int idx){
        if(idx >= this.length || idx < 0) return null;
        return this.array[idx];
    }

    public boolean set(int idx, T in){
        if(idx >= this.length || idx < 0) return false;
        this.array[idx] = in;
        return true;
    }


    public void clear() {
        this.length = 0;
    }

    public boolean	isEmpty() {
        return (this.length == 0) ? true : false;
    }

    @Override
    public MyList<T> clone() {
        MyList<T> temp = new MyList<>(this.size);
        for(int i = 0; i < this.length; i++){
            temp.add(this.array[i]);
        }
        return temp;
    }

    private String GetArrayString() {
        if(this.length > 0) {
            String temp = "[";
            for (int i = 0; i < this.length; i++) {
                temp += this.array[i].toString() + ", ";
            }
            return temp.substring(0, temp.length() - 2) + "]";
        }
        else return "[]";
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", length=" + length +
                ", array=" + GetArrayString() +
                '}';
    }
}
