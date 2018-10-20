class MySquare {
	
	private double width;
	
	
	public MySquare() {
		this.width = 1.0;
		
	}
	public MySquare(double width, double height) {
        this.width = width;
        
	}
	public double getArea() {
		return this.width * this.width;
	}
	public double getPerimeter() {
		return this.width * 4;
	}
}

public class Problem1 {
	
	public static void main(String[] args) {	
		MySquare [] squares = new MySquare [2];
		
		 squares[0] = new MySquare(40, 40);
	     squares[1] = new MySquare(39.5, 39.5);
	     
	     for (int i = 0; i < 2; i++){
	            System.out.println("MySquare " + (i+1) +":");
	            System.out.print("Area = " + squares[i].getArea());
	            System.out.println(" Perimeter = " +  squares[i].getPerimeter() +"\n");
	        }
}
}