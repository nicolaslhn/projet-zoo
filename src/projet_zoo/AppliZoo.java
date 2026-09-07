package projet_zoo;

import java.util.ArrayList;

class AppliZoo {
	public static void main(String[] args) {
		ArrayList<Animal> liste_animaux = new ArrayList<Animal>();
		Pingouin p1 = new Pingouin();
		Lion l1 = new Lion();
		Singes s1 = new Singes();
		liste_animaux.add(p1);
		liste_animaux.add(l1);
		liste_animaux.add(s1);
		p1.crier();
		l1.crier();
		s1.crier();
		p1.manger();
		l1.manger();
		s1.manger();
		p1.nager();
	}
}
