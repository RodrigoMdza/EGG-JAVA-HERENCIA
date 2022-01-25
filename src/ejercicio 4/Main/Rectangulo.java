package Main;

public class Rectangulo implements calculosFormas {

    private double base = 10;
    private double altura = 10;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = base * altura;
        System.out.println("El area del rectangulo es " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }

}
