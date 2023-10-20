package scheduler;

public class LeastJob implements Scheduler {
    
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	
	}
	
	@Override
	public void sendCalltoAgent() {
		// TODO Auto-generated method stub
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
		
	}

}
