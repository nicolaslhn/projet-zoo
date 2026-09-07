package projet_zoo;

class Pingouin extends Animal implements Nageur{

	@Override
	void manger() {
		// TODO Auto-generated method stub
		System.out.println("Poisson");
	}

	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("GLOUGLOU");
	}
	

	@Override
	public void nager() {
		// TODO Auto-generated method stub
		System.out.println("Je sais nager");
	}
}
