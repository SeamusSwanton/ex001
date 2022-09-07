package ex001;

public class UnitCircle implements Comparable {

	int radius = 0;
	
	public UnitCircle(int radius) {
		this.radius = radius;
	}

	public int compareTo(Object o) {
		int x = (int) o;
		if (x == radius) {
			return 0;
		}
		else if (x > radius) {
			return 1;
		}
		else {
			return -1;
		}
	}

	
	
}
