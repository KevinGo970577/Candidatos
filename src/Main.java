import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc1, opcCandidato;
        List<Candidato> listaCandidato = new ArrayList<>();
        boolean menu = false;

        Candidato candidato1 = new Candidato("Camilo", "Jimenez", 10, 0);
        Candidato candidato2 = new Candidato("Benito", "Martinez", 20, 0);
        Candidato candidato3 = new Candidato("Peeta", "Mellark", 30, 0);

        do {

            System.out.println("     VOTACIONES PREMIER");
            System.out.println("            MENÚ");
            System.out.println("1. Votar por un candidato.");
            System.out.println("2. Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto.");
            System.out.println("3. Vaciar todas las urnas de la votación.");
            System.out.println("4. Conocer el número total de votos.");
            System.out.println("5. Porcentaje de votos obtenidos por cada candidato.");
            System.out.println("6. Costo promedio de campaña en las elecciones.");
            System.out.println("7. Salir");
            opc1 = teclado.nextInt();
            if (opc1 == 1) {
                System.out.println(listaCandidato);
                System.out.println();
                System.out.println("Ingrese el numero de ficha");
                opcCandidato = teclado.nextInt();
                if (opcCandidato == 10) {
                    Candidato candidato = candidato1.setVotos(+1);
                    System.out.println("Has votado por el candidato: "+ candidato1.getNombre()+candidato1.getApellido()+candidato1.getNumFicha()+candidato1.getVotos());
                }
                if (opcCandidato == 20) {
                    candidato2.setVotos(+1);
                }
                if (opcCandidato == 30) {
                    candidato3.setVotos(+1);
                }
                menu = true;
            }
        }while (menu);
    }
}