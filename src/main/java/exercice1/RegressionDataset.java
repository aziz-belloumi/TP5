package exercice1;

public class RegressionDataset extends Dataset {
    int numFeatures ;
    double targets[];

    public RegressionDataset(String path, boolean isTrain) {
        super(path, isTrain);
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
