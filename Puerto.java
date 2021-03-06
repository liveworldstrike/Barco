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

    /**
     * imprimer el estado de los amarres del Puerto 
     */
    public void verEstadoAmarres() {
        for(int cont= 0;cont<NUMERO_AMARRES; cont++) {
            int contador = 0;
            boolean coincide = false;
            while(!coincide && contador<alquileres.size()) {
                if(alquileres.get(contador)!=null) {
                    if(alquileres.get(contador).getAmarre()==cont) {
                        System.out.println("Amarre " + cont + " está ocupado con precio " + alquileres.get(contador).getCosteAlquiler());
                        coincide = true;
                    }
                }
                contador++;
            }
            if(!coincide) {
                System.out.println("Amarre " + cont + " no está ocupado");
            }
        }
    }

    /**
     * liquida un alquiler de un barco
     */
    public float liquidarAlquiler(int posicion){       
        int cont = 0;
        float valor = -1;
        boolean coincide = false;
        while(cont < alquileres.size() && !coincide){
            if (alquileres.get(cont).getAmarre() == posicion){
                valor = alquileres.get(cont).getCosteAlquiler();
                alquileres.remove(cont);
                coincide = true;
            }
            cont++;
        }
        return valor;
    }

}