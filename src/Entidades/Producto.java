package Entidades;


public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private Categoria caracteristica;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, Categoria caracteristica, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.caracteristica = caracteristica;
        this.stock = stock;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getRubro() {
        return caracteristica;
    }

    public void setRubro(Categoria caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto t) {
        //0-->iguales
        //1-->mayor
        //-1-->menor
        if(this.codigo==t.codigo){
            
            return 0;
            
        }else if(this.codigo >t.codigo){
        
            return 1;
        }else {
        
            return -1;
        }
    }

   public String toString(){
   
       return codigo+" "+descripcion;
   }
    
    
}

