package MAIN;

public final class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Lavadora lavadora = new Lavadora();
        super.crearElectrodomestico();
        System.out.println("INGRESE LA CARGA");
        this.carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio = this.precio + 500;
        }
    }

    @Override
    public String toString() {
        super.toString();
        return "Lavadora{" + "carga=" + carga + '}';
    }
}
