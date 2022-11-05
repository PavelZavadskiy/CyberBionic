public class ExpertDocumentWorker extends ProDocumentWorker{
    public ExpertDocumentWorker(){}

    @Override
    public void saveDocument(){
        System.out.println("Документ сохранен в новом формате");
    }
}
