public class MetodoBurbuja {

    public void ordenarAcendente(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                System.out.println((" i= " + i + "  j= " + j));
                if (arreglo[i] > arreglo[j]) { // CONDICION DE CAMBIO
                    // INTERCAMBIO
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    public void ordenar(int[] arreglo, boolean isDes) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (isDes) {
                    System.out.println((" i= " + i + "  j= " + j));
                    if (arreglo[i] > arreglo[j]) { // CONDICION DE CAMBIO
                        // INTERCAMBIO
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                } else {
                    System.out.println((" i= " + i + "  j= " + j));
                    if (arreglo[i] < arreglo[j]) { // CONDICION DE CAMBIO
                        // INTERCAMBIO
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
        }
    }

    public void imprimirArreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "-");
        }

    }

}
