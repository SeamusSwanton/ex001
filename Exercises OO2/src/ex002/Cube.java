package ex002;

public class Cube implements GeometricSolid {
	
	double cube = 0;

	public Cube(double cube) {
		this.cube = cube;
	}
	
	public double calculateVolume(double y) {
		double x = Math.pow(y, 3);
		return x;
	}

	public double calculateArea(double z) {
		double x = Math.pow(z, 2);
		x = x * 6;
		return x;
	}

	public double getVolume() {
		return calculateVolume(cube);
	}


	public double getSurfaceArea() {
		return calculateArea(cube);
	}

}
