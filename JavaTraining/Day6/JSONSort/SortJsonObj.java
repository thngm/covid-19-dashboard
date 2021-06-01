package JsonEx;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SortJsonObj {
	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		Scanner sc = new Scanner(System.in);
		//displays choice to users
		System.out.println("Enter your choice :");
		System.out.println("1 for asc");
		System.out.println("2 for desc");
		
		int choice = sc.nextInt();
		
		try {
			String[] title = new String[] {"milk" , "brown eggs"};
			JSONArray prodArr = new JSONArray();
			
			for(int i=0;i<title.length;i++)
			{
				Object obj = parser.parse(new FileReader("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\"+title[i]+".json"));
				// A JSON object
				JSONObject jsonObject = (JSONObject) obj;
				prodArr.add(jsonObject);
			}
			
			if(choice == 1)
			{
				//to sort in ascending order
				Collections.sort(prodArr , new AscendingOrder());
			}
			else if(choice == 2)
			{
				//to sort in desc order
				Collections.sort(prodArr , new DescendingOrder());
			}
			
			for(int i=0;i<prodArr.size();i++)
			{
				System.out.println(prodArr.get(i));
			}
			
			JSONObject Products = new JSONObject() ;
			Products.put("products",prodArr);
			
			//writing to a file
			FileWriter file = new FileWriter("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\products.json");
			file.write(Products.toJSONString());
			file.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


