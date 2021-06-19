package src.logica;


public class PiedraPapelTijera{

	private int numeroAleatorio1;
	private int numeroAleatorio2;
	private String resultado;
	private int accion;


	public PiedraPapelTijera(){

	}


	public void generarnumero1(){

		numeroAleatorio1 = (int) (Math.random() * 3) + 1;
	}

		public void generarnumero2(){

		numeroAleatorio2 = (int) (Math.random() * 3) + 1;
	}

	public void logica(){

		//Papel =1
		//Tijera =2
		//Piedra = 3
		//accion == que paso
		//0 empate
		//1 gano el jugador 1
		//2 gano el jugador 2


		// Empate

		if (numeroAleatorio1==1 && numeroAleatorio2==1) {

			resultado = "Empate";
			accion = 0;

			
		}

		// Empate

		if (numeroAleatorio1==2 && numeroAleatorio2==2) {

			resultado = "Empate";
			accion = 0;

			
		}

		// Empate

		if (numeroAleatorio1==3 && numeroAleatorio2==3) {

			resultado = "Empate";
			accion = 0;

		
		// jugador 1 papel jugador 2 tijera

		}

		if (numeroAleatorio1==1 && numeroAleatorio2==2) {

			resultado = "Gana jugador 2";
			accion =2;
			
		}

		// jugador 1 papel jugador 2 piedra

		if (numeroAleatorio1==1 && numeroAleatorio2==3) {

			resultado = "Gana jugador 1";
			accion = 1;
			
		}


		// jugador 2 papel jugador 1 tijera

		if (numeroAleatorio2==1 && numeroAleatorio1==2) {

			resultado = "Gana jugador 1";
			accion =1;
			
		}

		// jugador 1 papel jugador 2 piedra

		if (numeroAleatorio2==1 && numeroAleatorio1==3) {

			resultado = "Gana jugador 2";
			accion = 2;
			
		}


		public int getResultador(){
			return accion;
		}
		

	}





}