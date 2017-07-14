package looptest;

public class Fortest {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
        int count1=0;
        int num=0;
		   /* for(int i=0; i < 1000000; i++) {
		            count1 =count1+1;

		    }*/
       while(num!=100000)
        {
        	num=num+1;
        }
        
		endTime = System.currentTimeMillis();

		long timeneeded =  ((endTime-startTime));
		System.out.println(startTime);
		System.out.println(endTime);
		System.out.println(timeneeded);
		System.out.println(count1);
		System.out.println(num);
	}

}
