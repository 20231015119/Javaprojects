package circulo;

/**
 *
 * @author david
 */
public class Circulo {

    double pi = 3.14;
    double radio;

    public Circulo(double diametro) {
        this.radio = diametro / 2;
    }

    public double area() {
        return pi * radio * radio;
    }

    public double perimetro() {
        return pi * 2 * radio;
    }

    public static void main(String[] args) {
        Circulo pizzaMediana = new Circulo(12);
        System.out.println("Area media pizza: " + pizzaMediana.area());
        System.out.println("Perimetro media pizza: " + pizzaMediana.perimetro());
    }
}
