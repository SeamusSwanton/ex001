package ex002;

public class Sphere implements GeometricSolid {
	
	double radius = 0;

	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double calculateVolume(double y) {
		double x = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
		return x;
	}

	public double calculateArea(double z) {
		double x =  4.0 * Math.PI * Math.pow( radius, 2 );
		return x;
	}

	public double getVolume() {
		return calculateVolume(radius);
	}


	public double getSurfaceArea() {
		return calculateArea(radius);
	}

}
