package caso2;

public class Documento {

    private int nrodoc;
    private String fecha;
    private double importe;
    static int cuenta = 1001;

    public Documento(String fecha, double importe) {
        this.nrodoc = cuenta++;
        this.fecha = fecha;
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "# documento :" + nrodoc + "\n fecha:" + fecha + "\n importe:" + importe;
    }

    public int getNrodoc() {
        return nrodoc;
    }

    public void setNrodoc(int nrodoc) {
        this.nrodoc = nrodoc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}
