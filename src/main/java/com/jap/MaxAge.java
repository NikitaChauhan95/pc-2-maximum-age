package com.jap;

public class MaxAge {

    public static int getMaxAge(int[] age){

        int maxAge = age[0];

        for(int counter = 0; counter<age.length; counter++){
            if(age[counter]>maxAge)
                maxAge = age[counter];
        }
        System.out.println("Maximum age : " +maxAge);

        return maxAge;
    }
    public static void main(String[] args){
        int age[] = {23, 34, 33, 24, 25, 26,31};

        MaxAge maxAge = new MaxAge();
        int result = MaxAge.getMaxAge(age);


    }
}