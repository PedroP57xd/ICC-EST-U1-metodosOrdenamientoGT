public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] Listado = { 10, 21, 5, 8, -1, 0 };
        int[] Array = { 64, 25, 12, 22, 11 };
        int[] Array2 = { 64, 25, 12, 22, 11 };
        int[] Array3 = { 64, 25, 12, 22, 11 };
        // int[] Array = new int[1000000000];
        // for (int i = 0; i < Array.length; i++) {
        // Array[i] = (int) (Math.random() * 1000000000) + 1;
        // }

        System.out.println("       METODO BURBUJA");
        MetodoBurbuja mB = new MetodoBurbuja();
        // mB.imprimirArreglo(Listado);
        // System.out.println();
        // mB.ordenarAcendente(Listado);
        // mB.imprimirArreglo(Listado);

        mB.imprimirArreglo(Listado);
        mB.ordenar(Listado, true);
        mB.imprimirArreglo(Listado);
        mB.ordenar(Listado, false);
        mB.imprimirArreglo(Listado);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("       METODO SELECCION");
        MetodoSeleccion mS = new MetodoSeleccion();
        mS.printArray(Array);
        System.out.println("Arreglo Original");
        mS.ordenar(Array, true);
        mS.printArray(Array);
        System.out.println("Arreglo Ordenado ");
        mS.ordenar(Array, false);
        mS.printArray(Array);
        System.out.println("Arreglo Ordenado ");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("       METODO INSERCION");
        MetodoInsercion mI = new MetodoInsercion();
        mI.printArray(Array2);
        System.out.println("Arreglo Original");
        mI.ordenarAcendente(Array2);
        mI.printArray(Array2);
        System.out.println("Arreglo Ordenado con pasos");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("       METODO INSERCION CON PASOS");
        MetodoInsercion mIP = new MetodoInsercion();
        System.out.println("Arreglo Original");
        mIP.printArray(Array3);
        System.out.println("Arreglo Ordenado con pasos");
        mIP.ordenarAcendentePasos(Array3);
        mIP.printArray(Array3);
    }

}
