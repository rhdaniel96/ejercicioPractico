package model;

public final class Verdura extends Alimento {
    public boolean esOrganica;
    public String contenidoNutricional;


    //CONSTRUCTORES

    public Verdura(int idAlimento, String nombreProducto, int precioUnitario,
                   int stockDisponible, boolean esOrganica, String contenidoNutricional) {
        super(idAlimento, nombreProducto, precioUnitario, stockDisponible);
        this.esOrganica = esOrganica;
        this.contenidoNutricional = contenidoNutricional;
    }

    // GETTER'S & SETTER'S


    public boolean isEsOrganica() {
        return esOrganica;
    }

    public void setEsOrganica(boolean esOrganica) {
        this.esOrganica = esOrganica;
    }

    public String getContenidoNutricional() {
        return contenidoNutricional;
    }

    public void setContenidoNutricional(String contenidoNutricional) {
        this.contenidoNutricional = contenidoNutricional;
    }

    // TO STRING


    @Override
    public String toString() {
        return "Verdura{" +
                "esOrganica=" + esOrganica +
                ", contenidoNutricional='" + contenidoNutricional + '\'' +
                ", idAlimento=" + idAlimento +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stockDisponible=" + stockDisponible +
                '}';
    }
}
