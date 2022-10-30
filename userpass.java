import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class userpass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String[] Username= {"texas1","texas2","texas3"};
         List<String> nameList = new ArrayList<>(Arrays.asList(Username)); 
         String[] Password=new String[]{"1texas","2texas","3texas"};
        System.out.print("Enter Username:");
        String user = sc.nextLine();
        if(nameList.contains(user)){
            int index = nameList.indexOf(user);
            System.out.print("Enter Password:");
            String pass = sc.nextLine();
            
            if(user.equals(Username[index]) && pass.equals(Password[index])){
                System.out.println("login as" +user);
            }
            else{
                System.out.println("Incorrect credentails");

            }     
    }
    else{
        System.out.println("User not found");
    }
        
    }
}
