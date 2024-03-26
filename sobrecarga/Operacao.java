package sobrecarga;

public class Operacao {
    
    private int nFatorial = 0;
    private int nMinuendo = 0;
    private int nSubtraendo = 0;
    private int nGenerico1 = 0;
    private int nGenerico2 = 0;
    public int soma (int numero1, int numero2){
        return numero1 + numero2;
    }

    

    public Operacao() {
        this.nMinuendo = 0;
        this.nSubtraendo = 0;
        this.nGenerico1 = 0;
        this.nGenerico2 = 0;
    }



    public void setMinuendo(int numero) {
        this.nMinuendo = numero;
    }
    public void setSubtraendo(int numero) {
        this.nSubtraendo = numero;
    }
    public int subracao(){
        return nMinuendo - nSubtraendo;
    }
    public void setFatorial(int numero) {
        this.nFatorial = numero;
    }
    private int fatorialRecursivo(int numero){
        if ((numero==1) || (numero==0)){
            return 1;
        } else {
            return fatorialRecursivo(numero-1)*numero;
        }
    }
    public int getFatorial(){
        return fatorialRecursivo(nFatorial);
    }
    public int multiplicacao(){
        return this.nGenerico1 * this.nGenerico2;
    }
    public void setNumeroGenerico1(int numero){
        this.nGenerico1 = numero;
    }
    public void setNumeroGenerico2(int numero){
        this.nGenerico2 = numero;
    }
    public int divisao(){
        return this.nGenerico1 / this.nGenerico2;
    }
    public int soma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
    public int soma(String numero1, String numero2){
        return Integer.parseInt(numero1) + Integer.parseInt(numero2);
    }
    static public String mensagemEstatica(){
        return "Sou um método estático. Diferente de dinâmico, não preciso ser instanciado! Bem Vindo, aperte ENTER para continuar!";
    }

   public static double calcularExponenciacao(double base, int expoente){
        if (expoente < 0){
            return 1 / potencialPositiva(base, -expoente);
        } else{
            return potencialPositiva(base, expoente);
        }
    }
    private static double potencialPositiva(double base, int expoente){
        double resultado = 1.0;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
   

}
