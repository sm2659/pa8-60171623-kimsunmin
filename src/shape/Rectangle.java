package shape;

public class Rectangle extends Shape{//ShapeŬ���� ��� 
	

	public Rectangle(double a, double b, double c, double d) {
		//doubleŸ���� �Է¹޴� Constructor ����
		getArea();{
			System.out.printf("Area: %.1f\n", (c*d));
		}
		getLength();{
			System.out.printf("Length: %.1f\n", ((2*c)+(2*d)));
		}
		draw();{
			System.out.println("Rectangle "+"("+a+", "+b+")"+"-"+"("+(a+c)+", "+(b+d)+")");
		}
		//Shape���� ��ӹ��� �޼ҵ带 �̿��Ͽ� Rectangle�� ����,����,��ǥ ����Ʈ
	}

	
	public void draw() {
		//Drawable interface���� �̱��� ���ִ� �޼ҵ带 ��������
		
	}


	@Override
	public String move(double dx, double dy) {//Movable ���� �̱��� ���ִ� �޼ҵ� ����
		// TODO Auto-generated method stub
		dx += 10;
		dy += 10;
		return("Rectangle "+"("+dx+","+dy+")");
	}
	
	
	}



