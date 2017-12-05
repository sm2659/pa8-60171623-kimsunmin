package shape;

public class Bear extends Shape {
	public Bear (double a, double b, double c) {//생성자 설정
		System.out.println("Bear");
		draw();{//드로우 실행
			System.out.println("Bear "+"("+(a-c)+", "+(b-c)+")"+"-"+"("+(a+c)+", "+(b+c)+")");
			System.out.println("Circle center "+"("+(a-c)+", "+(b-c)+")"+"-"+"Radius ("+10+")");
			System.out.println("Circle center "+"("+(a+c)+", "+(b+c)+")"+"-"+"Radius ("+10+")");
		}
	}
	//Shape에서 상속받은 메소드를 이용하여 bear의 넓이,길이,좌표 프린트
	public void draw() {
		
	}

	@Override
	public String move(double dx, double dy) {//Movable 에서 미구현 돼있는 메소드 구현
		dx += 10;
		dy += 10;
		return("Bear "+"("+dx+","+dy+")");
		
	}
}
