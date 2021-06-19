package src.usuarios;

import java.util.Scanner;
import src.logica.Principal;


public class VectorUsuarios {

    private Usuarios[] usuario = new Usuarios[9];
    private int contadorUsuarios;
    Scanner Scanner = new Scanner(System.in);

    public VectorUsuarios(){

        contadorUsuarios = 0;
       
    }


    //agregar usuarios


    public void agregarUsuario(String nombre){
        if (contadorUsuarios > 10){
            System.out.println("Límite de usuarios alcanzados");
        }
        else{
            usuario[(contadorUsuarios)] = new Usuarios(nombre);
             contadorUsuarios++;
        }
       
    }




    public void agregarUsuario(){
        System.out.print("Ingrese el nombre del  usuario: ");
        String nombre = Scanner.nextLine();
        agregarUsuario(nombre);
    }



    // fin agregar usuarios

    public void mostrarUsuariosRegistrados(){
        
        for (int i = 0; i < (contadorUsuarios); i++) {
            System.out.println(usuario[i].getInformacion());
           
        }

        System.out.println("\n\n");
    }


    public int getContadorUsuarios(){

        return contadorUsuarios;

    }

    
}
