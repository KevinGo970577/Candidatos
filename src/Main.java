import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc1, i, opcCandidato, opcMedio, totalVotos, totalVotosEmitidos;
        double porcentaje, costoTotal, costoPromedio;
        boolean menu = true;

        Internet candidato1 = new Internet("Camilo", "Jimenez", 10, 0);
        Television candidato2 = new Television("Benito", "Martinez", 20, 0);
        Radio candidato3 = new Radio("Peeta", "Mellark", 30, 0);

        ArrayList<Candidato> listaCandidato = new ArrayList<>();
        listaCandidato.add(candidato1);
        listaCandidato.add(candidato2);
        listaCandidato.add(candidato3);

        do {
            System.out.println("        VOTACIONES PREMIER");
            System.out.println("            MENÚ");
            System.out.println("1. Votar por un candidato.");
            System.out.println("2. Calcular el costo de campaña de un candidato.");
            System.out.println("3. Vaciar todas las urnas de la votación.");
            System.out.println("4. Conocer el número total de votos.");
            System.out.println("5. Porcentaje de votos obtenidos por cada candidato.");
            System.out.println("6. Costo promedio de campaña en las elecciones.");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opc1 = teclado.nextInt();

            switch (opc1) {
                case 1:
                    System.out.println("Lista de Candidatos:");
                    i = 0;
                    while (i < listaCandidato.size()) {
                        System.out.println(listaCandidato.get(i));
                        i++;
                    }

                    System.out.print("Ingrese el número de ficha del candidato: ");
                    opcCandidato = teclado.nextInt();

                    if (opcCandidato == 10) {
                        candidato1.setVotos(candidato1.getVotos() + 1);

                        System.out.println("¿Qué medio influyó en su decisión de voto?");
                        System.out.println("1. Internet");
                        System.out.println("2. Radio");
                        System.out.println("3. Televisión");
                        System.out.print("Medio: ");
                        opcMedio = teclado.nextInt();

                        if (opcMedio == 1) {
                            System.out.println("Voto influido por Internet");
                        } else if (opcMedio == 2) {
                            System.out.println("Voto influido por Radio");
                        } else if (opcMedio == 3) {
                            System.out.println("Voto influido por Televisión");
                        } else {
                            System.out.println("Medio no válido");
                        }
                    } else if (opcCandidato == 20) {
                        candidato2.setVotos(candidato2.getVotos() + 1);

                        System.out.println("¿Qué medio influyó en su decisión de voto?");
                        System.out.println("1. Internet");
                        System.out.println("2. Radio");
                        System.out.println("3. Televisión");
                        System.out.print("Medio: ");
                        opcMedio = teclado.nextInt();

                        if (opcMedio == 1) {
                            System.out.println("Voto influido por Internet");
                        } else if (opcMedio == 2) {
                            System.out.println("Voto influido por Radio");
                        } else if (opcMedio == 3) {
                            System.out.println("Voto influido por Televisión");
                        } else {
                            System.out.println("Medio no válido");
                        }
                    } else if (opcCandidato == 30) {
                        candidato3.setVotos(candidato3.getVotos() + 1);

                        System.out.println("¿Qué medio influyó en su decisión de voto?");
                        System.out.println("1. Internet");
                        System.out.println("2. Radio");
                        System.out.println("3. Televisión");
                        System.out.print("Medio: ");
                        opcMedio = teclado.nextInt();

                        if (opcMedio == 1) {
                            System.out.println("Voto influido por Internet");
                        } else if (opcMedio == 2) {
                            System.out.println("Voto influido por Radio");
                        } else if (opcMedio == 3) {
                            System.out.println("Voto influido por Televisión");
                        } else {
                            System.out.println("Medio no válido");
                        }
                    } else {
                        System.out.println("Candidato no encontrado");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese número de ficha del candidato para calcular costo de campaña: ");
                    opcCandidato = teclado.nextInt();

                    if (opcCandidato == 10) {
                        System.out.println("El costo de la campaña del candidato #10 es: " + candidato1.calcularCostoCampania());
                    } else if (opcCandidato == 20) {
                        System.out.println("El costo de la campaña del candidato #20 es: " + candidato2.calcularCostoCampania());
                    } else if (opcCandidato == 30) {
                        System.out.println("El costo de la campaña del candidato #30 es: " + candidato3.calcularCostoCampania());
                    } else {
                        System.out.println("Candidato no encontrado");
                    }
                    break;

                case 3:
                    candidato1.setVotos(0);
                    candidato2.setVotos(0);
                    candidato3.setVotos(0);
                    System.out.println("Se han vaciado todas las urnas.");
                    break;

                case 4:
                    totalVotos = candidato1.getVotos() + candidato2.getVotos() + candidato3.getVotos();
                    System.out.println("Total de votos emitidos: " + totalVotos);
                    break;

                case 5:
                    totalVotosEmitidos = candidato1.getVotos() + candidato2.getVotos() + candidato3.getVotos();

                    if (totalVotosEmitidos > 0) {
                        System.out.println("Porcentaje de votos por candidato:");
                        porcentaje = (double) candidato1.getVotos() * 100 / totalVotosEmitidos;
                        System.out.println(candidato1.getNombre() + " " + candidato1.getApellido() + ": " + porcentaje + "%");

                        porcentaje = (double) candidato2.getVotos() * 100 / totalVotosEmitidos;
                        System.out.println(candidato2.getNombre() + " " + candidato2.getApellido() + ": " + porcentaje + "%");

                        porcentaje = (double) candidato3.getVotos() * 100 / totalVotosEmitidos;
                        System.out.println(candidato3.getNombre() + " " + candidato3.getApellido() + ": " + porcentaje + "%");
                    } else {
                        System.out.println("No hay votos registrados");
                    }
                    break;

                case 6:
                    costoTotal = candidato1.calcularCostoCampania() + candidato2.calcularCostoCampania() + candidato3.calcularCostoCampania();
                    costoPromedio = costoTotal / 3;
                    System.out.println("Costo promedio de las campañas es: " + costoPromedio);
                    break;

                case 7:
                    menu = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (menu);
    }
}