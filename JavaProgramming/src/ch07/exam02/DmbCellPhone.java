package ch07.exam02;

public class DmbCellPhone extends CellPhone{
	//0829
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);		//부모 생성자 호출. 부모 클래스 생성자가 매개변수가 있을시 자식 생성자에서 부모 생성자를 명확하게(명시적으로) 작성해야 한다.
		/*super.model = model;*/	//부모 필드 super -> 부모객체를 가리키는 키워드 (<=> this는 자기자신을 가리키는 키워드)
		/*super.color = color;*/	//부모 필드 super와 this는 인스턴스 메소드와 생성자 안에서 사용가능 하다. 객체 생성후 사용 해야 하는 필드(인스턴스 필드)이므로
		this.channel = channel;	//(<=> static에서는 사용 불가 하다.) *super는 자식 클래스 안에서만 사용 가능하다
	}
	
	void turnOnDmb(int channel){
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeCannelDmb(int channel){
		this.channel = channel;
		System.out.println("채널 " + channel + "번 으로 바꿉니다..");
	}
	
	void turnOffDmb(){
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
