package exercice1;

abstract class Dataset {
    protected boolean isTrain ;
    protected String path ;
    public Dataset(String path,boolean isTrain){
        this.isTrain = isTrain ;
        this.path = path ;
        
    }
    abstract void charger(String path) ;
    abstract void traiter() ;
    
}
