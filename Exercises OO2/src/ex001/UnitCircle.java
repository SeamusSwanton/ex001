package ex001;

public class UnitCircle implements Comparable {

	Integer radius = 0;
	
	public UnitCircle(int radius) {
		this.radius = radius;
	}

	public int compareTo(Object o) {

		
		if(radius.equals(o)) {
		return 0;  
		}
		else if (radiuso) { 
		return 1;  
		}
		else {  
		return -1;
		}
	}
	
	
}
