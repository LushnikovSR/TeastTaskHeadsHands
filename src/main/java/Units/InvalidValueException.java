package Units;


class InvalidValueException extends AppException{
    private final int value;
    public int getValue(){
        return value;
    }
    public InvalidValueException(String message, int value){
        super(message);
        this.value = value;
    }
}
