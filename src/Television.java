public class Television extends Candidato {
    private final int costoPublicidadTelevision = 600000;

    public Television(String nombre, String apellido, int numFicha, int votos) {
        super(nombre, apellido, numFicha, votos);
    }

    @Override
    public double calcularCostoCampania() {
        return super.calcularCostoCampania() + costoPublicidadTelevision;
    }

    public int getCostoPublicidadTelevision() {
        return costoPublicidadTelevision;
    }
}