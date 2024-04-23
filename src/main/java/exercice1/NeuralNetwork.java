package exercice1;

public class NeuralNetwork extends BaseModel {
    int layers[];
    String activisionFunction ;
    public NeuralNetwork(String name , int version , String description , int layers[] , String activisionFunction){
        super(name , version, description) ;  
        this.layers = layers ;
        this.activisionFunction = activisionFunction ;
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
