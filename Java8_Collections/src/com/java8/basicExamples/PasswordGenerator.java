package com.java8.basicExamples;

import java.security.SecureRandom;


public class PasswordGenerator {

	 // Method to generate a random alphanumeric password of a specific length
    public static char[] generateRandomPassword(int len,char[] passwordGen)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#&()–[{}]:;',?/*~$^+=<>";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        passwordGen =sb.toString().toCharArray();
        return passwordGen;
    }
 
    public static void main(String[] args)
    {
        int len = 8;
        char[] randomPassword = null;
        System.out.println(generateRandomPassword(len,randomPassword));
    }

}
