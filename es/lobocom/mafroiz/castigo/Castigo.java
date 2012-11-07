package es.lobocom.mafroiz.castigo;

public class Castigo {
	final static String CADENADECASTIGO="Los mensajes los mando a todo el grupo sin excluir a nadie...";
	final static int VECESAESCRIBIR=100;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<VECESAESCRIBIR;i++){
			escribirCadena();
		}
	}
	
	private static void escribirCadena() {
		System.out.println(CADENADECASTIGO);
	}

}