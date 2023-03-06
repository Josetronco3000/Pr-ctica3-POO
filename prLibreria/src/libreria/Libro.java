package libreria;

public class Libro {
    private static double porcentaje = 10;
    private String nombre_autor;
    private String titulo;
    private double precioBase;

    private double precioFinal;

    public Libro(String nombre_autor, String titulo, double precioBase){
        this.nombre_autor = nombre_autor;
        this.titulo = titulo;
        this.precioBase = precioBase;
    }

    public String getAutor(){
        return this.nombre_autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public double getPrecioBase(){
        return this.precioBase;
    }

    public static double getIVA(){
        return porcentaje;
    }

    public static void setIVA(double newIVA){
        porcentaje = newIVA;
    }

    protected double getBaseImponible(){
        return precioBase;
    }

    public double getPrecioFinal(){
        double precioFinal;
        precioFinal = this.getBaseImponible() + this.getBaseImponible() * (porcentaje/100);
        return precioFinal;
    }

    @Override
    public String toString(){
        return ("(" + this.nombre_autor + "; " + this.titulo + "; " + this.precioBase + "; " + porcentaje + "%" +"; " + getPrecioFinal() + ")");
    }
}
