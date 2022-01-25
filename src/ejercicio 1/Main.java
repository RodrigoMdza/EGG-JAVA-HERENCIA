/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package guia5javaej1;

public class Main {

    public static void main(String[] args) {
        Animal perro = new Perro("Toby", "carnivoro", 7, "chihuahua");
        perro.Alimentarse();
        Gato gato = new Gato("Tiru", "balanceado", 4, "calleja");
        gato.Alimentarse();
        Animal caballo = new Caballo("Fury", "heno", 3, "puro");
        caballo.Alimentarse();
    }

}
