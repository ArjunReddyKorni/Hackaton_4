package base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//           int number = 0;
//        try{
//            System.out.println(" Please Enter a Number ");
//
//             number = scanner.nextInt();
//        }catch (InputMismatchException e){
//            System.out.println("e = " + e);
//
//        }finally {
//            System.out.println("number = " + number);
//        }
//
//    }

    public static void main(String[] args) {
        try{
            int [] arr ={1,2,34,4};
            for (int i = 0; i <= 4; i++) {
                System.out.println("arr[i] = " + arr[i]);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
