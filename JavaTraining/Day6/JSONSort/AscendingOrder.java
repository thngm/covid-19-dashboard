package JsonEx;

import java.util.Comparator;

import org.json.simple.JSONObject;

//sorts in ascending order
public class AscendingOrder implements Comparator<JSONObject>{
	
	public int compare(JSONObject prod1,JSONObject prod2)
	{
		// for comparison
        int ratingComp = String.valueOf(prod1.get("rating")).compareTo(String.valueOf(prod2.get("rating")));
       
        // 2-level comparison
        return (ratingComp == 0) ? String.valueOf(prod1.get("title")).compareTo(String.valueOf(prod2.get("title"))): ratingComp;
	}
	

}
