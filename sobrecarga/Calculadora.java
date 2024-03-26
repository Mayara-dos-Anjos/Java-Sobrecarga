package sobrecarga;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {

        System.out.println(Operacao.mensagemEstatica());
        
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        
      while (continuar) {
        System.out.println("Digite a operação:\n"+"1-adição dois valores inteiros\n"+"2-subtração\n"+"3-multiplicação\n"+"4-divisão\n"+"5-exponenciação\n"+"6-fatorial\n"+"7-adição três valores\n"+"8-adição dois valores texto\n"+"9-sair\n");
      

        int opcao = teclado.nextInt();
      
        int valor1 = 0;
        int valor2 = 0;
       
        if  (opcao == 9){
          System.out.println("Saindo...");
        }
          else if (opcao != 9){
            System.out.println("Digite o valor 1: ");
            valor1 = teclado.nextInt();
               if (opcao != 5 && opcao !=6){
            System.out.println("Digite o valor 2: ");
            valor2 = teclado.nextInt();
            }
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
        int expoente = teclado.nextInt();
        double resultado = Operacao.calcularExponenciacao(base, expoente);
        System.out.println("O resultado de "+ base + " elevado a " + expoente + " é: " + resultado);
        break;
        case 6: operacao.setFatorial(valor1);
        System.out.println("Fatorial="+operacao.getFatorial());
        break;
        case 7: 
        System.out.println("Digite o valor 3: ");
        int valor3 = teclado.nextInt();
        System.out.println("Adição de 3 valores= " + operacao.soma(valor1, valor2, valor3));
        break;
        case 8: System.out.println("Adição de dois valores texto="+operacao.soma(valor1, valor2));
        break;
        case 9: continuar = false;
        break;
        default: System.out.println("Operação invalida");

        }
      }
      teclado.close();  
    } 
}
