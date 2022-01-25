package guiajavaejex3;

import java.util.Scanner;

public class Hoteles5 extends Alojamientos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Integer habitaciones;
    private Integer camas;
    private Integer pisos;
    private Integer gimnasio;
    private String nombreRestaurant;
    private Integer capacidadRestaurant;
    private Integer conferencias;
    private Integer suites;
    private Integer limusinas;
    private Integer precioHabitacion;

    public Hoteles5() {
    }

    public Hoteles5(Integer habitaciones, Integer camas, Integer pisos, Integer gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer conferencias, Integer suites, Integer limusinas, Integer precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.conferencias = conferencias;
        this.suites = suites;
        this.limusinas = limusinas;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Integer gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Integer getConferencias() {
        return conferencias;
    }

    public void setConferencias(Integer conferencias) {
        this.conferencias = conferencias;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimusinas() {
        return limusinas;
    }

    public void setLimusinas(Integer limusinas) {
        this.limusinas = limusinas;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public void crearHotal5() {
        super.crearAlojamiento();
        this.habitaciones = (int) (Math.random() * 100);
        this.camas = (int) (Math.random() * 1000);
        this.pisos = (int) (Math.random() * 30);
        System.out.println("INGRESE LA CATEGORIA DEL GIMNASIO");
        int aux = leer.nextInt();
        if (aux == 1) {
            this.gimnasio = 1;
        } else {
            this.gimnasio = 2;
        }
        this.nombreRestaurant = "Paraiso " + localidad;
        this.capacidadRestaurant = (int) (Math.random() * 100);
        this.conferencias = 2;
        this.suites = (int) (Math.random() * 10);
        this.limusinas = (int) (Math.random() * 5);
        this.precioHabitacion = 50 + camas;
    }

    @Override
    public void precioFinal() {
        if (capacidadRestaurant < 30) {
            this.precioHabitacion = this.precioHabitacion + 10;
        } else if (capacidadRestaurant > 30 && capacidadRestaurant < 50) {
            this.precioHabitacion = this.precioHabitacion + 30;
        } else if (capacidadRestaurant > 50) {
            this.precioHabitacion = this.precioHabitacion + 50;
        }

        if (this.gimnasio == 1) {
            this.precioHabitacion = this.precioHabitacion + 50;
        } else {
            this.precioHabitacion = this.precioHabitacion + 30;
        }

        if (limusinas > 0) {
            this.precioHabitacion = this.precioHabitacion + (15 * limusinas);
        }
    }

    @Override
    public String toString() {
        return "Hoteles5{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente="
                + ", habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", gimnasio=" + gimnasio + ", nombreRestaurant=" + nombreRestaurant + ", capacidadRestaurant=" + capacidadRestaurant + ", conferencias=" + conferencias + ", suites=" + suites + ", limusinas=" + limusinas + ", precioHabitacion=" + precioHabitacion + '}';
    }

}
