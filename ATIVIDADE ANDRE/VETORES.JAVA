public class Vetores {
    public static void main(String[] args) {
        
        int[] A = {1, 2, 3, 4, 5}; 
        int[] B = new int[5];  

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("Vetor A:");
        for (int i : A) {
            System.out.print(i + " ");
        }

        System.out.println("\nVetor B:");
        for (int i : B) {
            System.out.print(i + " ");
        }
    }
}