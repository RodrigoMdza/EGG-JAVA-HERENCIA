package Main;

public class Circulo implements calculosFormas {

    private double radio = 10;
    private double diametro = 10;

    public Circulo() {
    }

    public Circulo(double radio, double perimetro) {
        this.radio = radio;
        this.diametro = perimetro;
    }

    @Override
    public void area() {
        double area = PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = PI * diametro;
        System.out.println("El perimetro del circulo es " + perimetro);
    }

}
