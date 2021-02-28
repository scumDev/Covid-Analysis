package corona;
import java.util.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class CovidUpdates {
	ArrayList<Covid> corona=new ArrayList<Covid>();
	public void createDataBase(String countries[], int cases[]) {
		for(int i=0; i<countries.length; i++) {
			Covid obj = new Covid(countries[i], cases[i]);
			corona.add(obj);
		}
	}
	
	public void updateDailyCases(String country, int newCases) {
		for(int i=0; i<corona.size(); i++) {
			if(corona.get(i).getCountry().equals(country)) {
				corona.get(i).updatePositiveCases(newCases);
			}
		}
	}
	
	public String mostAffected() {
		int max = Integer.MIN_VALUE;
		String countryName="";
		for(int i=0; i<corona.size(); i++) {
			if(corona.get(i).getPositiveCases()>max) {
				countryName=corona.get(i).getCountry();
				max=corona.get(i).getPositiveCases();
			}
		}
		return countryName;
	}
	
	public void updateInfo(){
		try {
			FileWriter update = new FileWriter("covidData.txt");
			for(int i=0; i<corona.size(); i++) {
				String x = "Country: " + corona.get(i).getCountry() + " Cases: " + corona.get(i).getPositiveCases();
				update.write(x);
				update.write("\n");
			}
			update.close();
		}catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
