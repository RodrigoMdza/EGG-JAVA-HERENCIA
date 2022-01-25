
import java.util.Scanner;

public final class EdificioDeOficinas extends Edificio {

    private Integer oficinal;
    private Integer pisos;
    private Integer cantidadPersonasPorOficina;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer oficinal, Integer pisos, Integer cantidadPersonasPorOficina, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.oficinal = oficinal;
        this.pisos = pisos;
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
    }

    public Integer getOficinal() {
        return oficinal;
    }

    public void setOficinal(Integer oficinal) {
        this.oficinal = oficinal;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getCantidadPersonasPorOficina() {
        return cantidadPersonasPorOficina;
    }

    public void setCantidadPersonasPorOficina(Integer cantidadPersonasPorOficina) {
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "oficinal=" + oficinal + ", pisos=" + pisos + ", cantidadPersonasPorOficina=" + cantidadPersonasPorOficina +
                 "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    public void crearEdificio() {
        System.out.println("INGRESE EL NUMERO DE OFICINAS POR PISO");
        this.oficinal = leer.nextInt();
        System.out.println("INGRESE EL NUMERO DE PISOS");
        this.pisos = leer.nextInt();
        System.out.println("INGRESE LA CAPACIDAD DE LA OFICINA");
        this.cantidadPersonasPorOficina = leer.nextInt();
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

    public void cantPersonasTotales() {
        Integer personPiso;
        Integer personTotal;
        personPiso = this.cantidadPersonasPorOficina * this.oficinal;
        System.out.println("PERSONAS POR PISO " + personPiso);
        personTotal = this.cantidadPersonasPorOficina * this.oficinal * this.pisos;
        System.out.println("PERSONAS EN EL EDIFICIO " + personTotal);
    }
}
