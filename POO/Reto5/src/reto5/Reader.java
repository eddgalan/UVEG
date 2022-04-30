package reto5;
import java.util.Scanner;

public class Reader implements Stream {
    Scanner streamIn = new Scanner(System.in);
    @Override
    public String getInput(String message){
        System.out.println(message);
        String stringToReturn = streamIn.nextLine();
        return stringToReturn;
    }
    @Override
    public int stringToInt(String val){
        return Integer.parseInt(val);
    }
    @Override
    public double stringToDouble(String val){
        return Double.parseDouble(val);
    }
}
