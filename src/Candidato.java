public class Candidato {
    private String nombre;
    private String apellido;
    private int numFicha;
    private int votos;

    public Candidato(String nombre, String apellido, int numFicha, int votos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numFicha = numFicha;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public Candidato setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Candidato setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public int getNumFicha() {
        return numFicha;
    }

    public Candidato setNumFicha(int numFicha) {
        this.numFicha = numFicha;
        return this;
    }

    public int getVotos() {
        return votos;
    }

    public Candidato setVotos(int votos) {
        this.votos = votos;
        return this;
    }
}
