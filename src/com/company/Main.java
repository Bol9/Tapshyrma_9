package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("1-300 arasyndagy sandardyn 3,4,5 ke bolungon sanardy tabat   ");
        System.out.println(san());

	// write your code here

    }
    static int san(){
        int sum=0;
        for(int i=1; i<=300;i++){
            if(i%3==0 && i%4==0 && i%5==0){
                sum+=i;
                //System.out.print(i+" ");


            }

        }
        return sum;
    }
}
