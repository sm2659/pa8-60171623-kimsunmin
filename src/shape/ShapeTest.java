package shape;
//60171623 김선민
public class ShapeTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10,20,30,40);
		shapes[1] = new Rectangle(30,30,10,10);
		shapes[2] = new Circle(50,20,30);
		//constructor에 입력값을 넣어줌
		
		Drawable[] drawables = new Drawable[5];
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable)shapes[i];
		}
		drawables[3]= new Text("Sample Text");
		drawables[4] = new Bear(100,100,20);
		//constructor에 입력값을 넣어줌
		for(Drawable d: drawables) {
			d.draw();
		}

		Circle c = new Circle(100,100,20);

		for(int i=0;i < 10; i++) {
			
		System.out.println(c.move(100, 100));
		}
		}
	}


