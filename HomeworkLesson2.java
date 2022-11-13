package lesson2;

public class HomeworkLesson2 {
    public static void main(String[] args) {
        System.out.println(printTrueFalse(5, 10));
        printPositiveNegative(-2);
        System.out.println(printPositiveTrueNegativeFalse(0));
        printString("Hello World!", 6);
    }

    private static boolean printTrueFalse(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return  false;
        }
    }

    private static void printPositiveNegative(int number) {
      if (number >=0) {
          System.out.println("Positive");
      } else {
          System.out.println("Negative");
      }
    }

    private static boolean printPositiveTrueNegativeFalse(int i) {
        if (i < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String word, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }
}


