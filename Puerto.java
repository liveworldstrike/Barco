import java.util.*;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    //array del alquiler
    private ArrayList<Alquiler> alquileres;
    //numero maximo de amarres 
    private static final int NUMERO_AMARRES = 4;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<Alquiler>();
    }

    /**
     *añadimos uno al array 
     *sino un -1
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int cont = 0;
        int posicion = -1;
        Alquiler compAlquiler = new Alquiler(0, null, null, -1);
        ArrayList<Alquiler> ListaAlquileresTemporales = new ArrayList<Alquiler>();
        if(alquileres.size() != NUMERO_AMARRES){
            int posicionBarco = 0;
            while(cont < alquileres.size()){
                compAlquiler = alquileres.get(cont);
                if(compAlquiler.getAmarre() != cont){
                    ListaAlquileresTemporales.add(compAlquiler);
                    alquileres.remove(cont);
                }
                else{
                    cont++;
                    posicionBarco = cont;
                }
            }
            alquileres.add(new Alquiler(numeroDias, cliente, barco, posicionBarco));
            for(Alquiler alquiler: ListaAlquileresTemporales){
                alquileres.add(alquiler);
            }
            posicion = posicionBarco;
        }
        return posicion;
    }

    //     /**
    //      * imprimer el estado de los amarres del Puerto 
    //      */
    //     public void verEstadoAmarres(){
    //         for(int cont = 0; cont < NUMERO_AMARRES;cont++){
    //             if(alquileres[cont] == null)
    //                 System.out.println("Amarre " + (cont) + " no esta ocupado");
    //             else{
    //                 System.out.println("Amarre " + (cont) 
    //                     + " esta ocupado, su alquiler es de " + alquileres[cont].getCosteAlquiler()+ "euros");
    //             }
    //         }
    //     }

    //     /**
    //      * Liberate moorage. Returns -1 if posicion is not valid
    //      */
    //     public float liquidarAlquiler(int posicion)
    //     {
    //         float valor = -1;
    //         if(posicion < NUMERO_AMARRES && posicion >= 0){
    //             if(alquileres[posicion] != null){
    //                 valor = alquileres[posicion].getCosteAlquiler();
    //                 alquileres[posicion] = null;
    //             }
    //         }
    //         return valor;
    //     }

}