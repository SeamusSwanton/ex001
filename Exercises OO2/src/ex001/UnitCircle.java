package ex001;

public class UnitCircle implements Comparable {

	int radius = 0;
	
	public UnitCircle(int radius) {
		this.radius = radius;
	}

	public int compareTo(Object o) {
		return radius;
	}
	
	
}
