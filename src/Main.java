import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] array = {3,5,7,4,2,6,9,20};
       boolean a = false;
        System.out.println("Enter a value : ");
        int value = scanner.nextInt();
        System.out.println("Mang trc khi xoa : ");
        for (int k : array){
            System.out.print(k + "\t");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                a = true;
                System.out.println("tim gtri o vtri : "+ i);
                System.arraycopy(array,i+1,array,i,array.length -1 - i);
                array[array.length -1 ] = 0;
                i--;
                System.out.println(" Mang moi : ");
                for (int k : array){
                    System.out.print(k + "\t");
                }
                System.out.println();
                System.out.println();
            }
        }
        if (!a){
            System.out.println("gtri ko ton tai trong Mang");
        }
    }
}