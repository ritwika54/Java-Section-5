public class Main {
 public static void main(String args[]){
 int number = 2;
 int count = 0;
 while(count < 1000){
 if(isPrimeNumber(number)){
 System.out.println(number);
 count++;
 }
 number++;
 }
 }

 private static boolean isPrimeNumber(int number){
 for(int i=2; i<=number/2; i++){
 if(number % i == 0){
 return false;
 }
 }
 return true;
 }

}
