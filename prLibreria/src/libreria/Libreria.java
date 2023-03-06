package libreria;
import libreria.Libro;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private ArrayList<Libro> libs;

    public Libreria(){
        libs = new ArrayList<Libro>();
    }

    public void addLibro(String nombre_autor, String titulo, double precioBase){
        Libro l = new Libro(nombre_autor, titulo, precioBase);
        anyadirLibro(l);
    }

    public void remLibro(String autor, String titulo){
        if(buscarLibro(autor, titulo) != -1){
            libs.remove(buscarLibro(autor, titulo));
        }else{
            throw new RuntimeException("Libro no encontrado ("+autor+", "+titulo+")");
        }
    }

    public double getPrecioFinal(String autor, String titulo){
        if(buscarLibro(autor, titulo) != -1){
            return libs.get(buscarLibro(autor, titulo)).getPrecioFinal();
        }else{
            throw new RuntimeException("Libro no encontrado (" + autor + ", " + titulo + ")");
        }
    }
    protected void anyadirLibro(Libro libro){
        int i = buscarLibro(libro.getAutor(), libro.getTitulo());
        if(i == -1){
            libs.add(libro);
        }else{
            libs.set(i, libro);
        }
    }

    private int buscarLibro(String a, String t){
        int i = 0;
        while(i < libs.size() && !(a.equalsIgnoreCase(libs.get(i).getAutor()) && t.equalsIgnoreCase(libs.get(i).getTitulo()))){
            i++;
        }
        if(i == libs.size()){
            i = -1;
        }
        return i;
    }

    @Override
    public String toString(){
        return libs.toString();
    }
}
