package guiajavaejex3;

import java.util.Scanner;

public class Camping extends Alojamientos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private boolean privado;
    private Integer metros;
    private int carpas;
    private int baños;
    private boolean resto;

    public Camping() {
    }

    public Camping(boolean privado, Integer metros, int carpas, int baños, boolean resto, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
        this.carpas = carpas;
        this.baños = baños;
        this.resto = resto;
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

    public int getCarpas() {
        return carpas;
    }

    public void setCarpas(int carpas) {
        this.carpas = carpas;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "Camping{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente="
                + "privado=" + privado + ", metros=" + metros + ", carpas=" + carpas + ", ba\u00f1os=" + baños + ", resto=" + resto + '}';
    }

    @Override
    public void precioFinal() {
        System.out.println("CONSULTAR POR PROVADO");
    }

    public void crearCamping() {
        super.crearAlojamiento();
        this.privado = false;
        this.metros = (int) (Math.random() * 100);
        this.carpas = (int) (Math.random() * 10);
        this.baños = (int) (Math.random() * 3);
        System.out.println("TIENE RESTO");
        String aux = leer.next().toUpperCase();
        if (aux.equals("SI")) {
            this.resto = true;
        } else {
            this.resto = false;
        }
    }

}
