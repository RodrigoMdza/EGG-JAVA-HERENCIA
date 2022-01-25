
import java.util.Scanner;

public final class Polideportivo extends Edificio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private boolean techado;

    public Polideportivo() {

    }

    public Polideportivo(String nombre, boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + 
         "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    public void crearPoli() {
        System.out.println("INGRESE EL NOMBRE");
        this.nombre = leer.next();
        System.out.println("ES TECHADO?");
        String aux=leer.next().toUpperCase();
        if (aux.equals("SI")) {
            this.techado=true;
        } else {
            this.techado=false;
        }
    }

    @Override
    public void calcularSuperficio() {
        Integer superficie = largo * ancho;
        System.out.println("La superficie es " + superficie);
    }

    @Override
    public void calcularVolumen() {
        Integer volumen = ancho * alto * largo;
        System.out.println("EL volumen es " + volumen);
    }
}
