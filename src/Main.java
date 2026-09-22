import figuras.FiguraGeometrica;
import figuras.Quadrado;
import figuras.Retangulo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("=== Calculadora Geometrica ===");

        boolean continuar = true;
        while (continuar) {
            continuar = menu();
        }

        System.out.println("=== FIM ===");
        scanner.close();
        }

        public static boolean menu() {
            System.out.println("Escolha um figura geometrica: ");
            System.out.println(" 1 - Retangulo");
            System.out.println();
            System.out.println("0 - Sair");

            System.out.println();
            System.out.println("Digite a opcao:");
            int opcao = scanner.nextInt();

            FiguraGeometrica figura = null;
            boolean continuar = true;
            switch (opcao) {
                case 0 ->{
                    continuar = false;
                }
                case 1 ->{
                    System.out.println("Digite a largura do retangulo:");
                    double largura = scanner.nextDouble();
                    System.out.println("Digite a altura do retangulo:");
                    double altura = scanner.nextDouble();
                    figura = new Retangulo(largura, altura);
                }
                case 2 ->{
                    System.out.println("Digite o tamanha do lado do quadrado:");
                    double lado = scanner.nextDouble();
                    figura = new Quadrado(lado);
                }
                default -> System.out.println("Opcao invalida.");
            }
            if (figura != null) {
                System.out.printf("Area: %.2f%n", figura.calcularArea());
                System.out.printf("Perimetro: %.2f%n", figura.calcularPerimetro());
            }
            return continuar;
        }
}