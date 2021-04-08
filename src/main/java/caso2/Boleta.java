package caso2;

public class Boleta extends Documento {

    private String nomcli;

    public Boleta(String fecha, double importe, String cli) {
        super(fecha, importe);
        this.nomcli = cli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

}
