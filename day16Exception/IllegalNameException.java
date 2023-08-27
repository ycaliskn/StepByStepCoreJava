package day16Exception;

public class IllegalNameException extends RuntimeException{
    public IllegalNameException(String k){
        super(k);
    }
}
