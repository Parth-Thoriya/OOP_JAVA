package college;

public class TimerDemo {

	public static void main(String[] args) {
		
		Timer t1 = new  Timer(00,01,5);
		//Timer t2 = new Timer(12, 30, 30);
		//t1.addTime(t2);
		System.out.println("run");
		t1.counter();
		System.out.println("end");
		
		
		
	}

}
class Timer
{
	int hour,minute,second,day;
	
	 Timer(int hour , int minute , int second) {
		this.hour = hour;
		this.minute = minute;
		this.second= second;
		
	}
	 void addTime(Timer temp)
	 {
		 second += temp.second;
		 if(second>=60)
		 {
			second -=60;
			minute++;
		 }
		 
		 minute += temp.minute;
		 if(minute>=60)
		 {
			 minute -=60;
			 hour ++;
		 }
		 if(hour>=24)
		 {
			 hour-=24;
			 day++;
		 }
		 hour += temp.hour; 
		 
		 
		 
		 System.out.println(day+":"+hour+":"+ minute+":"+second);
	 }
	 void counter()
	 {
		 while(true)
		 {
			 
			second--;
			if(second<=0)
			{
				second = 59;
				minute--;
			}
			
			
			if(minute==0) 
			{
				
			}
					 
					 
					 System.out.println(day+":"+hour+":"+ minute+":"+second);
			 
			 try {
				 Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 
		 }
	 }
		
	
}
