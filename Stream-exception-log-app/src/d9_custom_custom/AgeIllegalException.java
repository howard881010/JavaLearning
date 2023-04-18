package d9_custom_custom;


/*
    1. 繼承Exception
    2. 重寫構造器
 */
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {

    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
