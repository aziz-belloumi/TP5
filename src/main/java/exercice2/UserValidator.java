package exercice2;

public class UserValidator extends Exception {
    public boolean validateAge(int age) throws UserAgeException {
        if(age < 18){
            throw new UserAgeException("too young !");
        }
        else {
            return true ;
        }
    }
}
