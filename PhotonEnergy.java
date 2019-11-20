package marjo;

import java.util.Scanner;

public class PhotonEnergy {

	// calcul l'énergie d'un photon à partir de sa longueur d'onde
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float H = (float) (6.62607*Math.pow(10,-34)); // constante de Planck
		float q = (float) (1.602*Math.pow(10, -19)); // charge d'un électron
		float c = (float) (299792458); // vitesse de la lumière
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la longueur d'onde (en nanomètres)");
		float lambda = (float) (sc.nextFloat());
		float energyJ = (float) (H*c/(lambda*Math.pow(10,-9)));
		float energyEV = (float) (1240/(lambda));
		System.out.println ("Lambda = "+ lambda + "  nm");
		System.out.println("E = "+ energyJ+ " J");
		System.out.println("E = "+ energyEV+ " eV");
		System.out.println("E = H*C/Lambda (J) and 1240/Lambda (eV)");
	}

}
// ajout d'un commentaire pour l'exercice gitHub
