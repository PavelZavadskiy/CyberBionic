public class TXTHandler extends AbstractHandler{
    void open() {
        System.out.println("TXTHandler -> open");
    }

    void create()  {
        System.out.println("TXTHandler -> create");
    }

    void change(){
        System.out.println("TXTHandler -> change");
    }

    void save(){
        System.out.println("TXTHandler -> save");
    }
}
