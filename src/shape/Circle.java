package shape;

public class Circle extends Shape {//ShapeŬ���� ���
	
	
	public Circle(double a, double b, double c) {
		//doubleŸ����  �Է¹޴� Constructor ����
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
//Shape���� ��ӹ��� �޼ҵ带 �̿��Ͽ� Circle�� ����,����,��ǥ ����Ʈ
	
		
	
	



	@Override
	public void draw() {
		
		
	}//Drawable interface���� �̱��� ���ִ� �޼ҵ带 ��������


	double g = 0;

	@Override
	public String move(double dx, double dy) {//Movable ���� �̱��� ���ִ� �޼ҵ� ����
		
		dx += g;
		dy += g;
		g = g+10;
		return("Circle center "+"("+dx+","+dy+")");
		
	}

	}
		
