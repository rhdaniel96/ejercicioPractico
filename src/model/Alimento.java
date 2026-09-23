package model;

public abstract class Alimento {
    public int idAlimento;
    public String nombreProducto;
    public int precioUnitario;
    public int stockDisponible;

    // CONSTRUCTORES
    //-------------------

    public Alimento(int idAlimento, String nombreProducto, int precioUnitario, int stockDisponible) {
        this.idAlimento = idAlimento;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.stockDisponible = stockDisponible;

    }

    // GETTERS AND SETTERS
    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Alimento{" +
                "idAlimento=" + idAlimento +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stockDisponible=" + stockDisponible +
                '}';
    }
}
