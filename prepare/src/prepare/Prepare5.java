package prepare;

public class Prepare5 {

	class AA {
		   public void paint() {
		      System.out.print("A");
		      draw(); //this가 생략되어있음.
		   }
		   public void draw() {
		      System.out.print("B");
		   }
		}
		class BB extends AA {
		   public void paint() {
		      super.draw();
		      System.out.print("C");
		      this.draw();
		   }
		   public void draw() {
		      System.out.print("D");
		   }
		}

		public class InheritanceTask3 {
		   public static void main(String[] args) {
//		      BB b = new BB();
//		      b.paint();
//		      b.draw();
		   }//답은 BCDD
		}
}
