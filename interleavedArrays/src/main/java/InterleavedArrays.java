import java.util.Scanner;

public class InterleavedArrays {
    public static void main(String[] args) {
        int sizeVetor;
        Scanner entradaValor = new Scanner(System.in);
        System.out.println("Digite o valor de tamanho");
        sizeVetor = entradaValor.nextInt();

        int[] A = new int[sizeVetor];
        int[] B = new int[sizeVetor];

        InterleavedArrays valorFinal = new InterleavedArrays();


        for(int i=0; i < sizeVetor; i++){
            A[i] = entradaValor.nextInt();
        }

        for(int i=0; i < sizeVetor; i++){
            B[i] = entradaValor.nextInt();
        }

        System.out.println(valorFinal.compute(A, B));
    }

    String compute(int[] arrayA, int[] arrayB) {
        String resultado;
        StringBuilder finalString = new StringBuilder();

        for (int i=0; i < arrayA.length; i++){
            finalString.append(String.valueOf(arrayA[i] + " " + arrayB[i] + " "));
        }
        resultado = finalString.toString();
        resultado = resultado.substring(0, resultado.length()-1);
        return resultado;
    }
}
