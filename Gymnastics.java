import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String item = scanner.nextLine();

        double difficulty = 0;
        double play = 0;
        if (country.equals("Russia")) {
            if (item.equals("ribbon")) {
                difficulty = 9.100;
                play = 9.400;
            } else if (item.equals("hoop")) {
                difficulty = 9.300;
                play = 9.800;
            } else if (item.equals("rope")) {
                difficulty = 9.600;
                play = 9.000;
            }
        }

        if (country.equals("Bulgaria")) {
            if (item.equals("ribbon")) {
                difficulty = 9.600;
                play = 9.400;
            } else if (item.equals("hoop")) {
                difficulty = 9.550;
                play = 9.750;
            } else if (item.equals("rope")) {
                difficulty = 9.500;
                play = 9.400;
            }
        }

        if (country.equals("Italy")) {
            if (item.equals("ribbon")) {
                difficulty = 9.200;
                play = 9.500;
            } else if (item.equals("hoop")) {
                difficulty = 9.450;
                play = 9.350;
            } else if (item.equals("rope")) {
                difficulty = 9.700;
                play = 9.150;
            }

        }
        double totalScore = difficulty + play;

        double percent = (20 - totalScore) / 20 * 100;
        System.out.printf("The team of %s get %.3f on %s.%n%.2f%%", country, totalScore, item, percent);
    }
}
