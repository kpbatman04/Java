package exception;

public class customException {
    public static void main(String[] args) throws AgeLessthanZeroException {
        validateAge(-1);
    }
    public static void validateAge(int age) throws AgeLessthanZeroException {
        if(age<0){
        throw new AgeLessthanZeroException("No code") ;
        }
    }
}
