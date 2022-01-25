/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
13
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
 */
package Main;

public class Main {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.area();
        c1.perimetro();
        Rectangulo r1 = new Rectangulo();
        r1.area();
        r1.perimetro();
    }

}
