
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
        return numeroDias *(barco.getEslora() * MULTIPLICADOR_ESLORA) + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }
    
    /**
     * Return all the data
     */
    @Override
    public String toString()
    {
        String data = "- Cliente: \n";
        data += cliente;
        data += "- Barco: \n";
        data += barco;
        data += "Número de dias: " + numeroDias + "\n";
        data += "Coste del alquiler: " + getCosteAlquiler() + "\n";
        return data;
    }
}
