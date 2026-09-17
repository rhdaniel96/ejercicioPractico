package model;

public final class Fruta extends Alimento{
    public String paisOrigen;
    public String temporadaCultivo;

    // CONSTRUCTOR
    public Fruta(int idAlimento, String nombreProducto, int precioUnitario,
                 int stockDisponible, String paisOrigen, String temporadaCultivo) {
        super(idAlimento, nombreProducto, precioUnitario, stockDisponible);
        this.paisOrigen = paisOrigen;
        this.temporadaCultivo = temporadaCultivo;
    }

    // GETTER'S & SETTER'S


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTemporadaCultivo() {
        return temporadaCultivo;
    }

    public void setTemporadaCultivo(String temporadaCultivo) {
        this.temporadaCultivo = temporadaCultivo;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", temporadaCultivo='" + temporadaCultivo + '\'' +
                ", idAlimento=" + idAlimento +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stockDisponible=" + stockDisponible +
                '}';
    }
}
