package libreria;

public class OfertaPrecio implements OfertaFlex {
    private double porcDescuento;
    private double umbralPrecio;

    public OfertaPrecio(double desc, double umbral){
        porcDescuento = desc;
        umbralPrecio = umbral;
    }
    @Override
    public double getDescuento(Libro l) {
        double res = 0;
        if(l.getPrecioBase() >= umbralPrecio){
            res = porcDescuento;
        }
        return res;
    }

}
