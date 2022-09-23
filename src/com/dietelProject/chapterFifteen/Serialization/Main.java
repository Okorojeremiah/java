package Chapter15.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person"))){
            Person person = new Person("James", 15);
            out.writeObject(person);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
