import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
       

        String[] vetorDeStrings = {"Alice", "Luana", "Nelza", "Karen", "Mirian", "Denner", "Ramires", "Neferides", "Tulio", "Demetrice", "Azenate"};
        String[] auxString = new String[vetorDeStrings.length];

        MergeSortGenerics<String> generics = new MergeSortGenerics<>();
        generics.ordenar(vetorDeStrings, auxString);
        System.out.println("Ordenando Strings: " + Arrays.toString(vetorDeStrings));

        MergeSortGenerics<Integer> generic2 = new MergeSortGenerics<>();
        Integer[] vetorDeInteger = {25,223,66,1,22,88,4,77,3,6,0};
        Integer[] auxInteger = new Integer[vetorDeInteger.length];
        generic2.ordenar(vetorDeInteger, auxInteger);
        System.out.println("Ordenando Strings: " + Arrays.toString(vetorDeInteger));

    }
}
