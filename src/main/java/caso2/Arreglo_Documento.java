package caso2;

import java.util.ArrayList;

public class Arreglo_Documento {

    private ArrayList<Documento> lista;

    public Arreglo_Documento() {
        lista = new ArrayList();
        lista.add(new Boleta("06-09-20", 300, "Diaz"));
        lista.add(new Boleta("07-09-20", 200, "Avila"));
        lista.add(new Factura("08-09-20", 150, "11111"));
        lista.add(new Boleta("09-09-20", 320, "Bernuy"));
        lista.add(new Factura("10-09-20", 450, "2222"));
    }

    public void adi_Factura(Factura fac) {
        lista.add(fac);
    }

    public void adi_Boleta(Boleta bol) {
        lista.add(bol);
    }

    public ArrayList<Documento> listado() {
        return lista;
    }

    // Buscar un documento pero por su numero
    public Documento busca(int nro) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getNrodoc() == nro) {

                return lista.get(i);

            }

        }

        return null;
    }

    public void borra(Documento doc) {

        lista.remove(doc);
    }

}
