public class Radio extends Candidato {
    private final int costoPublicidadRadio = 200000;

    public Radio(String nombre, String apellido, int numFicha, int votos) {
        super(nombre, apellido, numFicha, votos);
    }

    @Override
    public double calcularCostoCampania() {
        return super.calcularCostoCampania() + costoPublicidadRadio;
    }

    public int getCostoPublicidadRadio() {
        return costoPublicidadRadio;
    }
}