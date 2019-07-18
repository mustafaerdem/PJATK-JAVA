import java.lang.Enum;
public class ERDEM {
    public enum teams {Germany(0), Ireland(1), Poland(2), Scotland(3);
    
    private int index;
    teams(int index) {
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
    }	;
    public static void main(String[]args){
        String[][] arr = { {"Germany", "2", "Scotland", "1"}, 
					{"Poland", "2", "Germany", "0"}, 
					{"Germany", "1", "Ireland", "1"}, 
					{"Poland", "2", "Scotland", "2"}, 
					{"Scotland", "1", "Ireland", "0"}, 
					{"Ireland", "1", "Poland", "1"}, 
					{"Ireland", "1", "Scotland", "1"}, 
					{"Germany", "3", "Poland", "1"}, 
					{"Scotland", "2", "Germany", "3"}, 
					{"Ireland", "1", "Germany", "0"}, 
					{"Scotland", "2", "Poland", "2"}, 
					{"Poland", "2", "Ireland", "1"} }; 

int[] scores = new int[4];

			
					
for (int i = 0; i < arr.length; i++) {
        
	teams home = teams.valueOf(arr[i][0]);
	teams away = teams.valueOf(arr[i][2]);
	
	if(Integer.valueOf(arr[i][1]) > Integer.valueOf(arr[i][3])){
		scores[home.getIndex()] += 3;
	}else if(Integer.valueOf(arr[i][3]) > Integer.valueOf(arr[i][1])){
		scores[away.getIndex()] += 3;
	}else{
		scores[home.getIndex()] += 1;
		scores[away.getIndex()] += 1;
        
        }
}
        System.out.println(java.util.Arrays.asList("GERMANY: " + scores[0] + " IRELAND: " + 
                scores[1] + " POLAND: " + scores[2] + " SCOTLAND: " + scores[3]));





    }
}
