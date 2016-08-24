import java.util.Scanner;

public class Calcular {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		Operadores operadores = new Operadores();
		int valor1;
		int valor2;
		
		System.out.println("*** Calculadora certa ***");
		System.out.println("Digite o primeiro número para ser calculador:");
		System.out.print("R: ");
		operadores.a = teclado.nextInt();
		System.out.println("Digite o segundo número para ser calculador:");
		System.out.print("R:");
		operadores.b = teclado.nextInt();
		
		System.out.println("Qual opearação você quer realizar?");
		System.out.println("1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
		System.out.print("R:");
		operadores.operacao = teclado.nextInt();
		System.out.println("");
		
		if (operadores.operacao == 1){
			operadores.soma();
		}else if(operadores.operacao == 2){
			operadores.subtracao();
		}else if(operadores.operacao == 3){
			operadores.multiplicacao();
		}else if(operadores.operacao == 4){
			operadores.divisao();
        {
}

		}
		}
	}