public class XMLHandler extends AbstractHandler{
    void open() {
        System.out.println("XMLHandler -> open");
    }

    void create()  {
        System.out.println("XMLHandler -> create");
    }

    void change(){
        System.out.println("XMLHandler -> change");
    }

    void save(){
        System.out.println("XMLHandler -> save");
    }
}
