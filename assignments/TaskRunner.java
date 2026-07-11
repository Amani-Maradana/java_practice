package assignments;

import java.util.Scanner;

public class TaskRunner implements Runnable{
	private final String taskName;
	public TaskRunner(String taskName) {
		this.taskName=taskName;
	}
	public void run() {
		System.out.print(taskName+ " ");
		
	}


	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		if(sc.hasNextInt()) {
			int n = sc.nextInt();
			Thread[] threads = new Thread[n];
			
			for(int i= 0;i<n;i++) {
				if(sc.hasNext()) {
					String taskName = sc.next();
					
					TaskRunner runner = new TaskRunner(taskName);
					threads[i] = new Thread(runner);
					threads[i].start();
					
					try {
						threads[i].join();
					}catch(InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		}
		sc.close();
	}
}

