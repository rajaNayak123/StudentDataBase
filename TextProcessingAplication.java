import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TextProcessingAplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your text");
            String str = sc.nextLine();

            System.out.println("1.word count");
            System.out.println("2.character count");
            System.out.println("3.reverse text");
            System.out.println("4.remove duplicate");
            System.out.println("exit");

            System.out.println("Enter your choise");
            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    int count = str.split("\\s+").length;
                    System.out.println("Number of massage" + count);
                    break;

                case 2:
                    int character = str.replaceAll("\\s+", "").split("").length;
                    System.out.println("Number of character" + character);

                case 3:
                    StringBuilder stra = new StringBuilder(str);
                    System.out.println(stra.reverse());

                case 4: HashSet res = new HashSet<>(Arrays)
                default:
                    break;
            }

        }

    }
}
