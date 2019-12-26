package exception;

public class MyException extends Throwable {
    private String message;

    public MyException(String str){
        this.message = str;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
