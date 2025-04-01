public class MetodoSeleccion {
    public void ordenarAcendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[iM]) {
                    iM = j;
                }
            }
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }
    public void ordenarDesendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[iM]) {
                    iM = j;
                }
            }
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }
    public void ordenar(int[] arreglo, boolean isDes) {

        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (isDes) {
                    ordenarAcendente(arreglo);
                } else {
                    ordenarDesendente(arreglo);
                }
            }
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }

    public void ordenarAcendentePasos(int[] arreglo) {
        
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                System.out.println("\nComparando: arreglo[" + j + "] = " + arreglo[j] + " con arreglo[" + iM + "] = " + arreglo[iM]);
                if (arreglo[j] > arreglo[iM]) {
                    System.out.println(" -> Nuevo máximo encontrado en posición " + j + ": " + arreglo[j]);
                    iM = j;
                }
            }
            if (i != iM) {
                System.out.println("Intercambiando " + arreglo[i] + " con " + arreglo[iM]);
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
                System.out.println("Arreglo después del intercambio:");
            } else{
                System.out.println("No se realizó intercambio en esta iteración.");
            }
        }
    }
    public void ordenarDesendentePasos(int[] arreglo) {
        
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                System.out.println("\nComparando: arreglo[" + j + "] = " + arreglo[j] + " con arreglo[" + iM + "] = " + arreglo[iM]);
                if (arreglo[j] > arreglo[iM]) {
                    System.out.println(" -> Nuevo máximo encontrado en posición " + j + ": " + arreglo[j]);
                    iM = j;
                }
            }
            if (i != iM) {
                System.out.println("Intercambiando " + arreglo[i] + " con " + arreglo[iM]);
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
                System.out.println("Arreglo después del intercambio:");
            } else{
                System.out.println("No se realizó intercambio en esta iteración.");
            }
        }
    }
    public void ordenarPasos(int[] arreglo, boolean isDes) {

        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                
                if (isDes) {
                    
                    ordenarAcendentePasos(arreglo);(arreglo);
                } else {
                    ordenarDesendentePasos(arreglo);
                }
            }
        }
    }

    public void printArray(int[] arreglo) {
        System.out.println("Arreglo clase seleccion");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
