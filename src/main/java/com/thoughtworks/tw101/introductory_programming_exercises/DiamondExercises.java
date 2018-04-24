package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****

    private static void drawAnIsoscelesTriangle(int n) {
        // n1=1  n2=3 n3=5 n4=7 n5=9  -----> pattern n*2 1   ///// n1=3(' ') n2=2 n3=1' ' n4=0 ----> pattern(indexOfN - i) * " ";

        //      repeat(indexOfN - i) " ";
        //      repeat( n*2 - 1 ) "*";
        //      repeat(indexOfN - i) " ";

         for(int i = 0; i < n; i++) {
             System.out.print(repeatStringXTimes(" ", (n -1) - i));
             System.out.print(repeatStringXTimes("*", (i+1)*2 -1));
             System.out.println(repeatStringXTimes(" ", (n -1) - i)); // this is totally not needed... check requirements since empty space is empty with or without this
         }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        for (int i = 0; i < (n * 2) - 1; i++) {
            if (i < n) {
                System.out.print(repeatStringXTimes(" ", (n - 1) - i));
                System.out.print(repeatStringXTimes("*", (i + 1) * 2 - 1));
                System.out.println(repeatStringXTimes(" ", (n - 1) - i));
            }
//            else
//            {
//                System.out.print(repeatStringXTimes(" ", (i - n) +1));
//                System.out.print(repeatStringXTimes("*",  -(i - 1 - 2 * n)));
//                System.out.print((i - 1 - 2 * n) - 2);
//                System.out.println(repeatStringXTimes(" ", (i - n) +1));
//
//                // i+1(9) - -16 == 7 need 11
//                // i+1(10) - -16 == 2 needs 9
//                //    (11) - -16 == 3 needs 7
//                //    16 - 8 == 8
//            }
        }
        for (int i = n; i > 0; i--) {
            if (i < n) {
                System.out.print(repeatStringXTimes(" ", (n) - i));
                System.out.print(repeatStringXTimes("*", (i) * 2 - 1));
                System.out.println(repeatStringXTimes(" ", (n - 1) - i)); // may not need this
            }
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {

    }

    private static String repeatStringXTimes(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}
