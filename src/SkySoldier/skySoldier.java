package SkySoldier;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 天庭一方：作戰計劃
 * @author user
 *
 */
public class skySoldier {
	
	
	private Lock lock = new ReentrantLock();
	
	private Condition cond = lock.newCondition();
	
	
	/*
	 * 小兵之間的對決。
	 */
	public void withHgsMokeysKill(){
		
		System.out.println(Thread.currentThread().getName()+ "与众猴厮杀中..");
		
	}
	
	/*
	 * 天將與悟空之間的對決。 
	 */
	public  void someSkyPeople(){
		
		try{
			lock.lock();
			System.out.println("天帝派 " + Thread.currentThread().getName() + " 與悟空大戰....");
			cond.await();
			System.out.println(Thread.currentThread().getName() + "敗北，休戰...");
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	/*
	 * 通知天將休戰。
	 */
	public void someSkyPeopleSignal(){
		try{
			
			lock.lock();
			cond.signalAll();
		}finally{
			lock.unlock();
		}
        
	}
	/*
	 * 呼叫如来~
	 */
	public void callRuLaiFoZu(){
		try{
			lock.lock();
			System.out.println("玉皇大帝派 "  + Thread.currentThread().getName() + "去西天請如來佛祖降服妖猴!");
			System.out.println("玉皇大帝与众仙家焦急的等待着.........");
			cond.await();
			System.out.println("如来驾临，拈花指一弹、、、、、、、、");
			System.out.println("降服悟空，将悟空压入五指山中~~~~。");
			System.out.println("如来驾临，三界平安。");
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}

}
