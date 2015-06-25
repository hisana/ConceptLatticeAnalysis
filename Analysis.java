package results;

import java.util.*;
import java.io.*;

public class Analysis {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("ComponentsRailwayDom.cxt.i-stability.txt"));
		
		int count = 0;
		double[] stabs = new double[320];
		String[] objs = new String[320];
		String[] attrs = new String[320];
		int numoflargeobjs = 0;
		
		while(in.hasNextLine()){
			String line = in.nextLine();
			int start = line.indexOf(" ) ");
			int objspos = line.indexOf(", ");
			objs[count] = line.substring(1, objspos);
			attrs[count] = line.substring(objspos+1, start);
			stabs[count] = Double.parseDouble(line.substring(start+3));
			count++;
		}
		int num = 0;
		for(int i = 0;i < 320; i++){
			//num = num + stabs[i];
			//if(stabs[i] < 0.48){
				int numofwhitespace = 0;
				for(int j = 0; j < objs[i].length(); j++){
					char c = objs[i].charAt(j);
					if(c == ' ')
						numofwhitespace++;
				}
				
				//if( numofwhitespace <= 1){
				//System.out.print("stab({|A|=" + numofwhitespace + "} , ");
				//System.out.println(objs[i]);
				System.out.println(stabs[i]);}
				//}
				
			//}
		//}
		//System.out.println(num/320.0);
		
		
		in. close();
		
	}
}
