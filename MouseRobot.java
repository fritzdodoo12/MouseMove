package move;

import java.awt.Robot;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.awt.event.InputEvent;
import java.util.Scanner;
public class MouseRobot {
	private int xValue;
	private int yValue;
	
	public void setX(int x){
		this.xValue += x;
	}
	
	public void setY(int y){
		this.yValue += y;
	}
	
	public int getX(){
		return this.xValue;
	}
	
	public int getY(){
		return this.yValue;
	}
	
	public static void main(String[] args) {
		MouseRobot myRobot = new MouseRobot();
		//System.out.println(new File("test.txt").getAbsolutePath());

		//File file = new File("input.txt");
		Scanner myScanner;
		//try {
			myScanner = new Scanner(System.in);
			while(myScanner.hasNextLine()){
				String myString = myScanner.nextLine();
				String [] myArray = myString.split("\\s+");
			
				myRobot.setX(Integer.parseInt(myArray[0]));
				myRobot.setY(Integer.parseInt(myArray[1]));
				//System.out.println(Integer.parseInt(myArray[0]));
				//System.out.println(Integer.parseInt(myArray[1]));
				try {
		            Robot robot = new Robot();
		            
		            robot.mouseMove(myRobot.getX(), myRobot.getY());
		            //robot.mousePress(InputEvent.BUTTON1_MASK);
		            //robot.mouseRelease(InputEvent.BUTTON1_MASK);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			}
			myScanner.close();
		//} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
		//	e1.printStackTrace();
		//}

		//myScanner.close();
		
	}

}
