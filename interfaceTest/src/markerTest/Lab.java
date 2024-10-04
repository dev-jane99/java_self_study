package markerTest;
//연구소
public class Lab {
	public void checkKinds(Animal[] animal) { // upcasting 한거다. 부모의 타입이 자식의 타입이니.
	
	     for(int i = 0; i < animal.length; i++) {
		if(animal[i] instanceof CarnivoreMarker) {
			System.out.println("육식동물 입니다");
		}else if(animal[i] instanceof HerbivoreMarker) {
			System.out.println("초식동물 입니다");
		}else {
			System.out.println("잡식동물 입니다");
		}
	  }
	}
	public static void main(String[] args) {
		Lab lab = new Lab();
		lab.checkKinds(new Animal[] {new Tiger(), new Bear(), new Cow(), new Dog()});
}
}

