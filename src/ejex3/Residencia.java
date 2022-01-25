package guiajavaejex3;

import java.util.Scanner;

public class Residencia extends Alojamientos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private boolean privado;
    private Integer metros;
    private int habitaciones;
    private boolean descuento;

    public Residencia() {
    }

    public Residencia(boolean privado, Integer metros, int habitaciones, boolean descuento, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
        this.habitaciones = habitaciones;
        this.descuento = descuento;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Residencia{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente="
                + ", privado=" + privado + ", metros=" + metros + ", habitaciones=" + habitaciones + ", descuento=" + descuento + '}';
    }

    @Override
    public void precioFinal() {
        System.out.println("NO DISPONIBLE");
    }

    public void crearResidencia() {
        super.crearAlojamiento();
        this.privado = false;
        this.metros = (int) (Math.random() * 100);
        this.habitaciones = (int) (Math.random() * 10);
        System.out.println("TIENE DESCUENTO");
        String aux = leer.next().toUpperCase();
        if (aux.equals("SI")) {
            this.descuento = true;
        } else {
            this.descuento = false;
        }
    }
}
