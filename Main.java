import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Degree degree = new Degree();
        String exitOption = "yes";
        String op;

        while(exitOption.equals("yes"))
        {
            System.out.println("Type the degree in Celsius");
            degree.setCelsius();

            System.out.println(
                    "1 - (F)Convert to Fahrenheit\n" +
                    "2 - (K)Convert to Kelvin\n" +
                    "3 - (Re)Convert to Reaumur\n" +
                    "4 - (Ra)Convert  to Rankine\n");
            op = scanner.nextLine();
            switch (op)
            {
                case "F":
                    degree.setFahrenheit(degree.getCelsius());
                    System.out.println(degree.getFahrenheit());
                    break;
                case "K":
                    degree.setKelvin(degree.getCelsius());
                    System.out.println(degree.getKelvin());
                    break;
                case "Re":
                    degree.setReaumur(degree.getCelsius());
                    System.out.println(degree.getReaumur());
                    break;
                case "Ra":
                    degree.setRankine(degree.getCelsius());
                    System.out.println(degree.getRankine());
                    break;
            }
          System.out.println("Do you want to continue? ");
          exitOption = scanner.nextLine();
        }

    }
}