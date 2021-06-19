package src.usuarios;


public class Usuarios{


    private String nombre;
    private int ganadas;
    private int perdidas;

    public Usuarios(String nombre){
      
        this.nombre = nombre;
      
    }


    //getters y setters

   
    public String getNombre(){
        return nombre;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

     public int getGanadas(){
        return ganadas;
    }

     public int getPerdidas(){
        return perdidas;
    }

    //fin getters y setters

    public String getInformacion(){
        String resultado = "Nombre del usuario: " + nombre + " Partidas ganadas: " + ganadas + " Partidas perdidas: " + perdidas;
        return resultado;
    }
    
}