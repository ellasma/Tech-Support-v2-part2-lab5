import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * The responder class represents a response generator object. It is used
 * to generate an automatic response. This is the second version of this 
 * class. This time, we generate some random behavior by randomly selecting 
 * a phrase from a predefined list of responses.
 * 
 * @author   Michael Kölling and David J. Barnes
 * @version 7.2
 */
public class Responder
{
    private HashMap<String, String> responseMap;
    private ArrayList<String> defaultResponses;
    private String lastDefault;
    private Random random;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        responseMap = new HashMap<>();
        defaultResponses = new ArrayList<>();
        lastDefault = "";
        random = new Random();
        fillResponsesMap();
        fillDefaultResponses();
    }

    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponse (HashSet<String> inputWords)
    {
        for(String word : inputWords) {
        if (responseMap.containsKey(word)) {
            return responseMap.get(word);
        }
    }
        return pickDefaultResponse();
    }
    
    private void fillResponsesMap() {
        responseMap.put("hello", "hi there!");
        responseMap.put("bye", "Goodbye");
        responseMap.put("slow", "Have you tried restarting your computer?");
        responseMap.put("crash", "That's bad. Describe what were you doing");
        responseMap.put("bug", "Please give more details");
    }
    
    private void fillDefaultResponses() {
        defaultResponses.add("I don't understand.");
        defaultResponses.add("Can you elaborate a little more?");
        defaultResponses.add("Tell me more about it.");
    }
    
    private String pickDefaultResponse() {
        String response;
        do {
            response = defaultResponses.get(random.nextInt(defaultResponses.size()));
        }   while(response.equals(lastDefault));
        lastDefault = response;
        return response;
    }
}

