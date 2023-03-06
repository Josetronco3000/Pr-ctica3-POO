package libreria;

public class LibroOferta extends Libro{
    private double porcDescuento;
    public LibroOferta(String nombre_autor, String titulo, double precioBase, double desc) {
        super(nombre_autor, titulo, precioBase);
        this.porcDescuento = desc;
    }

    public double getDescuento(){
        return porcDescuento;
    }
    @Override
    protected double getBaseImponible(){
        return super.getBaseImponible() - super.getBaseImponible() * porcDescuento / 100;
    }

    @Override
    public String toString(){
        return ("("+super.getAutor()+"; "+super.getTitulo()+"; "+super.getPrecioBase()+"; "+porcDescuento+"; "+ getBaseImponible()+"; "+super.getIVA()+"; "+super.getPrecioFinal()+")"+"/n");
    }
}
