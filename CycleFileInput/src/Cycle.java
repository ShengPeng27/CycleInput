import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Cycle {
	public static double numberOfWheels;
	public static double weight;
	public Cycle(double numberOfWheels, double weight){
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "Cycle [numberOfWheels= " + numberOfWheels + ", weight= " + weight
				+ "]";
	}
	public static void main(String[] args) throws FileNotFoundException   {
		// TODO Auto-generated method stub
		Scanner input=null;
		try{
			input = new Scanner(new File("C:/Users/Sheng/workspace/CycleFileOutPut/Cycle.txt"));
		}
		catch(FileNotFoundException e){
			System.out.println("File is not found");
			throw e;
		}
		while(!input.hasNextDouble())
		{
			 input.next();
		}
		numberOfWheels=input.nextDouble(); 
		while(!input.hasNextDouble())
		{
			input.next();
		}
		weight=input.nextDouble();
	 Cycle cycle1=new Cycle(numberOfWheels, weight);
	 System.out.println(cycle1.toString());
	}

}
