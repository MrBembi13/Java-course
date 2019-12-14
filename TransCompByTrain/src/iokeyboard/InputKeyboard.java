package iokeyboard;

import exception.MyException;

import java.io.*;

public class InputKeyboard {
    private InputStream inputStream = System.in;
    private Reader inputStreamReader = new InputStreamReader(inputStream);
    private BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    public String inputString() {
        String str;
        try {
            str = bufferedReader.readLine();
            if (str.equals(""))
                throw new MyException("String can't be empty!");
        } catch (IOException | MyException e){
            return e.getMessage();
        }
        return str;
    }

    //not working
    /*public String inputSurname() {
        String str1;
        try {
            str1 = bufferedReader.readLine();
            if (str1.equals(""))
                throw new MyException("String can't be empty!");
        } catch (IOException | MyException ignored){
            return ignored.getMessage();
        }
        return str1;
    }*/
}
