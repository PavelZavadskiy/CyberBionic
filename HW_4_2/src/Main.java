/*
Создайте класс AbstractHandler. В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler. Написать программу,
которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания,
редактирования, сохранения определенного формата документа.
 */

public class Main {
    public enum enFileType {FT_WRONG, FT_TXT, FT_XML, FT_DOC}

    static private enFileType fileTypeDetect(String fileName){
        String extension;
        int pos = fileName.lastIndexOf('.');
        if(pos == -1 || pos == fileName.length() - 1 )
            return enFileType.FT_WRONG;
        extension = fileName.substring(pos+1);
        if(extension.equalsIgnoreCase("txt")){
            return enFileType.FT_TXT;
        } else if(extension.equalsIgnoreCase("doc")) {
            return enFileType.FT_DOC;
        } else if(extension.equalsIgnoreCase("xml")) {
            return enFileType.FT_XML;
        }
        return enFileType.FT_WRONG;
    }

    public static void main(String[] args) {
        final String xmlFIle = "MyXML.xml";
        final String xmlFIle1 = "c:\\MyFile.xml";
        final String txtFIle = "MyTXT.txt";
        final String docFIle = "MyDOC.doc";
        final String wrongFIle1 = "MyFile";
        final String wrongFIle2 = "MyFile.";
        final String wrongFIle3 = "MyFile.f";
        final String wrongFIle4 = "c:\\MyFile.f";

        String[] files = {txtFIle, xmlFIle, xmlFIle1, docFIle, wrongFIle1, wrongFIle2, wrongFIle3, wrongFIle4};

        AbstractHandler handler;
        for(String name: files) {
            handler = null;
            System.out.printf("______%s______\n", name);
            switch (fileTypeDetect(name)) {
                case FT_TXT -> handler = new TXTHandler();
                case FT_XML -> handler = new XMLHandler();
                case FT_DOC -> handler = new DOCHandler();
                default -> System.out.println("Wrong file extension!");
            }
            if(handler != null){
                handler.open();
                handler.create();
                handler.change();
                handler.save();
            }
        }
    }
}