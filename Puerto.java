/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    //array del alquiler
    private Alquiler[] alquileres;
    //numero maximo de amarres 
    private static final int NUMERO_AMARRES = 4;
     /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     *añadimos uno al array 
     *sino un -1
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int cont = 0;
        int posicion = -1;
        while(cont < NUMERO_AMARRES && posicion == -1){
            if(alquileres[cont]== null){
                posicion = cont;
                alquileres[cont] = new Alquiler(numeroDias, cliente, barco);
            }
            cont++;
        }
        return posicion;
    }
    
    /**
     * imprimer el estado de los amarres del Puerto 
     */
    public void verEstadoAmarres(){
        for(int cont = 0; cont < NUMERO_AMARRES;cont++){
            if(alquileres[cont] == null)
                System.out.println("Amarre " + (cont+1) + " ¡no esta ocupado");
            else{
                System.out.println("Amarre " + (cont+1) 
                + " esta ocupado, su alquiler es de " + alquileres[cont].getCosteAlquiler()+ "euros");
            }
        }
    }
    
    /**
     * devuelve el alquiler con su coste 
     */
    public float liquidarAlquiler(int posicion){
        float liquidacion = alquileres[posicion].getCosteAlquiler();
        alquileres[posicion] = null;
        return liquidacion;
    }
}