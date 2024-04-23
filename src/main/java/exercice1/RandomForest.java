package exercice1;

public class RandomForest extends BaseModel {
    int numTrees ;
    int maxDepth ;
    public RandomForest(String name , int version , String description){
        super(name , version, description) ;  
    }
    @Override
    public void train(Dataset dataset){
        System.out.println("model is trained !");
    }


    @Override
    public void predict(Dataset dataset) {
        System.out.println("predection is ready !"); 
    }
    
    
}
