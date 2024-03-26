package sobrecarga;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {

        System.out.println(Operacao.mensagemEstatica());
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a operação:\n"+"1-adição dois valores inteiros\n"+"2-subtração\n"+"3-multiplicação\n"+"4-divisão\n"+"5-exponenciação\n"+"6-fatorial\n"+"7-adição três valores\n"+"8-adição dois valores texto");

        int opcao = teclado.nextInt();
        System.out.println("Digite o valor 1: ");
        int valor1 = teclado.nextInt();
        int valor2 = 0;
        if (opcao !=5 && opcao !=6){
            System.out.println("Digite o valor 2: ");
            valor2 = teclado.nextInt();
        }
      

      Operacao operacao = new Operacao();

      switch (opcao){
        case 1: System.out.println("Adição de dois valores inteiros="+operacao.soma(valor1, valor2));
        break;
        case 2: operacao.setMinuendo(valor1);
        operacao.setSubtraendo(valor2);
        System.out.println("Subtração="+operacao.subracao());
        break;
        case 3: operacao.setNumeroGenerico1(valor1);
        operacao.setNumeroGenerico2(valor2);
        System.out.println("Multiplicação="+operacao.multiplicacao());
        break;
        case 4: operacao.setNumeroGenerico1(valor1);
        operacao.setNumeroGenerico2(valor2);
        System.out.println("Divisão="+operacao.divisao());
        break;
        case 5:System.out.println("Exponenciação");
        double base = valor1;
        System.out.println("Digite o expoente: ");
        double expoente = teclado.nextDouble();
        double resultado = Operacao.calcularExponenciacao(base, valor2);
        System.out.println("O resultado de "+ base + " elevado a " + expoente + " é: " + resultado);
        break;
        case 6: operacao.setFatorial(valor1);
        System.out.println("Fatorial="+operacao.getFatorial());
        break;
        case 7: System.out.println("Adição de 3 valores"+operacao.soma(valor1, valor2, 78));
        break;
        case 8: System.out.println("Adição de dois valores texto="+operacao.soma(valor1, valor2));
        default: System.out.println("Operação invalida");

      }
      teclado.close();  
    } 
}
