package project.mini;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	private static final String regex = "^(.+)@(.+)$";
 

   public static void main(String[] args) {
       List<String> emailsList = new ArrayList<String>();
       // valid email addresses
       emailsList.add("nares@gmail.com");
       
       emailsList.add("anil.kumar@gamil.com");
       emailsList.add("Krishna@gmail.me.org");
       //invalid email addresses
       emailsList.add("arun.gmail.com");
       emailsList.add("ramesh..bobby@yahoo.com");
       emailsList.add("ramana@.hotmail.com");

 
       Pattern pattern = Pattern.compile(regex);

       //searching for occurrences of regex
       for (String value : emailsList) {
           Matcher matcher = pattern.matcher(value);

           System.out.println("The Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
           System.out.println();
       }
   }
}
