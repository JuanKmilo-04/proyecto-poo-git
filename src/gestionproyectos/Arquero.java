public class Arquero extends Tarea {
    private int precision;

    public Arquero(String nombre, int precision) {
        super(nombre);
        this.precision = precision;
    }

    public void disparar() {
        System.out.println("Disparando con precision de " + precision);
    }
}