public class Internet extends Candidato {
    private int costoPublicidadInternet = 700000;

    public Internet(String nombre, String apellido, int numFicha, int votos) {
        super(nombre, apellido, numFicha, votos);
    }

    @Override
    public double calcularCostoCampania() {
        return super.calcularCostoCampania() + costoPublicidadInternet;
    }

    public int getCostoPublicidadInternet() {
        return costoPublicidadInternet;
    }
}