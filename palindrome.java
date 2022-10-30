import java.util.*;
public class palindrome {
     private static Scanner scanner;

    public static void main(String[] args) {  
    
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter words");
        String word = scanner.nextLine();
        String reverse_word="";
        for(int i = word.length()-1;i>=0;i--){
            reverse_word= reverse_word+ word.charAt(i);

        }
        if (word.equals(reverse_word)){
            System.out.println(word+"is palindrome");
        }else{
            System.out.println(word+"not palindrome");

        }
        
    }
    
}
