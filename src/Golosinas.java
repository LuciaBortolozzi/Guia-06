public class Golosinas {

    private int codigo;
    private String descripcion;
    private String[] sabores = new String[2];
    private double precioUnitario;

    public Golosinas(int codigo, String descripcion, String[] sabores, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.sabores = sabores;
        this.precioUnitario = precioUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getSabores() {
        return sabores;
    }

    public void setSabores(String[] sabores) {
        this.sabores = sabores;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}