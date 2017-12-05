package shape;
//60171623 김선민
public class Square extends Shape {
	public Square(double a, double b, double width) {//생성자 선언
		getArea();{
			System.out.printf("Area: %.1f\n", (width*width));
		}
		getLength();{
			System.out.printf("Length: %.1f\n", (width*4));
		}
		draw();{
			System.out.println("Square "+"("+a+", "+(b-width)+")"+"-"+"("+(a+width)+", "+(b)+")");
		}
	}//상속받은 메소드를 통해 넓이,둘레,좌표 프린트
public void draw() {
		
	}
@Override
public String move(double dx, double dy) {//미구현 메소드 구현
	// TODO Auto-generated method stub
	dx += 10;
	dy += 10;
	return("Square "+"("+dx+","+dy+")");
}
}
