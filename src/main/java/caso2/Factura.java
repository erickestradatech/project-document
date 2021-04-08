package caso2;

public class Factura extends Documento {

    private String ruc;

    public Factura(String fecha, double importe, String ruc) {
        super(fecha, importe);
        this.ruc = ruc;
    }

    public double igv() {
        return super.getImporte() * 0.18;
    }

    public double total() {
        return super.getImporte() + igv();
    }

    @Override
    public String toString() {
        return "ruc :" + ruc + "\n impuesto:" + igv() + "\n Total:" + total();
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

}
