public class MetodoBurbujaMejorado {

    public int[] ordenarAcendente(int[] arreglo){
        
        int tam=arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        for (int i = 0; i < tam-1; i++) {
            for (int j = 0; j < tam-1-i; j++) {
                contComparaciones ++;

                if (arreglo[j] > arreglo[j+1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        int[] resultado={contComparaciones,contCambios};
        return resultado;
    }
    public int[] ordenarDecendente(int[] arreglo){
        
        int tam=arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        for (int i = 0; i < tam-1; i++) {
            for (int j = 0; j < tam-1-i; j++) {
                contComparaciones ++;

                if (arreglo[j] < arreglo[j+1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        int[] resultado={contComparaciones,contCambios};
        return resultado;
    }

    public int[] ordenarAcendentePasos(int[] arreglo){
        
        int tam=arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        for (int i = 0; i < tam-1; i++) {
            System.out.println("\nIteración " + (i + 1) + ":");
            for (int j = 0; j < tam-1-i; j++) {
                contComparaciones ++;
                System.out.print("Comparando: arreglo[" + j + "] = " + arreglo[j] +
                " con arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);

                if (arreglo[j] > arreglo[j+1]) {
                    contCambios++;
                    System.out.println("  -> Se intercambian!");
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }else {
                    System.out.println("  -> No se intercambian.");
                }
            }
        }
        int[] resultado={contComparaciones,contCambios};
        return resultado;
    }
    public int[] ordenarDecendentePasos(int[] arreglo){
        
        int tam=arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        for (int i = 0; i < tam-1; i++) {
            System.out.println("\nIteración " + (i + 1) + ":");
            for (int j = 0; j < tam-1-i; j++) {
                contComparaciones ++;
                System.out.print("Comparando: arreglo[" + j + "] = " + arreglo[j] +
                " con arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);

                if (arreglo[j] < arreglo[j+1]) {
                    contCambios++;
                    System.out.println("  -> Se intercambian!");
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }else {
                    System.out.println("  -> No se intercambian.");
                }
            }
        }
        int[] resultado={contComparaciones,contCambios};
        return resultado;
    }

    public void printArray(int[] arreglo) {

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
