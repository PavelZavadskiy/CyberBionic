public class DOCHandler extends AbstractHandler{
    void open() {
        System.out.println("DOCHandler -> open");
    }

    void create()  {
        System.out.println("DOCHandler -> create");
    }

    void change(){
        System.out.println("DOCHandler -> change");
    }

    void save(){
        System.out.println("DOCHandler -> save");
    }
}
