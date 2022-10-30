import java.io.File;
import java.io.IOException;

public class filehandling{
    public static void main(String[] args) {
        File file = new File("example.txt");
        try{
            if(file.createNewFile())
            {
                System.out.println(file.getName());
            }
        }  catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}