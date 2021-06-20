package src.tablero;
import java.util.*;


public class Tablero{

    private int nColumnas =8;
    private int nFilas=8;
    private String[][] tablero = new String[nFilas][nColumnas];
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";
    private boolean pintada;
    Scanner sc = new Scanner(System.in);
    public Tablero(){
       
    }


    //agregar usuarios


    public void pintarTablero(){

    System.out.println(" 0   1   2  3  4  5  6  7 ");
   
    
    for (int i=0;i<nFilas;i++ ) {

        for (int j=0; j<nColumnas ;j++ ) {

            int columnaPar = j%2;
            int filaPar = i%2;

            
            //fila par y columna par es blanco
            if (filaPar==0 && columnaPar==0  ) {

                

                tablero[i][j]=ANSI_WHITE_BACKGROUND+"▒▒▒"+ANSI_RESET;
                pintada = true;

                
            }

            //fila impar y columna par es negro
            if (filaPar!=0 && columnaPar==0) {

                tablero[i][j]="   ";
                pintada = false;

                
            }

            //fila par  y columnar impar
            if (filaPar==0 && columnaPar!=0) {

                   tablero[i][j]="   ";
                   pintada = false;
                
            }

            if (filaPar!=0 && columnaPar!=0) {

                tablero[i][j]=ANSI_WHITE_BACKGROUND+"▒▒▒"+ANSI_RESET;
                pintada = true; 
                
            }
            
        }
       
    }



    for (int i=0;i<nFilas ;i++ ) {


         System.out.print(i);
        for (int j =0;j<nColumnas ;j++ ) {

    
           
            System.out.print(tablero[i][j]);

            
        }
        System.out.println(""); 
        
    }

    
       
    }
 
}
