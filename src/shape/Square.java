package shape;
//60171623 �輱��
public class Square extends Shape {
	public Square(double a, double b, double width) {//������ ����
		getArea();{
			System.out.printf("Area: %.1f\n", (width*width));
		}
		getLength();{
			System.out.printf("Length: %.1f\n", (width*4));
		}
		draw();{
			System.out.println("Square "+"("+a+", "+(b-width)+")"+"-"+"("+(a+width)+", "+(b)+")");
		}
	}//��ӹ��� �޼ҵ带 ���� ����,�ѷ�,��ǥ ����Ʈ
public void draw() {
		
	}
@Override
public String move(double dx, double dy) {//�̱��� �޼ҵ� ����
	// TODO Auto-generated method stub
	dx += 10;
	dy += 10;
	return("Square "+"("+dx+","+dy+")");
}
}
