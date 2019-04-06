package com.ionut;

public class Main {

    public static void main(String args[]) {
        String MESSAGE = "%";
        char[] array = MESSAGE.toCharArray();
        char last = ' ';
        String result = "";

        for (int i = 0; i < array.length; i++) {
            String letter = Integer.toBinaryString(array[i]);
            if(letter.length() < 7){
                letter = new String(new char[7-letter.length()]).replace("\0", "0") + letter;
            }
            for (int j = 0; j < letter.length(); j++) {
                char c = letter.charAt(j);
                if (c != last) {
                    last = c;
                    if (c == '0') {
                        result += " 00 0";
                    } else {
                        result += " 0 0";
                    }
                } else {
                    result += "0";
                }
            }

        }

        result = result.substring(1);
        System.out.println(result);

    }
}
