package com;

public class Problem7 {
    public static boolean isPrime(long n){
        if (n<=1){
            return false;
        }
        for (long i=2; i<=n/2; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static int whichPrime (int which){
        int n=0, result;
        for (result=1; ; result++){
            if (isPrime(result)){
                n+=1;
            }
            if (n==which) {
                break;
            }
        }
        return result;
    }   //takes the number of prime and returns it's value, i.e. 6th prime is 13

    public static void main(String[] args) {
        System.out.println(whichPrime(10001));
    }
}
