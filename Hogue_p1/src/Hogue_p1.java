
import java.util.Scanner;
import java.util.Random;

public class Hogue_p1 {
    private static int countRight = 0;
    private static int countWrong = 0;

    public static void approvalList() {
        Random randGen = new Random();
        int appVal = randGen.nextInt(3);
        switch(appVal){
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
        return;
    }

    public static void disapprovalList() {
        Random randGen = new Random();
        int appVal = randGen.nextInt(3);
        switch(appVal){
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don’t give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
        return;
    }

    private static double teacherNeeded(int correctNum) {
        double userScore;
        userScore = (correctNum / 10.0) * 100.0;
        System.out.println("" + userScore + "%");
        double userScore1 = userScore;
        if (userScore <= 75.0){
            System.out.println("Please ask your teacher for extra help.");
            countRight = 0;
            countWrong = 0;
            return userScore1;
        }
        else {
            System.out.println("Congratulations, you are ready to go to the next level!");
            countRight = 0;
            countWrong = 0;
            return userScore1;
        }

    }

    public static void levelOne(int arithmeticSelection) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int i;
        // int countWrong = 0;
        // int countRight = 0;

        switch (arithmeticSelection) {
            case 1:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(9) +1;
                    int numTwo = randGen.nextInt(9) +1;

                    System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo + numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne + numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 2:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(10);
                    int numTwo = randGen.nextInt(10);

                    System.out.println("How much is " + numOne + " times " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo * numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " times " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne * numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 3:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(10);
                    int numTwo = randGen.nextInt(10);

                    System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numOne - numTwo)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne - numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 4:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(10);
                    double numTwo = randGen.nextInt(10)+1;

                    System.out.println("How much is " + numOne + " divided by " + numTwo + "?\n Round to the hundredths place in your answer.");
                    Random scanner;
                    double userAnswer = scnr.nextDouble();
                    double midNum = numOne / numTwo;
                    midNum = Math.round(midNum * 100.00) / 100.00;
                    if (userAnswer != (midNum)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " divided by " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (midNum)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 5:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(9) + 1;
                    double numTwo = randGen.nextInt(9)+1;
                    mixMod(numOne, numTwo);
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            }
        }

    public static void levelTwo(int arithmeticSelection) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int i;
        int countWrong = 0;
        int countRight = 0;

        switch (arithmeticSelection) {
            case 1:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(90)+10;
                    int numTwo = randGen.nextInt(90)+10;

                    System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo + numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne + numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 2:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(90)+10;
                    int numTwo = randGen.nextInt(90)+10;

                    System.out.println("How much is " + numOne + " times " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo * numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " times " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne * numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 3:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(90)+10;
                    int numTwo = randGen.nextInt(90)+10;

                    System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numOne - numTwo)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne - numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 4:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(90)+10;
                    double numTwo = randGen.nextInt(90)+10;

                    System.out.println("How much is " + numOne + " divided by " + numTwo + "?\n Round to the hundredths place in your answer.");
                    Random scanner;
                    double userAnswer = scnr.nextDouble();
                    double midNum = numOne / numTwo;
                    midNum = Math.round(midNum * 100.00) / 100.00;
                    if (userAnswer != (midNum)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " divided by " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (midNum)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 5:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(90)+10;
                    double numTwo = randGen.nextInt(90)+10;
                    mixMod(numOne, numTwo);
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
        }
    }

    public static void levelThree(int arithmeticSelection) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int i;
        int countWrong = 0;
        int countRight = 0;

        switch (arithmeticSelection) {
            case 1:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(100)+100;
                    int numTwo = randGen.nextInt(100)+100;

                    System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo + numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne + numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 2:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(100)+100;
                    int numTwo = randGen.nextInt(100)+100;

                    System.out.println("How much is " + numOne + " times " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo * numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " times " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne * numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 3:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(100)+100;
                    int numTwo = randGen.nextInt(100)+100;

                    System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numOne - numTwo)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne - numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 4:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(100)+100;
                    double numTwo = randGen.nextInt(100)+100;

                    System.out.println("How much is " + numOne + " divided by " + numTwo + "?\n Round to the hundredths place in your answer.");
                    Random scanner;
                    double userAnswer = scnr.nextDouble();
                    double midNum = numOne / numTwo;
                    midNum = Math.round(midNum * 100.00) / 100.00;
                    if (userAnswer != (midNum)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " divided by " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (midNum)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 5:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(100)+100;
                    double numTwo = randGen.nextInt(100)+100;
                    mixMod(numOne, numTwo);
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
        }
    }

    public static void levelFour(int arithmeticSelection) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int i;

        switch (arithmeticSelection) {
            case 1:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(1000) + 1000;
                    double numTwo = randGen.nextInt(1000) + 1000;

                    System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo + numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne + numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 2:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(1000) + 1000;
                    double numTwo = randGen.nextInt(1000) + 1000;

                    System.out.println("How much is " + numOne + " times " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo * numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " times " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne * numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 3:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(1000) + 1000;
                    double numTwo = randGen.nextInt(1000) + 1000;

                    System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                    Random scanner;
                    int userAnswer = scnr.nextInt();
                    if (userAnswer != (numOne - numTwo)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne - numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 4:
                for (i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(1000) + 1000;
                    double numTwo = randGen.nextInt(1000) + 1000;

                    System.out.println("How much is " + numOne + " divided by " + numTwo + "?\n Round to the hundredths place in your answer.");
                    Random scanner;
                    double userAnswer = scnr.nextDouble();
                    double midNum = numOne / numTwo;
                    midNum = Math.round(midNum * 100.00) / 100.00;
                    if (userAnswer != (midNum)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " divided by " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (midNum)) {
                        countRight += 1;
                        approvalList();
                    }
                }
                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
            case 5:
                int numOne = randGen.nextInt(1000) + 1000;
                double numTwo = randGen.nextInt(1000) + 1000;
                for (i = 0; i < 10; ++i) {
                    mixMod(numOne, numTwo);
                }

                System.out.println("wrong " + countWrong);
                System.out.println("right " + countRight);
                System.out.println(teacherNeeded(countRight));
                break;
        }
    }

    public static void mixMod(int numOne, double numTwo) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int i;
        // for(i = 0; i < 10; ++i) {
            int arithmeticSelecton = randGen.nextInt(4) + 1;
            // int numOne = randGen.nextInt(1000) + 1000;
            // double numTwo = randGen.nextInt(1000) + 1000;
            switch (arithmeticSelecton) {
                case 1:
                    System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                    Random scanner;
                    double userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo + numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne + numTwo)) {
                        countRight += 1;
                        // System.out.println(countRight);
                        approvalList();
                    }
                    break;
                case 2:
                    System.out.println("How much is " + numOne + " times " + numTwo + "?");
                    //Random scanner;
                    userAnswer = scnr.nextInt();
                    if (userAnswer != (numTwo * numOne)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " times " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne * numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                    break;
                case 3:
                    System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                    //Random scanner;
                    userAnswer = scnr.nextInt();
                    if (userAnswer != (numOne - numTwo)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (numOne - numTwo)) {
                        countRight += 1;
                        approvalList();
                    }
                    break;
                case 4:
                    System.out.println("How much is " + numOne + " divided by " + numTwo + "?\n Round to the hundredths place in your answer.");
                    //Random scanner;
                    userAnswer = scnr.nextInt();
                    double midNum = numOne / numTwo;
                    midNum = Math.round(midNum * 100.00) / 100.00;
                    if (userAnswer != (midNum)) {
                        countWrong += 1;
                        disapprovalList();
                        //System.out.println("How much is " + numOne + " divided by " + numTwo + "?");
                        //userAnswer = scnr.nextInt();
                    }
                    if (userAnswer == (midNum)) {
                        countRight += 1;
                        approvalList();
                    }
            }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int i;
        int userScore;
        char userChar = 'y';
        //int countWrong;
        //int countRight;
        while(userChar == 'y')
        {
            System.out.println("Hello, welcome to the Arithmetic Trainer.\n  Please select a level to work on:");
            System.out.println("1. Level One: Single Digit Arithmetic");
            System.out.println("2. Level Two: Double Digit Arithmetic");
            System.out.println("3. Level Three: Triple Digit Arithmetic");
            System.out.println("4. Level Four: Quadruple Digit Arithmetic");
            System.out.println("Enter the number of the Level you wish to begin:");
            int levelSelection = scnr.nextInt();

            System.out.println("Good, now that you've selected a level.\n  Please select the kind of Arithmetic you would like to practice:");
            System.out.println("1. Addition Problems Only");
            System.out.println("2. Multiplication Problems Only");
            System.out.println("3. Subtraction Problems Only");
            System.out.println("4. Division Problems Only");
            System.out.println("5. Mixed Mode; Addition, Multiplication, Subtraction, and Division Problems");
            int arithmeticSelection = scnr.nextInt();

            if (levelSelection == 1) {
                levelOne(arithmeticSelection);
            }
            if (levelSelection == 2) {
                levelTwo(arithmeticSelection);
            }
            if (levelSelection == 3) {
                levelThree(arithmeticSelection);
            }
            if (levelSelection == 4) {
                levelFour(arithmeticSelection);
            }
            if ((levelSelection != 1) && (levelSelection != 2) && (levelSelection != 3) && (levelSelection != 4)){
                System.out.println("Not Valid Input Please Try Again.");
                levelSelection = scnr.nextInt();
            }
            System.out.println("Would a new student like to practice, type y for yes, type any other key to quit");
            userChar = scnr.next().charAt(0);
        }
    }

}
/*
    public static void levelSupport (int levelSelection) {

        switch (levelSelection){
            case 1:
                for(i = 0; i < 10; ++i) {
                    int numOne = randGen.nextInt(10);
                    double numTwo = randGen.nextInt(10);
                    mixMod(arithmeticSelection, numOne, numTwo);
                }
                break;
            case 2:
                for(i = 0; i < 10; ++i){
                    int numOne = randGen.nextInt(90)+10;
                    double numTwo = randGen.nextInt(90)+10;
                    mixMod(arithmeticSelection, numOne, numTwo);
                }
             break;
            case 3:
                for(i = 0; i < 10; ++i){
                    int numOne = randGen.nextInt(100)+100;
                    double numTwo = randGen.nextInt(100)+100;
                    mixMod(arithmeticSelection, numOne, numTwo);
                }
                break;
            case 4:
                for(i = 0; i < 10; ++i){
                    int numOne = randGen.nextInt(1000) + 1000;
                    double numTwo = randGen.nextInt(1000) + 1000;
                    mixMod(arithmeticSelection, numOne, numTwo);
                }
            break;
        }
    }

    public static void mixMod(int numOne, double numTwo) {
        int arithmeticSelecton = randGen.nextInt(4) + 1;
        switch (arithmeticSelecton) {
            case 1:
                System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                Random scanner;
                int userAnswer = scnr.nextInt();
                if (userAnswer != (numTwo + numOne)) {
                    countWrong += 1;
                    disapprovalList();
                    //System.out.println("How much is " + numOne + " plus " + numTwo + "?");
                    //userAnswer = scnr.nextInt();
                }
                if (userAnswer == (numOne + numTwo)) {
                    countRight += 1;
                    approvalList();
                }
                break;
            case 2:
                System.out.println("How much is " + numOne + " times " + numTwo + "?");
                Random scanner;
                int userAnswer = scnr.nextInt();
                if (userAnswer != (numTwo * numOne)) {
                    countWrong += 1;
                    disapprovalList();
                    //System.out.println("How much is " + numOne + " times " + numTwo + "?");
                    //userAnswer = scnr.nextInt();
                }
                if (userAnswer == (numOne * numTwo)) {
                    countRight += 1;
                    approvalList();
                }
                break;
            case 3:
                System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                Random scanner;
                int userAnswer = scnr.nextInt();
                if (userAnswer != (numOne - numTwo)) {
                    countWrong += 1;
                    disapprovalList();
                    //System.out.println("How much is " + numOne + " minus " + numTwo + "?");
                    //userAnswer = scnr.nextInt();
                }
                if (userAnswer == (numOne - numTwo)) {
                    countRight += 1;
                    approvalList();
                }
                break;
            case 4:
                System.out.println("How much is " + numOne + " divided by " + numTwo + "?\n Round to the hundredths place in your answer.");
                Random scanner;
                double userAnswer = scnr.nextDouble();
                double midNum = numOne / numTwo;
                midNum = Math.round(midNum * 100.00) / 100.00;
                if (userAnswer != (midNum)) {
                    countWrong += 1;
                    disapprovalList();
                    //System.out.println("How much is " + numOne + " divided by " + numTwo + "?");
                    //userAnswer = scnr.nextInt();
                }
                if (userAnswer == (midNum)) {
                    countRight += 1;
                    approvalList();
                }
        }
    }
    */
