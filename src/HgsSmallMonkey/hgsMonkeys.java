package HgsSmallMonkey;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 花果山一方：作戰計劃
 * @author user
 *
 */
public class hgsMonkeys {
	
	
	private Lock lock = new ReentrantLock();
	
	private Condition cond = lock.newCondition();

	/*
	 * 鍾猴與天兵之間的對決
	 */
	public void withSkySoldierKill(){
		
		System.out.println("猴子猴孙们与天兵天将厮杀中..");
		
	}
	

	/*
	 * 悟空出戰。
	 */
	public  void SunKill(){
		try{
			lock.lock();
			System.out.println("悟空出战..");
			cond.await();
			if("loseWuKong".equals(Thread.currentThread().getName())){
				System.out.println("悟空敗北，被压入五指山下，待有缘人加以施救。~~~~！阿弥陀佛......");
			}else{
				System.out.println("悟空戰勝，休战..");
			}
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	/*
	 * 通知悟空休戰
	 */
	public void signalSun(){
		try{
			lock.lock();
			cond.signal();
		}finally{
			lock.unlock();
		}
		
		
	}

}
