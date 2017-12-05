package shape;

public class Circle extends Shape {//Shape클래스 상속
	
	
	public Circle(double a, double b, double c) {
		//double타입을  입력받는 Constructor 생성
		getArea();{
			System.out.printf("Area: %.1f\n", (c*c*(3.14)));
		}
		getLength();{
			System.out.printf("Length: %.1f\n", (2*c*(3.14)));
		}
		draw();{
			System.out.println("Circle center "+"("+a+", "+b+")"+"-"+"Radius ("+c+")");
		}
		move(a,b);{
			a = a+10;
			b = b+10;
		}
		
	}		
//Shape에서 상속받은 메소드를 이용하여 Circle의 넓이,길이,좌표 프린트
	
		
	
	



	@Override
	public void draw() {
		
		
	}//Drawable interface에서 미구현 돼있는 메소드를 구현해줌


	double g = 0;

	@Override
	public String move(double dx, double dy) {//Movable 에서 미구현 돼있는 메소드 구현
		
		dx += g;
		dy += g;
		g = g+10;
		return("Circle center "+"("+dx+","+dy+")");
		
	}

	}
		
