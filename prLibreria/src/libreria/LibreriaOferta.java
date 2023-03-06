package libreria;

import java.util.ArrayList;

public class LibreriaOferta extends Libreria{
    public String [] autores;
    public double descuento;
    public LibreriaOferta(double descuento, String[] autores){
        super();
        this.descuento = descuento;
        this.autores = autores;
    }

    public void setOferta(double descuento, String[] autores){
        this.descuento = descuento;
        this.autores = autores;
    }

    public String[] getOferta(){
        return this.autores;
    }

    public double getDescuento(){
        return this.descuento;
    }

    @Override
    public void addLibro(String autor, String titulo, double precioBase){
        boolean encontrado = false;
        for(int i = 0; i < autores.length && !encontrado; i++){
            if(autor.equals(autores[i])){
                LibroOferta l = new LibroOferta(autor, titulo, precioBase, this.descuento);
                anyadirLibro(l);
                encontrado = true;
            }else{
                Libro l = new Libro(autor, titulo, precioBase);
                anyadirLibro(l);
            }
        }
    }
}
