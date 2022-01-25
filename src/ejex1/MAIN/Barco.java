
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Barco extends Alquiler {

    protected String matricula;
    protected Integer eslora;
    protected Integer modelo;
    protected boolean barcoEspecial;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer modelo, boolean barcoEspecial, String nombre, Integer DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer amarre, String tipoBarco) {
        super(nombre, DNI, fechaAlquiler, fechaDevolucion, amarre, tipoBarco);
        this.matricula = matricula;
        this.eslora = eslora;
        this.modelo = modelo;
        this.barcoEspecial = barcoEspecial;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public boolean isBarcoEspecial() {
        return barcoEspecial;
    }

    public void setBarcoEspecial(boolean barcoEspecial) {
        this.barcoEspecial = barcoEspecial;
    }

    public void crearBarco() {
        super.crearAlquiler();
        System.out.println("INGRESE LA MATRICULA");
        this.matricula = leer.next();
        System.out.println("INGRESO LOS METROS DE ESLORA");
        this.eslora = leer.nextInt();
        this.modelo = (int) (Math.random() * 1000);
        System.out.println("ES UN BARCO ESPECIAL");
        String aux = leer.next().toUpperCase();
        if (aux.equals("SI")) {
            this.barcoEspecial = true;
        } else {
            this.barcoEspecial = false;
        }
    }

    public void precioAlquiler() {
        int dias = (int) DAYS.between(this.fechaAlquiler, this.fechaDevolucion);
        int precioalquiler = dias * (10 * eslora);

        if (barcoEspecial == false) {
            System.out.println(precioalquiler);
        } else {
            System.out.println("INGRESE QUE TIPO DE BARCO ESPECIAL TIENE");
            String aux = leer.next().toUpperCase();
            switch (aux) {
                case "VELERO":
                    System.out.println("INGRESE EL NUMERO DE MASTILES");
                    int mastiles = leer.nextInt();
                    precioalquiler = precioalquiler + mastiles;
                    System.out.println(precioalquiler);
                    break;
                case "MOTOR":
                    System.out.println("INGRESE POTENCIA EN CV");
                    int CV = leer.nextInt();
                    precioalquiler = precioalquiler + CV;
                    System.out.println(precioalquiler);
                    break;
                case "LUJO":
                    System.out.println("INGRESE NUMERO DE CAMAROTES");
                    int camarotes = leer.nextInt();
                    precioalquiler = precioalquiler + camarotes;
                    System.out.println(precioalquiler);
                    break;
                default:
                    System.out.println("TIPO NO VALIDO");
            }
        }

    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", modelo=" + modelo + ", barcoEspecial=" + barcoEspecial
                + ", nombre=" + nombre + ", DNI=" + DNI + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", amarre=" + amarre + ", tipoBarco=" + tipoBarco + '}';
    }

}
