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
        int numOfSpaces = n - 1;
        int numOfStars = 1;

         for(int i = 0; i < n; i++) {
             printCharacterXTimes(" ", numOfSpaces);
             printCharacterXTimes("*", numOfStars);
             System.out.println();

             numOfSpaces--;
             numOfStars += 2;
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
        int numOfSpaces = n - 1;
        int numOfStars = 1;

        for (int i = 0; i < n; i++) {

            printCharacterXTimes(" ", numOfSpaces);
            printCharacterXTimes("*", numOfStars);
            System.out.println();

            if(n - 1 != i) {
                numOfSpaces--;
                numOfStars += 2;
            }

        }
        for (int i = n; i > 0; i--) {
            numOfStars -= 2;
            numOfSpaces++;

            printCharacterXTimes(" ", numOfSpaces);
            printCharacterXTimes("*", numOfStars);
            System.out.println();
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
        for (int i = 0; i < (n * 2) - 1; i++) {
            if (i < n -1) {
                System.out.print(repeatStringXTimes(" ", (n - 1) - i));
                System.out.print(repeatStringXTimes("*", (i + 1) * 2 - 1));
                System.out.println(repeatStringXTimes(" ", (n - 1) - i));
            }
            if (i == n - 1) {
                System.out.println("JEFF");
            }
        }
        for (int i = n; i > 0; i--) {
            if (i < n) {
                System.out.print(repeatStringXTimes(" ", (n) - i));
                System.out.print(repeatStringXTimes("*", (i) * 2 - 1));
                System.out.println(repeatStringXTimes(" ", (n - 1) - i)); // may not need this
            }
        }

    }

        // this will be removed and print charXTimes will replace it.
    private static String repeatStringXTimes(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    private static void printCharacterXTimes(String str, int times) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < times; i++) {
            stringBuilder.append(str);
        }

        System.out.print(stringBuilder);
    }
}


//        for (int i = n; i > 0; i--) {
//                if (i < n) {
//        System.out.print(repeatStringXTimes(" ", (n) - i));
//        System.out.print(repeatStringXTimes("*", (i) * 2 - 1));
//        System.out.println(repeatStringXTimes(" ", (n - 1) - i)); // may not need this
//        }
//        }