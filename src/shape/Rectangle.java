package shape;

public class Rectangle extends Shape{//Shape클래스 상속 
	

	public Rectangle(double a, double b, double c, double d) {
		//double타입을 입력받는 Constructor 생성
		getArea();{
			System.out.printf("Area: %.1f\n", (c*d));
		}
		getLength();{
			System.out.printf("Length: %.1f\n", ((2*c)+(2*d)));
		}
		draw();{
			System.out.println("Rectangle "+"("+a+", "+b+")"+"-"+"("+(a+c)+", "+(b+d)+")");
		}
		//Shape에서 상속받은 메소드를 이용하여 Rectangle의 넓이,길이,좌표 프린트
	}

	
	public void draw() {
		//Drawable interface에서 미구현 돼있는 메소드를 구현해줌
		
	}


	@Override
	public String move(double dx, double dy) {//Movable 에서 미구현 돼있는 메소드 구현
		// TODO Auto-generated method stub
		dx += 10;
		dy += 10;
		return("Rectangle "+"("+dx+","+dy+")");
	}
	
	
	}



