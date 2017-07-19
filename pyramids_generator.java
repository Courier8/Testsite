/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egypt.Testsite;

import java.util.*;

/**
 *
 * @author Administrator PC
 */
public class pyramids_generator {

    static String repeat = "";
    static int choice = 0;
    static int numrow = 0;
    static boolean accepted = false;
    static boolean again = false;
    static int rowcount = 0;

    public static void symmetricpyramid(int numrow) {
        for (int i = 1; i <= numrow; i++) {
            System.out.println();
            for (int j = i; j < numrow; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
        }
    }

    public static void fouroclockpyramid(int numrow) {
        for (int i = 0; i < numrow; ++i) {
            for (int j = i; j < numrow - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void twooclockpyramid(int numrow) {
        for (int i = 0; i < numrow; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < numrow; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void sevenoclockpyramid(int numrow) {
        for (int i = 1; i <= numrow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = numrow - 1; k <= numrow; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void tenoclockpyramid(int numrow) {
        for (int i = 1; i <= numrow; i++) {
            for (int j = i; j <= numrow; j++) {
                System.out.print("*");
            }
            for (int k = numrow - 1; k <= numrow; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void numericpyramid1(int numrow) {
        for (int i = 1; i <= numrow; i++) {
            System.out.println();
            for (int j = i; j < numrow; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(k);
            }
        }
    }

    public static void numericpyramid2(int numrow) {
        for (int i = 1; i <= numrow; i++) {
            System.out.println();
            for (int j = i; j < numrow; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(i);
            }
        }
    }

    public static void numericpyramid3(int numrow) {
        for (int i = numrow; i > 0; i--) {
            System.out.println();

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowcount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowcount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            rowcount++;
        }
    }

    public static void numericpyramid4(int numrow) {
        for (int i = 0; i < numrow; i++) {
            System.out.println();
            //int spacein = numrow - abs(1-numrow);
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowcount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowcount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            rowcount--;

        }
    }

    public static void numericpyramid5(int numrow) {
        for (int i = numrow; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= numrow; j++) {
                System.out.print(j + " ");
            }
            for (int j = numrow - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

        }
    }

    public static void exceptionmessage() {
        System.out.println("Number ONLY!!");
        System.out.println("Choose pyramid again!");
    }

    public static void asknumrowmessage() {
        System.out.println("How big is this pyradmid? ");
    }

    public static void nextpyramid() {

        System.out.println("Choose your next pyramid!");
    }

    public static void menu() {
        System.out.println("\n1. This pyramid:");
        sevenoclockpyramid(5);
        System.out.println("\n2. This pyramid:");
        tenoclockpyramid(5);
        System.out.println("\n3. This pyramid:");
        twooclockpyramid(5);
        System.out.println("\n4. This pyramid:");
        fouroclockpyramid(5);
        System.out.println("\n5. This pyramid:");
        symmetricpyramid(5);
        System.out.println("\n6. This pyramid:");
        numericpyramid1(5);
        System.out.println("\n7. This pyramid:");
        numericpyramid2(5);
        System.out.println("\n8. This pyramid:");
        numericpyramid3(5);
        System.out.println("\n9. This pyramid:");
        numericpyramid4(5);
        System.out.println("\n10. This pyramid:");
        numericpyramid5(5);
        System.out.println();
        System.out.println("Your choice: ");
    }

    public static boolean another(String repeat) {
        System.out.println("Another pyramids? [Y/???]");
        Scanner reset = new Scanner(System.in);
        repeat = reset.nextLine();
        if (repeat.equalsIgnoreCase("Y")) {
            again = true;
            return again;
        } else {
            return again;
        }
    }

    /*public static boolean okay(String choices) {
        boolean yes = true;
        Pattern patty = Pattern.compile("^\\d+$");
        Matcher matching = patty.matcher(choices);
        if (matching.matches()) {
            return yes;
        } else {
            yes = false;
            return yes;
        }
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correct = false;
        menu();
        while (choice != 13) {
            do {
                try {
                    choice = input.nextInt();
                    correct = true;
                } catch (InputMismatchException e) {
                    exceptionmessage();
                }
                input.nextLine();
            } while (correct = false);
            switch (choice) {
                case 1:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    sevenoclockpyramid(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;

                case 2:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    tenoclockpyramid(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 3:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    twooclockpyramid(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 4:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    fouroclockpyramid(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 5:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    symmetricpyramid(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 6:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    numericpyramid1(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 7:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    numericpyramid2(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 8:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    numericpyramid3(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 9:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;

                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    numericpyramid4(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
                case 10:
                    do {
                        asknumrowmessage();
                        try {
                            numrow = input.nextInt();
                            accepted = true;
                        } catch (InputMismatchException e) {
                            exceptionmessage();
                        }
                        input.nextLine();
                    } while (accepted = false);
                    numericpyramid5(numrow);
                    System.out.println();
                    nextpyramid();
                    //another(repeat);
                    break;
            }

        }

    }
}
