package br.com.fiap.si;

public class OperacoesAritmeticas {

	public static void main(String[] args) {
		
		int x = 9;
		int y = 2;
		int soma = x+y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x /y;
		int resto = x % y;
		
		System.out.println("Resultado da adição:            " +soma);
		System.out.println("Resultado da subtração:         " + subtracao);
		System.out.println("Resultado da multiplicação:     " + multiplicacao);
		System.out.println("Resultado da divisão:     " + divisao);
		System.out.println("Resultado do módulo:     " + resto);
		
		
		x++; 
		System.out.println("Resultado do incremento de x: " + x );
		y--;
		System.out.println("Resultado do descremento de y: " + y );
		
		x +=10;
		System.out.println("Atribuição aditiva  de x: " + x );
		y -=10;
		System.out.println("Atribuição subtrativa de y: " + y );

	}

}
