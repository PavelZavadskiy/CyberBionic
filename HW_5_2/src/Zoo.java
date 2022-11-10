import java.util.ArrayList;

public class Zoo {
    public enum Statuses {ER_OK, ER_BUSY_LIST_INDEX, ER_WRONG_INDEX}
    private ArrayList<String> list;
    {
        list = new ArrayList<>();
    }

    public Statuses add(int index, String element){
        if(index != list.size())
            return Statuses.ER_BUSY_LIST_INDEX;
        list.add(index, element);
        return Statuses.ER_OK;
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i< list.size(); i++)
            str += String.format("%d: %s\n", i, this.list.get(i));

        return str;
    }
}
