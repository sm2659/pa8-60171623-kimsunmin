package shape;
//60171623 김선민
public class Triangle extends Shape{
	public Triangle(double a,double b, double bottom, double width) {
		double tb = Math.sqrt(bottom/2)*(bottom)+(width*width);
		getArea();{
			System.out.printf("Area: %.1f\n", (bottom*width/2));
			
		}
		getLength();{
			System.out.printf("Length: %.1f\n", ((2*tb+bottom)));
		}
		draw();{
			System.out.println("Triangle "+"("+a+", "+b+")"+"-"+"("+(a-(bottom/2))+", "+(b-width)+")"+"-"+"("+(a+(bottom/2))+", "+(b-width)+")");
		}
	}//상속받은 메소드를 통해 둘레,넓이,좌표를 프린트함
public void draw() {
		
	}
@Override
public String move(double dx, double dy) {//Movable 에서 미구현 돼있는 메소드 구현
	// TODO Auto-generated method stub
	dx += 10;
	dy += 10;
	return("Triangle "+"("+dx+","+dy+")");
}
}
