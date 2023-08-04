import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int maxDividendo = 1000;
        List<Integer> divisores = new ArrayList<>(Arrays.asList(3, 5));
        int valor;

        valor = somarMultiplos(maxDividendo, divisores);

        System.out.print("A soma dos multiplos de ");
        for (int i = 0; i < divisores.size(); i++) {
            if (i == (divisores.size() - 1)) {
                System.out.printf("ou %d, ", divisores.get(i));
            } else if (i == 0) {
                System.out.printf("%d ", divisores.get(i));
            } else {
                System.out.printf(", %d ", divisores.get(i));
            }
        }
        System.out.printf("ate %d, e: %d\n", maxDividendo, valor);
    }

    public static int somarMultiplos(int maxDividendo, List<Integer> divisores) {
        int somaMultiplos = 0;
        for(int i = 1; i < maxDividendo; i++) {
            if (verificarDivisibilidade(i, divisores)) {
                System.out.printf("Multiplo: %d\n", i);
                somaMultiplos += i;
            }
        }

        return  somaMultiplos;
    }

    public static boolean verificarDivisibilidade(int dividendo, List<Integer> divisores) {
        for (int divisor : divisores) {
            int resto = dividendo % divisor;
            if (resto == 0) {
                return true;
            }
        }

        return false;
    }
}