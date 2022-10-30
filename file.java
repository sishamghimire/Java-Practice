
import java.io.FileWriter;  
public class file {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");    
           fw.write("Faculty:");    
             fw.write("Section:");
             fw.write("Phone number:");
             fw.write("Email:");
             fw.write("Address:");
            fw.close();

          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
} 
