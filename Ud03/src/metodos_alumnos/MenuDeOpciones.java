package metodos_alumnos;

import java.util.Scanner;

public class MenuDeOpciones
{
    public static void main(String[] args)
    {
        char opcion;
        Scanner teclado = new Scanner(System.in);

        do
        {
            mostrarMenu();

            do
            {
                System.out.printf("\nIntroduzca opción (1-4): ");
                opcion = teclado.next().charAt(0);
            }
            while(opcion < '1' || opcion > '4');

            System.out.printf("\n");

            switch(opcion)
            {
                case '1': numerosDelUnoAlDiez();
                          break;
                case '2': tablaDel8();
                          break;
                case '3': potenciasDe2();
            }
        }
        while(opcion != '4');
    }

    private static void mostrarMenu()
    {
        System.out.printf("\n>>> MENÚ DE OPCIONES <<<");
        System.out.printf("\n1. Números del 1 al 10.");
        System.out.printf("\n2. Tabla de multiplicar del 8.");
        System.out.printf("\n3. Primeras diez potencias de 2.");
        System.out.printf("\n4. Salir.");
    }

    private static void numerosDelUnoAlDiez()
    {
        int numero;

        for(numero = 1; numero <= 10; numero++)
            System.out.printf("%d ", numero);
        System.out.printf("\n");
    }

    private static void tablaDel8()
    {
        int contador, resultado;

        for(contador = 1; contador <= 10; contador++)
        {
            resultado = contador * 8;
            System.out.printf("8 * %d = %d\n", contador, resultado);
        }
    }

    private static void potenciasDe2()
    {
        int contador;

        for(contador = 1; contador <= 10; contador++)
            System.out.printf("%d ", (int) Math.pow(2, contador));
        System.out.printf("\n");
    }
}