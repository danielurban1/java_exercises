package j58;

public class Values {
	char charArg = 0;
	double doubleArg = 0;
	Values(char charArg, 	double doubleArg){
		this.charArg = charArg;
		this.doubleArg = doubleArg;
	}

	Values(double doubleArg){
		this.charArg = 0;
		this.doubleArg = doubleArg;
	}
	Values(char charArg){
		this.charArg = charArg;
		this.doubleArg = 0;
	}
	Values(double doubleArg, char charArg){
		this(charArg, doubleArg);		
	}
}
