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

public class ParseJsonEx {
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\encode.json"));
 
			// A JSON object
			JSONObject jsonObject = (JSONObject) obj;
 
			// A JSON array
			JSONArray productList = (JSONArray) jsonObject.get("products");
 
			
			Iterator<JSONObject> iterator = productList.iterator();
			JSONObject item;
			while (iterator.hasNext()) {
				item=iterator.next();
				System.out.println(item.get("title"));
				FileWriter file = new FileWriter("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\"+item.get("title")+".json");
		        file.write(item.toJSONString());
		        file.close();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


