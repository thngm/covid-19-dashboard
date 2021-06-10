package JsonEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class encodeJson {

      public static void main(String args[])
      {
    	  JSONObject obj = new JSONObject();
          JSONArray list = new JSONArray();
          
          //creating obj1 of list
          JSONObject listObj1 = new JSONObject();
          listObj1.put("title","brown eggs");
          listObj1.put("type","diary");
          listObj1.put("price",50);
          listObj1.put("description","Raw organic brown eggs in a basket");
          listObj1.put("rating", 4);
          listObj1.put("height",600);
          listObj1.put("width",400);
          
        //creating obj2 of list
          JSONObject listObj2 = new JSONObject();
          listObj2.put("title","milk");
          listObj2.put("type","diary");
          listObj2.put("price",20);
          listObj2.put("description","Sweet fresh stawberry on the wooden table");
          listObj2.put("rating", 4);
          listObj2.put("height", 299);
          listObj2.put("width", 299);
          
          list.add(listObj1);
          list.add(listObj2);
          
          obj.put("products", list);
          
      
          System.out.println(obj);

          try (FileWriter file = new FileWriter("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\encode.json")) {
              file.write(obj.toJSONString());
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
}
