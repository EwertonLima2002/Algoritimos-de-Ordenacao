package busca_binaria;

public class BuscaBinaria {

    public static int buscaBinaria(int[] array, int target) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int mid = esquerda + (direita - esquerda) / 2;

            // Verifica se o elemento do meio é igual ao alvo
            if (array[mid] == target) {
                return mid;
            }

            // Se o alvo for maior, descarte a metade direita
            if (array[mid] < target) {
                esquerda = mid + 1;
            }
            // Se o alvo for menor, descarte a metade esquerda
            else {
                direita = mid - 1;
            }
        }

        // Se não existe, retorna -1, pois não está na lista
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int target = 5;
        int resultado = buscaBinaria(array, target);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição " + resultado);
        } else {
            System.out.println("Elemento não encontrado na lista.");
        }
    }
}
