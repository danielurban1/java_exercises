package species;

public class Chromosomes {
	int armLenght;
	int nrChomosome;
	boolean rel;
	
	Chromosomes(int armLenght, int nrChomosome){
		if (armLenght > 0) {
			this.armLenght = armLenght;
		}
		if (nrChomosome > 0) {
			this.nrChomosome = nrChomosome;
		}
	}
	Chromosomes(int armLenght, int nrChomosome, boolean rel){
		this(armLenght, nrChomosome);
		this.rel = rel;
	}
}
