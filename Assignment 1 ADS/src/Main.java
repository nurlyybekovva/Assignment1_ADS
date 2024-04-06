import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static int printMinimum(int n, int min){  // Complexity: linear - O(n)
        if (n == 0){
            return min;
        }
        int arr = scanner.nextInt();
        if (arr < min){
            min = arr;
        }
        return printMinimum(n-1, min);
    }
    public static void task1(){
        int n = scanner.nextInt();
        System.out.println(printMinimum(n,Integer.MAX_VALUE));
    }


    public static double printAverage(int n, double sum, int size){   // Complexity: linear - O(n)
        if (n == 0){
            return sum / size;
        }
        int arr = scanner.nextInt();
        sum += arr;
        return printAverage(n-1,sum,size);
    }
    public static void task2(){
        int n = scanner.nextInt();
        System.out.println(printAverage(n,0,n));
    }


    public static boolean isPrime(int n, int i , int p){    // Complexity O(sqrt(n))
        if (n == 1){
            return false;
        }

        if(n % i == 0) {
            return false;
        }

        if(i > p) return true;

        return isPrime(n, i+1 , p);
    }
    public static String isPrime(int n){   // Complexity O(sqrt(n))
        return isPrime(n , 2 , (int)Math.sqrt(n))? "Prime" : "Composite";
    }
    public static void task3(){
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }


    public static int factorial(int n){   // Complexity: linear - O(n)
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void task4(){
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }


    public static int printFibonacci(int n){    // Complexity: exponential - O(2^n)
        if (n == 0 || n == 1){
            return n;
        }
        else{
            return printFibonacci(n-1) + printFibonacci(n-2);
        }
    }
    public static void task5(){
        int n = scanner.nextInt();
        System.out.println(printFibonacci(n));
    }


    public static int printPower(int a, int n, int pow){  // Complexity: linear - O(n)
        if (n == 0){
            return pow;
        }
        pow *= a;
        return printPower(a, n-1, pow);
    }
    public static void task6(){
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(printPower(a,n, 1));
    }


    public static void printPermutations(String str, String permutation){   // Complexity: factorial - O(n!)
        if (str.isEmpty()){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i+1);
            printPermutations(rest, permutation + letter);

        }
    }
    public static void task7(){
        String str = scanner.nextLine();
        printPermutations(str, "");
    }


    public static boolean onlyDigits(String str, int i){    // Complexity: linear - O(n)
        if (i == str.length()){
            return true;
        }
        if (str.charAt(i) < '0' || str.charAt(i) > '9'){
            return false;
        }
        return onlyDigits(str, i+1);
    }
    public static String onlyDigits(String str){
        return onlyDigits(str,0)? "Yes" : "No";
    }
    public static void task8(){
        String str = scanner.next();
        System.out.println(onlyDigits(str));
    }


    public static int binomialCoefficient(int n, int k){   // Complexity : exponential - O(2^n)
        if (k == 0 || k == n){
            return 1;
        }
        return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
    }
    public static void task9(){
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }


    public static int findGCD(int a, int b){    // Complexity: logarithmic - O(log(min(a,b)))
        if (a%b == 0){
            return b;
        }
        return findGCD(b, a%b);
    }
    public static void task10(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(findGCD(a, b));
    }

    public static void main(String[] args){
        /*
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        */

    }
}
