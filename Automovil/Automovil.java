
/**
 * Write a description of class Automovil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Automovil
{
    // instance variables - replace the example below with your own
    private String patente;
    private String marca;
    private String modelo;
    private int kilometraje;

    /**
     * Constructor for objects of class Automovil
     */
    public Automovil()
    {
        this.patente="";
        this.marca="";
        this.modelo="";
        this.kilometraje=0;
    }
    
    public Automovil(String patente, String marca, String modelo, int kilometraje)
    {
        this.patente=patente;
        this.marca=marca;
        this.modelo=modelo;
        this.kilometraje=kilometraje;
    }

   public String getPatente()
   {
       return this.patente;
    }
    
    public void setPatente()
    {
    this.patente=patente;
    }
    
    public String getMarca()
   {
       return this.marca;
    }
    
    public void setMarca()
    {
    this.marca=marca;
    }
    
    public String getModelo()
   {
       return this.modelo;
    }
    
    public void setModelo()
    {
    this.modelo=modelo;
    }
    
    public int getKilometraje()
   {
       return this.kilometraje;
    }
    
    public void setKilometraje()
    {
    this.kilometraje=kilometraje;
    }
    
    public void Andar (int distancia)
    {
    if(distancia > 0)
    {
    this.kilometraje=this.kilometraje+distancia;
    }
    }
}
