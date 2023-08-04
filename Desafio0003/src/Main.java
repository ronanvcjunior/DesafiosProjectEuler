public class Main {
    public static void main(String[] args) {
        long valor;

        valor = verificarMaximoFatorPrimo(600851475143L);

        System.out.printf("O maximo fator primo e: %d\n", valor);
    }

    public static long verificarMaximoFatorPrimo(long valor) {
        if (verificarNumeroPrimo(valor)) {
            return valor;
        }

        long divisor = Math.round(Math.sqrt(valor));
        if ((divisor % 2) == 0) {
            divisor++;
        }

        do {
            if ((valor % divisor) == 0) {
                System.out.printf("Fator: %d\n", divisor);
                if (verificarNumeroPrimo(divisor)) {
                    return divisor;
                }
                else {
                    System.out.printf("%d nao e primo\n", divisor);
                }
            }
            else {
                System.out.printf("%d nao e divisor\n", divisor);
            }
            divisor -= 2;
        } while(divisor > 0);

        return -1;
    }

    public static boolean verificarNumeroPrimo(long valor) {
        long divisor = 2;

        if (valor == 1) {
            return true;
        }
        do {
            if ((valor % divisor) == 0) {
                return false;
            }
        } while(divisor++ < (valor / 2));

        return true;
    }
}