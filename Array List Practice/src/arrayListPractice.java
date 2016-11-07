import java.util.ArrayList;
import java.util.Collections;
public class arrayListPractice
	{
		public static void main(String[] args)
		{
			challengeOne();		
		}
		public static void challengeOne()
		{
			ArrayList <Double> temps = new ArrayList <Double>( );
			temps.add(98.6);
			temps.add(98.5);
			temps.add(99.3);
			temps.add(101.1);
			temps.add(103.1);
			temps.add(98.9);
			temps.add(98.4);
			temps.add(99.1);
			temps.add(98.6);
			temps.add(97.9);
			
			for(double q: temps)
				{
					System.out.println(q + " degrees Fahrenheit.");
				}
			//.set(index I want to replace, value I want to put in);
			//syso(tums.get(tums.size()-1))
			int counter = 0;	
			for (int i = 0; i < temps.size(); i++)
				{
			if(temps.get(i) > 98.6)
				{
					counter++;
				}
				}
			System.out.println();
			System.out.println("There are " + counter + " people with fevers.");
			
			System.out.println();
			
			for(int j = 0; j < temps.size(); j++)
				{
					System.out.println((temps.get(j) - 32) / 1.8 + " degrees Celsius.");
				}
			System.out.println();
			for(int k = 0; k < temps.size(); k++)
				{
					if(temps.get(k) < 98.7)
						{
							System.out.println(temps.get(k));
						}
				}
			System.out.println();
			
			double lowNum = 1000;
			double highNum = 0;
			
			for(int m = 0; m < temps.size(); m++)
				{
					if (temps.get(m) > highNum)
						{
							highNum = temps.get(m);
						}
					if (temps.get(m) < lowNum)
						{
							lowNum = temps.get(m);
						}
				}
			System.out.println("The lowest temperature is " + lowNum + " and the highest temperature is " + highNum + ".");
			
			
			
			
			
			
			
			
			
			
			
			
			
//			for(int l = temps.size(); l >=0; l--)
//				{
//					temps.remove()
//					temps.get(l);
//				}
				
			

		}
	}
