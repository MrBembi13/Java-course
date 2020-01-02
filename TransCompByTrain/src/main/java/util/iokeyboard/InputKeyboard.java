package util.iokeyboard;

import exception.MyException;
import util.loggers.UseLogger;

import java.io.*;

public class InputKeyboard {
    private InputStream inputStream = System.in;
    private Reader inputStreamReader = new InputStreamReader(inputStream);
    private BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    private UseLogger useLogger = new UseLogger();

    public String inputString() {
        String str;
        try {
            str = bufferedReader.readLine();
            if (str.equals(""))
                throw new MyException("String can't be empty!");
            useLogger.infoLogger();
        } catch (IOException | MyException e){
            useLogger.errorLogger();
            return e.getMessage();
        }
        return str;
    }
}
