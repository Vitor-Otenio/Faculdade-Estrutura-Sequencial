/* 1) Faça um programa que receba dois números, calcule e mostre a subtração do primeiro
número pelo segundo. */

package exercicios;
    import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n01, n02, result;
        
        System.out.print("Digíte um número: ");
        n01 = input.nextDouble();
        System.out.print("Digíte um número: ");
        n02 = input.nextDouble();
        
        result = n01 - n02;
        
        System.out.println("\nResultado da subtração: " + result);
    }
}
