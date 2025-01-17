import java.util.Scanner;

class WeiightIdeal {
    public static double calculateIMC(double weight, double height) {
        return weight / (height * height);
    }

    public static String categoryIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso" ;
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Acima do peso";
        } else {
            return "Obesidade";
        }
    }


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu peso: ");
    double weight = scanner.nextDouble();

    System.out.println("Digite sua altura: ");
    double height = scanner.nextDouble();
    double imc = WeiightIdeal.calculateIMC(weight, height);
    String category = WeiightIdeal.categoryIMC(imc);
    System.out.printf("Seu IMC é %.2f, que está na categoria: %s%n", imc, category);
    }
}