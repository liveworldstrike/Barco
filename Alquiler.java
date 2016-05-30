
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // numero de dias que permace el barco
    private int numeroDias;
    //cliente
    private Cliente cliente;
    //barco
    private Barco barco;
    //valor del alquiler
    private static int VALOR_FIJO_ALQUILER = 300;
    //valor del multiplicador de eslora 
    private static int MULTIPLICADOR_ESLORA = 10;

     /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco)
    {
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }

    /**
     * Devuelve el precio del alquiler.
     */
    public float getCosteAlquiler()
    {
        return numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA) + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }
    
    /**
     * Devuelve los datos del VELERO
     */
    public String toString(){
        return "Numero de dias: " + numeroDias + 
               "\nCliente: " + cliente.toString() + 
               "\nBarco: " + barco.toString();
    }
}
