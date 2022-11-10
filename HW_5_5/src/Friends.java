import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    private final ArrayList<String> list = new ArrayList<>();

    public void add(String name) {
        this.list.add(name);
    }

    public void sort() {
        Collections.sort(list);
    }

    @Override
    public String toString() {
        String str = "";
        for(String arg: this.list)
            str += arg + "; ";
        return str;
    }
}
