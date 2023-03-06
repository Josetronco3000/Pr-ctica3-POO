package test;
import libreria.Libreria;
import libreria.Libro;
public class PruebaLibreria {
    public static void main(String[] args) {
        Libreria lib = new Libreria();
        lib.addLibro("George Orwell", "1984", 6.2);
        lib.addLibro("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.5);
        lib.addLibro("Isaac Asimov", "Fundación e Imperio", 9.40);
        lib.addLibro("Ray Bradbury", "Fahrenheit 451", 7.40);
        lib.addLibro("Isaac Asimov", "La Fundación", 7.30);
        lib.addLibro("Aldous Huxley", "Un Mundo Feliz", 6.50);
        lib.addLibro("William Gibson", "Neuromante", 8.30);
        lib.addLibro("Isaac Asimov", "Segunda Fundación", 8.10);
        lib.addLibro("Isaac Newton", "arithmetica universalis", 7.50);
        lib.addLibro("George Orwell", "1984", 6.20);
        lib.addLibro("Isaac Newton", "Arithmetica Universalis", 10.50);

        System.out.println(lib);

        lib.remLibro("George Orwell", "1984");
        lib.remLibro("Aldous Huxley", "Un Mundo Feliz");
        lib.remLibro("Isaac Newton", "Arithmetica Universalis");

        System.out.println(lib);

        lib.getPrecioFinal("Philip K. Dick","¿Sueñan los androides con ovejas eléctricas?");
        System.out.println("PrecioFinal(Philip K. Dick, ¿Sueñan los androides con ovejas eléctricas?: " + lib.getPrecioFinal("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
        System.out.println("PrecioFinal(isaac asimov, fundación e imperio): " + lib.getPrecioFinal("isaac asimov", "fundación e imperio"));
        System.out.println("PrecioFinal(Ray Bradbury, Fahrenheit 451): " + lib.getPrecioFinal("Ray Bradbury", "Fahrenheit 451"));
        System.out.println("PrecioFinal(Isaac Asimov, La Fundación): "+lib.getPrecioFinal("Isaac Asimov", "La Fundación"));
        System.out.println("PrecioFinal(william gibson, neuromante): "+lib.getPrecioFinal("william gibson", "neuromante"));
        System.out.println("PrecioFinal(Isaac Asimov, Segunda Fundación): "+lib.getPrecioFinal("Isaac Asimov", "Segunda Fundación"));
        System.out.println("PrecioFinal(Isaac Newton, Arithmetica Universalis): "+lib.getPrecioFinal("Isaac Newton", "Arithmetica Universalis"));

    }
}
