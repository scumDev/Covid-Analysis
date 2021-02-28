package corona;
import java.util.*;
import java.util.Scanner;

public class Covid {
	 String country;
	 int positiveCases;
	
	public Covid(String country, int positiveCases) {
		this.country=country;
		this.positiveCases=positiveCases;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getPositiveCases() {
		return positiveCases;
	}
	
	public void updatePositiveCases(int newCases) {
		positiveCases+=newCases;
	}

}
