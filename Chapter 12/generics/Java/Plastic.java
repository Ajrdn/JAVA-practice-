package generics;

public class Plastic extends Material {
	
	@Override
	public String toString() {
		
		return "재료는 plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		
		System.out.println("plastic 재료로 출력합니다.");
	}

}
