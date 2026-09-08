package projet_zoo;

import java.util.ArrayList;

class AppliZoo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Pingouin p1 = new Pingouin();
		Lion l1 = new Lion();
		Singes s1 = new Singes();
		zoo.ajouterAnimal(p1);
		zoo.ajouterAnimal(l1);
		zoo.ajouterAnimal(s1);
		zoo.faireCrier();
		zoo.faireNager();
		zoo.faireManger();
	}
}
