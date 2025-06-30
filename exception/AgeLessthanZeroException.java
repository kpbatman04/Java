package exception;

public class AgeLessthanZeroException extends Exception{
    public AgeLessthanZeroException(){

    }
    public AgeLessthanZeroException(String message){
        super(message);
    }
    public AgeLessthanZeroException(Throwable cause ){
        super(cause);
    }
    public AgeLessthanZeroException(String message,Throwable cause ) {
        super(message, cause);
    }
    }
