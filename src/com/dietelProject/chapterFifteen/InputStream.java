package Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args){

       try( InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferReader  = new BufferedReader(reader)){
           String line = bufferReader.readLine();
           int number = Integer.decode(line);
           System.out.println("my number is: "+number);
           System.out.println(line);
       }catch(IOException | NumberFormatException e){
           //System.out.println(e.getMessage());
           System.out.println("Please input an int!!!");
       }

    }
    public static void readToAnother(){

    }
}
