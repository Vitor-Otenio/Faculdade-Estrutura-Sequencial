/* 3) Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número pelo 
segundo. Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupar com 
validações. */

package exercicios;
    import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     double n01, n02, result;
     
        System.out.print("Digíte um número: ");
        n01 = input.nextDouble();
        System.out.print("Digíte um número: ");
        n02 = input.nextDouble();
        
        result = n01 / n02;
        
        System.out.println("\nResultado: " + result);
    } 
}
