package experiments;

import helpers.RetyAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.SecureRandom;

public class Test29072024 {
    @Test(retryAnalyzer = RetyAnalyzer.class)
    public  void generateRandomTestPositive(){
        Assert.assertEquals( generateRandomString(10).length(),10);
    }




    public static void main(String[] args) {
System.out.println (generateRandomString(37));

    }
   public static String generateRandomString(int length) {
        if (length<=0||length>1000){
            throw new IllegalArgumentException("");
                    }
        String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        StringBuilder randomString= new StringBuilder( length);
       SecureRandom random = new SecureRandom();

       for (int i=0; i<length;i++){
           int randomIndex= random.nextInt(characters.length());
           randomString.append(characters.charAt(randomIndex));

       }
       return randomString.toString();

   }


}





