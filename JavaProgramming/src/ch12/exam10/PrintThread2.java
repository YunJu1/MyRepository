package ch12.exam10;

public class PrintThread2 extends Thread {
	//0907
	@Override
	public void run() {
		try {
			
			while (true) {
				
				System.out.println("실행 중...");
				Thread.sleep(1);	//PrintThread 스레드가 일시정지 상태가 됨.스레드가 일시정지 될때  InterruptedException(예외) 발생
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
}
