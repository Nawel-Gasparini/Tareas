package Logica;

public class Sucursal {
    private String nombre;
    private int identificador;
    private String direccion;
    private String telefono;
    private long rut;
    LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>
    LinkedList<EmpJornalero> listaEmpleadosJornaleros = new LinkedList<EmpJornalero>
    LinkedList<EmpMensual> listaEmpleadosMensuales = new LinkedList<EmpMensual>
    
    this.nombre = "";
	this.identificador = 0;
	this.direccion = "";
	this.telefono = "";
	this.rut = 0;
    
    
    
    public void setnombre() {
	   this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setidentificador() {
	   this.identificador = identificador;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setdireccion() {
	   this.direccion = direccion;
    }
    public String getdireccion(){
        return direccion;
    }
    public void settelefono() {
	   this.telefono = telefono;
    }
    public String gettelefono(){
        return telefono;
    }
    public void setrut() {
	   this.rut = rut;
    }
    public long getrut(){
        return rut;
    }
}
