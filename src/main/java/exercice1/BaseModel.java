package exercice1;

abstract class BaseModel implements MachineLearningModel {
    protected String name ;
    int version ;
    String description ;
    String device ;
    public BaseModel(String name , int version , String description){
        this.description = description ;
        this.name = name ;
        this.version = version ;
    }
    public void displayDetails(){
        System.out.println("name : " + this.name + " , version : " + this.version + " , descriptio : " + this.description);
    } 
}
