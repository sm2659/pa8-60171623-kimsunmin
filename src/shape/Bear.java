package shape;

public class Bear extends Shape {
	public Bear (double a, double b, double c) {//������ ����
		System.out.println("Bear");
		draw();{//��ο� ����
			System.out.println("Bear "+"("+(a-c)+", "+(b-c)+")"+"-"+"("+(a+c)+", "+(b+c)+")");
			System.out.println("Circle center "+"("+(a-c)+", "+(b-c)+")"+"-"+"Radius ("+10+")");
			System.out.println("Circle center "+"("+(a+c)+", "+(b+c)+")"+"-"+"Radius ("+10+")");
		}
	}
	//Shape���� ��ӹ��� �޼ҵ带 �̿��Ͽ� bear�� ����,����,��ǥ ����Ʈ
	public void draw() {
		
	}

	@Override
	public String move(double dx, double dy) {//Movable ���� �̱��� ���ִ� �޼ҵ� ����
		dx += 10;
		dy += 10;
		return("Bear "+"("+dx+","+dy+")");
		
	}
}
