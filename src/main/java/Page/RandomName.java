package Page;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.Random;



public class RandomName {
	
	public int generateRandomNo(int boundNo) {
	    Random rnd = new Random();
	    int generateNo = rnd.nextInt(boundNo);
	    return generateNo;
	    
	    
	    
	    
	
	}
	
	
	
}



