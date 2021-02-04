package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(powerOf(3,4));
        //System.out.println(palindrome("3223"));
        decToBin(2);


    }

    //method 1
    public static int powerOf(int x, int index) {
        if(index == 1){
            return x;
        }
        if(x == 0){
            return 1;
        }

        return powerOf(x,index-1) * x;
    }

    //method 2
    public static boolean palindrome(String num) {
        if (num.length() <= 1) return true;
        else {
            if (num.charAt(0) != num.charAt(num.length() - 1)) return false;
            else {
                return palindrome(num.substring(1, num.length() - 1));
            }
        }
    }

    //method 3
    public static void decToBin(int dec) {
        if (dec < 1);
        else {
            decToBin(dec / 2);
            System.out.print(dec % 2);
        }
    }

}