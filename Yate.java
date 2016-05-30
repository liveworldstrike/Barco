
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    //numero de camarotes que tiene el barco 
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes,int potencia,String matricula,float eslora,int anoFab)
    {
      super(potencia,matricula,eslora,anoFab);
      this.camarotes = camarotes;
    }

    /**
     * devuelve el coeficiente de bernua del barco 
     */
    public int getCoeficienteBernua(){
        return super.getCoeficienteBernua()+camarotes; 
    }
    
    public String toString()
    {
        String data = super.toString();
        data += "Númeo de camarotes: " + camarotes + "\n";
        return data;
    }
}
