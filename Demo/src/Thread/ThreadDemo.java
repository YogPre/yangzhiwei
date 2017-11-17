/**
 * @Title:ThreadDemo.java
 * @Package:Thread
 * @Description:TODO
 * @author:acer
 * @date:2017��11��17������2:33:35
 * @version:V1.0	
 */
package Thread;

/**
 * @ClassName:ThreadDemo
 * @Description:�߳�demo
 * @author: acer
 * @date 2017��11��17������2:33:35
 */

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("������20����");
		Animal animal = new Animal();
		try {
			Thread dog = new Thread(animal, "С��");
			Thread cat = new Thread(animal, "Сè");
			dog.start();
			cat.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("������ˣ�");
	}
	
	
}

/**
 * @ClassName:Animal
 * @Description:TODO
 * @author: acer
 * @date 2017��11��17������2:46:34
 */
class Animal implements Runnable{
	int count = 0;
	@Override
	public void run() {
		while(count < 20){
			synchronized (this) {
                 try {
                	 System.out.println(Thread.currentThread().getName()+"������"+count+"����");
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
