package MAIN;

public class Televisor extends Electrodomestico{
    private Integer resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(Integer resolucion, boolean TDT, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTV(){
        super.crearElectrodomestico();
        System.out.println("INGRESE LA RESOLUCION");
        this.resolucion= leer.nextInt();
        System.out.println("TIENE TDT?");
        String aux = leer.next();
        if (aux.toUpperCase().equals("SI")) {
            this.TDT= true;
        }else{
            this.TDT= false;
        }
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (resolucion>30) {
            this.precio = this.precio + this.precio * (30/100);
        }
        if (TDT==true) {
            this.precio = this.precio + 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso +'}';
    }
    
    
}
