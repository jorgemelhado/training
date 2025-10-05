import java.util.Arrays;

public class DividedBy3and5v2 {

    // Usando arrays dinamicos - ArrayList


    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, l = 0;
        int num=1;
        int[] dividedBy3 = new int[40];
        int[] dividedBy5 = new int[40];
        int[] dividedBy3and5 = new int[40];

        for(num = 1; num <= 100; num++) {
            if (num % 3 == 0) {
                dividedBy3[i] = num;
                i++;
            }

            if (num % 5 == 0) {
                dividedBy5[j] = num;
                j++;
            }

            if (num % 3 == 0 && num % 5 == 0) {
                dividedBy3and5[k] = num;
                k++;
            }
        }
        System.out.println("\nDivisiveis por 3: ");
        for(l = 0; l < i; l++) {
            System.out.print(dividedBy3[l] + " ");
        }
        System.out.println("\nDivisiveis por 5: ");
        for(l = 0; l < j; l++) {
            System.out.print(dividedBy5[l] + " ");
        }
        System.out.println("\nDivisiveis por 3 e 5: ");
        for(l = 0; l < k; l++) {
            System.out.print(dividedBy3and5[l] + " ");
        }

    }
}

