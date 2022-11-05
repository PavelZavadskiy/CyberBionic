import java.util.ArrayList;
public class ClassRoom {
    ArrayList <Pupil> pupils = new ArrayList<>();
    public ClassRoom(Pupil ... pupils){
        for(Pupil i: pupils) {
            this.pupils.add(i);
        }
    }

    public void showCRInfo(){
        for (int i = 0; i < pupils.size(); i++){
            System.out.printf("_____ Student %d _______\n", i);
            pupils.get(i).study();
            pupils.get(i).read();
            pupils.get(i).write();
            pupils.get(i).relax();
        }
    }
}
