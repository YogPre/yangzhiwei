/**
 * @Title:ThreadDemo.java
 * @Package:Thread
 * @Description:TODO
 * @author:acer
 * @date:2017年11月17日下午2:33:35
 * @version:V1.0	
 */
package Thread;

/**
 * @ClassName:ThreadDemo
 * @Description:线程demo
 * @author: acer
 * @date 2017年11月17日下午2:33:35
 */

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("盆里有20块肉");
		Animal animal = new Animal();
		try {
			Thread dog = new Thread(animal, "小狗");
			Thread cat = new Thread(animal, "小猫");
			dog.start();
			cat.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("肉吃完了！");
	}
	
	
}

/**
 * @ClassName:Animal
 * @Description:TODO
 * @author: acer
 * @date 2017年11月17日下午2:46:34
 */
class Animal implements Runnable{
	int count = 0;
	@Override
	public void run() {
		while(count < 20){
			synchronized (this) {
                 try {
                	 System.out.println(Thread.currentThread().getName()+"吃力第"+count+"块肉");
                	 count++;
//                	 Thread.sleep(100);
					this.wait(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
