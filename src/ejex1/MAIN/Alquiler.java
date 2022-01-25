
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Alquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String nombre;
    protected Integer DNI;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected Integer amarre;
    protected String tipoBarco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer amarre, String tipoBarco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.tipoBarco = tipoBarco;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getAmarre() {
        return amarre;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public void crearAlquiler() {
        Alquiler alquiler = new Alquiler();
        System.out.println("INGRESE EL NOMBRE");
        this.nombre = (leer.next());
        this.DNI = (int) (Math.random() * 10000);
        System.out.println("INGRESE LA FECHA DE ALQUILER");
        LocalDate fecha = LocalDate.of(leer.nextInt(), Month.of(leer.nextInt()), leer.nextInt());
        this.fechaAlquiler = fecha;
        System.out.println("INGRESE LA FECHA DE DEVOLUCION");
        LocalDate fecha2 = LocalDate.of(leer.nextInt(), Month.of(leer.nextInt()), leer.nextInt());
        this.fechaDevolucion = fecha2;
        this.amarre = (int) (Math.random() * 100);
        System.out.println("INGRESE EL TIPO DE BARCO");
        this.tipoBarco = leer.next();
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", amarre=" + amarre + ", tipoBarco=" + tipoBarco + '}';
    }

}
