// Pretty much have to import both of these every time.
// The Hashmap is the actualy "Dictionary"
// While the set is what lets us iterate through it
import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
// Making a new instance of Hashmap, here we are calling it songMap
        HashMap<String, String> songMap = new HashMap<String, String>();
// By using .put we add the key:value pairs to the Hashmap "dictionary"
        songMap.put("I'm a believer", "I thought love was only true in fairy tales.");
        songMap.put("In the air tonight", "I can feel it coming in the air tonight.");
        songMap.put("Satisfaction", "Push me then just touch me, till I get my satisfaction.");
        songMap.put("Take on me", "Taaake meeee onnnn, Take.on.me");
// Here we set an instance of Set
        Set<String> keys = songMap.keySet();
// We use an enhanced for loop to go through all the keys
// We could use a regular for loop to get the same result
        for(String key : keys){
// We print the key here. Ex..."I'm a believer"
            System.out.println(key);
// By using .get we print the value to the key Ex..."I thought love was only true in fairy tales."
            System.out.println(songMap.get(key));
// By .get the Key we get the value of it
        System.out.println(songMap.get("I'm a believer"));
        }
    }
}