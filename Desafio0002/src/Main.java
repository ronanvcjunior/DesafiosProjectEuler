public class Main {
    public static void main(String[] args) {
        int valor;
        int maxValor = 4000000;

        valor = somarValoresParesFibonacci(maxValor);

        System.out.printf("Valor da soma dos pares da sequencia de fibonnaci: %d\n", valor);
    }

    public static int somarValoresParesFibonacci(int maxValorFibonacci) {
        int valorFibonacci = 0;
        int somaValoresParesFibonacci = 0;

        for (int i = 0; valorFibonacci < maxValorFibonacci; i++) {
            valorFibonacci = calcularFibonacci(i);
            if (verificarValorPar(valorFibonacci) && valorFibonacci < maxValorFibonacci) {
                somaValoresParesFibonacci += valorFibonacci;
            }
        }

        return somaValoresParesFibonacci;
    }

    public static int calcularFibonacci(int position) {
        if (position == 0) {
            return 0;
        }
        else if (position == 1) {
            return 1;
        }
        else {
            return calcularFibonacci(--position) + calcularFibonacci(--position);
        }
    }

    public static boolean verificarValorPar(int valor) {
        int resto = valor % 2;
        return resto == 0;
    }
}