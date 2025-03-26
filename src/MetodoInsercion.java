public class MetodoInsercion {
    public void ordenarAcendente(int[] arreglo) {

        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
    }

    public void ordenarAcendentePasos(int[] arreglo) {

        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            System.out.println("i = " + i + ", j = " + j + ", aux = " + aux);

            while (j >= 0 && arreglo[j] > aux) {
                System.out.println("Comparando:  aux = " + aux + " con arreglo[" + j + "] = " + arreglo[j]);

                System.out.println("Moviendo: arreglo [" + j + "] se mueve a la posición [" + (j + 1) + "]");
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
            System.out.println("aux= " + aux + " se inserta en la posición " + (j + 1));
        }
    }

    public void printArray(int[] arreglo) {
        System.out.println("Arreglo clase Insercion");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
