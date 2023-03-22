import java.util.Scanner;
public class Problem3 {

    public static void main(String[] args) {
        int ventas[][] = new int[15][12];
        int ventasMes[] = new int[12];
        int ventasVendedores[] = new int[15];

        rellenarMatriz(ventas);
        imprimir(ventas);

        System.out.println();
        System.out.println();

        rellenarVentasVendedores(ventas, ventasVendedores);
        imprimirCadena(ventasVendedores);

        System.out.println();
        System.out.println();

        VendedorQueVendioMas(ventasVendedores);
        System.out.println();
        System.out.println();
        rellenarListaVentasMes(ventas, ventasMes);
        imprimirCadena(ventasMes);

        System.out.println();
        System.out.println();

        MesMenosVentas(ventasMes);

        System.out.println();
        imprimirPromVendedor(ventasVendedores);

        System.out.println();
        imprimirPromedioMes(ventasVendedores);
        System.out.println();

        ventasVendedor(ventas);
    }
    public static void rellenarMatriz(int ventas[][]) {

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                ventas[i][j] = (int) (Math.random() * 99 + 1);

            }
        }

    }

    public static void imprimir(int ventas[][]) {
        for (int i = 0; i < ventas.length; i++) {
            System.out.println();
            for (int j = 0; j < ventas[0].length; j++) {
                System.out.print(ventas[i][j] + ";");

            }

        }
    }

    public static void rellenarListaVentasMes(int ventas[][], int ventasMes[]) {
        int acum = 0;
        for (int i = 0; i < ventas[i].length; i++) {
            acum = 0;
            for (int j = 0; j < ventas.length; j++) {
                acum = acum + ventas[j][i];
            }
            ventasMes[i] = acum;

        }
    }

    public static void imprimirCadena(int cadena[]) {
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i] + ";");
        }
    }

    public static void rellenarVentasVendedores(int ventas[][], int ventasVendedores[]) {
        int acum = 0;
        for (int i = 0; i < ventas.length; i++) {
            acum = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                acum = acum + ventas[i][j];
            }
            ventasVendedores[i] = acum;
        }
    }

    public static void VendedorQueVendioMas(int VentasVendedores[]) {
        int max = 0;
        int trabajador = 0;
        for (int i = 0; i < VentasVendedores.length; i++) {
            if (VentasVendedores[i] > max) {
                max = VentasVendedores[i];
                trabajador = i + 1;
            }
        }
        System.out.println("El trabajador numero: " + trabajador + " Fue el que vendio mas productos en el año");
    }

    public static void MesMenosVentas(int VentasMes[]) {
        int min = 1001;
        int mes = 0;
        for (int i = 0; i < VentasMes.length; i++) {
            if (VentasMes[i] < min) {
                min = VentasMes[i];
                mes = i + 1;
            }
        }
        System.out.println("El mes con menos ventas es: " + mes);
    }

    public static void imprimirPromedioMes(int VentasVendedores[]){
        double prom = promMes(VentasVendedores);
        System.out.println("El promedio mensual es: " + prom);
    }

    public static void imprimirPromVendedor(int vendedores[]){
        for (int i = 0; i <vendedores.length ; i++) {
            double prom = promedioVendedores(vendedores[i]);
            System.out.println("el promedio mensual del vendedor " + (i + 1) + " es: " + (prom));
        }
    }
    public static double promedioVendedores(int prom){
        return prom/12;
    }

    public static double promMes(int VentasVendedores[]){
        int año = 0;
        for (int i = 0; i <VentasVendedores.length ; i++) {
            año = año + VentasVendedores[i];
        }

        return año/12;

    }

    public static void  ventasVendedor(int Venta[][]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige al vendedor que quieres ver las ventas");
        int elec = teclado.nextInt() - 1;

        System.out.println("Las ventas del Vendedor "  + elec + "Son: ");
            for (int i = 0; i < 12 ; i++) {
                System.out.print(Venta[elec][i] + ";");
            }
        }
    }

