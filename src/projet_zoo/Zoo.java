package projet_zoo;

import java.util.ArrayList;

public class Zoo {
	
	ArrayList<Animal> animaux = new ArrayList<Animal>();
	
	public static void Zoo(String[] args) {
		
	}
	
	public void ajouterAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void faireCrier() {
		for(Animal animal : animaux) {
			animal.crier();
		}
	}
	
	public void faireManger() {
		for(Animal animal : animaux) {
			animal.manger();
		}
	}
	
	public void faireNager() {
		for(Animal animal : animaux) {
			if(animal instanceof Nageur) {
				((Nageur)animal).nager();
			}
		}
	}
}
