package MAIN;

import java.util.Scanner;

public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumo(consumoEnergetico);
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumo(consumoEnergetico);
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    private char comprobarConsumo(char consum) {
        if (consum == "A".charAt(0)) {
            this.consumoEnergetico = consum;
        } else if (consum == "B".charAt(0)) {
            this.consumoEnergetico = consum;
        } else if (consum == "C".charAt(0)) {
            this.consumoEnergetico = consum;
        } else if (consum == "D".charAt(0)) {
            this.consumoEnergetico = consum;
        } else if (consum == "E".charAt(0)) {
            this.consumoEnergetico = consum;
        } else if (consum == "F".charAt(0)) {
            this.consumoEnergetico = consum;
        } else {
            this.consumoEnergetico = "F".charAt(0);

        }
        return this.consumoEnergetico;
    }

    private String comprobarColor(String col) {
        switch (col) {
            case "blanco":
                this.color = col;
                break;
            case "negro":
                this.color = col;
                break;
            case "rojo":
                this.color = col;
                break;
            case "azul":
                this.color = col;
                break;
            case "gris":
                this.color = col;
                break;
            default:
                this.color = "blanco";
        }
        return this.color;
    }

    public void crearElectrodomestico() {
        Electrodomestico electrodomestico = new Electrodomestico();
        this.precio = 1000;
        System.out.println("INGRESE EL COLOR");
        comprobarColor(leer.next());
        electrodomestico.setColor(color);
        System.out.println("INGRESE EL CONSUMO ENERGETICO");
        comprobarConsumo(leer.next().charAt(0));
        electrodomestico.setConsumoEnergetico(consumoEnergetico);
        System.out.println("INGRESE EL PESO");
        this.peso = leer.nextInt();
    }

    public void precioFinal() {
        if (this.peso < 19) {
            this.precio = this.precio + 100;
        } else if (this.peso >= 20 && this.peso < 49) {
            this.precio = this.precio + 500;
        } else if (this.peso >= 50 && this.peso < 79) {
            this.precio = this.precio + 800;
        } else if (this.peso > 80) {
            this.precio = this.precio + 1000;
        }
        if (this.consumoEnergetico == "A".charAt(0)) {
            this.precio = this.precio + 1000;
        } else if (this.consumoEnergetico == "B".charAt(0)) {
            this.precio = this.precio + 800;
        } else if (this.consumoEnergetico == "C".charAt(0)) {
            this.precio = this.precio + 600;
        } else if (this.consumoEnergetico == "D".charAt(0)) {
            this.precio = this.precio + 500;
        } else if (this.consumoEnergetico == "E".charAt(0)) {
            this.precio = this.precio + 300;
        } else if (this.consumoEnergetico == "F".charAt(0)) {
            this.precio = this.precio + 100;
        }
    }

}
