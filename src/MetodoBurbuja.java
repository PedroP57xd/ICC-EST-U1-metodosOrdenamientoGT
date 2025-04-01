public class MetodoBurbuja {

    public void ordenarAcendente(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] > arreglo[j]) { // CONDICION DE CAMBIO
                    // INTERCAMBIO
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
    public void ordenarDecendente(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] < arreglo[j]) { // CONDICION DE CAMBIO
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
                    if (arreglo[i] > arreglo[j]) { // CONDICION DE CAMBIO
                        ordenarAcendente(arreglo);
                    }
                } else {
                    System.out.println((" i= " + i + "  j= " + j));
                    if (arreglo[i] < arreglo[j]) { // CONDICION DE CAMBIO
                        // INTERCAMBIO
                        ordenarDecendente(arreglo);
                    }
                }
            }
        }
    }

    public void ordenarAcendentePasos(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                System.out.println("\nComparando: arreglo[" + i + "] = " + arreglo[i] + " con arreglo[" + j + "] = " + arreglo[j]);

                if (arreglo[i] > arreglo[j]) { // CONDICION DE CAMBIO
                    System.out.println(" -> Se intercambian arreglo[" + i + "] = " + " y arreglo[" + j + "] = ");
                    // INTERCAMBIO
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    System.out.println("Arreglo después del intercambio:");
                } else {
                    System.out.println(" → No se intercambian");
                }

            }
        }
        System.out.println("\nArreglo ordenado: ");
    }
    public void ordenarDecendentePasos(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] < arreglo[j]) { // CONDICION DE CAMBIO
                    // INTERCAMBIO
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
    public void ordenarPasos(int[] arreglo, boolean isDes) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (isDes) {
                    if (arreglo[i] > arreglo[j]) { // CONDICION DE CAMBIO
                        ordenarAcendentePasos(arreglo);(arreglo);
                    }
                } else {
                    System.out.println((" i= " + i + "  j= " + j));
                    if (arreglo[i] < arreglo[j]) { // CONDICION DE CAMBIO
                        // INTERCAMBIO
                        ordenarDecendentePasos(arreglo);
                    }
                }
            }
        }
    }


    public void imprimirArreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " 1");
        }

    }

}
