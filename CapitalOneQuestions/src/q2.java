import java.util.*;
public class q2 {

    public static List<Integer> solution(int []Heights){
        List<Integer> heightsList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        

        for(int values : Heights){
            heightsList.add(values);
        }

        while(heightsList.size() > 2){
            Integer minHighlight = Integer.MAX_VALUE;
            
            for(int i = 0; i < heightsList.size(); i++){
                
                int current = heightsList.get(i);
                
                if(i - 1 < 0 && current > heightsList.get(i+1)){
                    
                    minHighlight = Math.min(current, minHighlight);
                }
                else if(i + 1 >= heightsList.size() && current > heightsList.get(i-1)){
                    
                    minHighlight = Math.min(current, minHighlight);
                }
                else if((i - 1 >= 0 && i + 1 < heightsList.size()) && heightsList.get(i-1) < current && current > heightsList.get(i+1)){
                    
                    minHighlight = Math.min(current, minHighlight);
                }
                

            }
            result.add(minHighlight);
            heightsList.remove(minHighlight);
            
        }
        result.add(Math.max(heightsList.get(0), heightsList.get( 1)));
        result.add(Math.min(heightsList.get(0), heightsList.get( 1)));

        
        return result;
    }
}