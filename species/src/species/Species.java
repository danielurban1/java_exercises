package species;

public class Species {
	String specie;
	String specieType;
	String specieName;
	int chromosomNumber;
	Chromosomes[] chromosomes;

	Species(String specie, String specieType, String specieName, int chromosomNumber){
		this.specie = specie;
		this.specieType = specieType;
		this.specieName = specieName;
		this.chromosomNumber = chromosomNumber;
		chromosomes = new Chromosomes[chromosomNumber];
	}

	void name(){
		System.out.println(this.specie + " " + this.specieName);
	}
	
	void chromo(){
		System.out.println(this.chromosomNumber);
	}
	
	void info(){
		System.out.println(this.specie + " " + this.specieType + " " + this.specieName + " " + this.chromosomes);
	}
}