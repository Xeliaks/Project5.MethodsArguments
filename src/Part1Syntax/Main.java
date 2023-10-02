package Part1Syntax;



public class Main {
    //Part1.1 Demonstrating use of methods with multiple arguments.
    public static void printTime(int hour, int minute){
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
    //Part1.2 Demonstrating a method without return value.
    public static void skipLine() {
        System.out.println();
    }

    //Part1.3 Demonstrating use of different return values + return value in main.
    public static int max(int x,int y){
        if (x>y) {
            return x;
        }
        else {
            return y;
        }
    }
    /*Part2 Demonstrating decomposition of a task into methods and sub-methods.
    Showing other custom methods call inside your own methods. */

    public static void print(String caption, int value){
        System.out.println(caption + ": " + value);
    }
    public static void findEven(int num){
        if (num%2==0){
            print("This number is even",num);
        }
        else {
            print("This number is odd",num);
        }
    }

    public static void main(String[] args) {
        int hour = 12;
        int minute = 30;
        printTime(hour, minute);
        skipLine();
        int i = 15;
        int j = 21;
        print("Bigger number is" , max(i,j));

    }

}