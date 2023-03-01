/*2) Faça um programa que receba três números, calcule e mostre a multiplicação desses números.*/

package exercicios;
    import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n01, n02, n03, result;
        
        System.out.print("Digíte um número: ");
        n01 = input.nextDouble();
        System.out.print("Digíte um número: ");
        n02 = input.nextDouble();
        System.out.print("Digíte um número: ");
        n03 = input.nextDouble();
        
        result = n01 * n02 * n03;
        
        System.out.println("\nResultado da subtração: " + result);
    }
}
