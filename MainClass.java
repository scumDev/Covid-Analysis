package corona;

public class MainClass {
public static void main(String[] args) {
	String[] arr1 = {"Texas", "California", "Florida", "Illinois", "New York", "Georgia",
			"Ohio", "Michigan", "Pennsylvania", "Wisconsin"};
	int[] arr2 = {1342779, 1340716, 1049638, 787573, 734600, 499371, 467432, 426576, 423828, 409386};
	CovidUpdates test1 = new CovidUpdates();
	test1.createDataBase(arr1, arr2);
	
	System.out.println(test1.mostAffected());
	test1.updateDailyCases("California", 10000);
	test1.updateInfo();
	System.out.println(test1.mostAffected());
	test1.updateInfo();
	}
}
	

