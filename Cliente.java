
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    //nombre del cliente 
    private String nombre;
    //dni del cliente 
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre,String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     *devuelve el dni del cliente 
     */
    public String getDni()
    {
        return dni;
    }

    /**
     * devuelve el nombre del cliente
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * imprime los datos por pantalla del cliente
     */
    public String toString(){
        return "nombre del cliente: "+ nombre + " con dni: "+dni;
    }
}
