 /*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea 1 Test-
15 de septiembre
*/

package Tarea1;

public class EDAlgoTP01Test {
    public static void main(String[] args) {
        System.out.println("Problema 1");
        EDAlgoTP01.problema1();
        System.out.println();

        System.out.println("Problema 2");
        EDAlgoTP01.problema2();
        System.out.println();

        System.out.println("Problema 3");
        EDAlgoTP01.problema3();
        System.out.println();

        // Problema E3
        System.out.println("E3");
        EDAlgoTP01.E3();
        System.out.println();
    }

    public static void salarioPorcobrarTest() {
        int[] ventas = {5000, 230, 430, 500};
        SalarioPorComision spc = new SalarioPorComision(ventas);
        // Asegúrate de que la clase SalarioPorComision esté definida correctamente
    }
}
