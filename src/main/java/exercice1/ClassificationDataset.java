package exercice1;

public class ClassificationDataset extends Dataset {
    String labels[];
    int numClasses ;
    public ClassificationDataset(String path , boolean t){
        super(path,t);
    }
    @Override
    public void charger(String path){
        System.out.println("donnees chargees !");
    }
    @Override
    public void traiter(){
        System.out.println("donnees traitees !");
    }
}
