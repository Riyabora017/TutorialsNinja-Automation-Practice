package temp;

import java.util.Date;

public class GenerateEmailDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Date date = new Date();
   System.out.println(date);
   String dateString = date.toString();
   String noSpaceDateString = dateString.replaceAll("\\s", "");
   System.out.println(noSpaceDateString);
   String noSpaceandnocolonDateString = noSpaceDateString.replaceAll("\\:", "");
   System.out.println(noSpaceandnocolonDateString);
    String emailWithTimeStamp = noSpaceandnocolonDateString+"@gmail.com";
    System.out.println(emailWithTimeStamp);
    
	}

}
