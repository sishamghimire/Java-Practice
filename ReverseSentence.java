import java.util.*;
public class ReverseSentence{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter Sentence::");
    String Sentence= scanner.nextLine();
    String[] words= Sentence.split(" ");
    String final_result="";
    for(int i=words.length-1;i>=0;i--)
    {
        final_result = final_result+words[i]+" ";
    }
    System.out.println("reverse Sentence::");
    System.out.println(final_result);
    }  
}