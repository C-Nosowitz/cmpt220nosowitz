
public class Problem3 {

	public static void main(String[] args) {
		char[][] answers = {
			       {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			       {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			       {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			       {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			       {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			       {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			       {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			       {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
			 
			     
			     char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
			     
			     int[][] result = new int[answers.length][2];
			 
			   
			     for (int i = 0; i < answers.length; i++) {
			      
			       int correctCount = 0;
			       for (int j = 0; j < answers[i].length; j++) {
			         if (answers[i][j] == keys[j])
			           correctCount++;
			       }
			        result[i][0] = i;
			        result[i][1] = correctCount;
			           
			     }
			     selectionSort(result);
			     
			     for (int j = 0; j < result.length; j++) {
			         System.out.println("Student " + result[j][0] + "'s correct count is " +
			           result[j][1]);
			     }
			      
			 
			   }      
			    
			   public static void selectionSort(int[][] list) {
			   for (int i = 0; i < list.length - 1; i++) {			   
			    int currentMin = list[i][1];
			    int currentMinIndex = i;			 
			    for (int j = i + 1; j < list.length; j++) {
			     if (currentMin > list[j][1]) {
			      currentMin = list[j][1];
			      currentMinIndex = j;
			     }
			    }
			    if (currentMinIndex != i) {
			     list[currentMinIndex][1] = list[i][1];
			     list[i][1] = currentMin;
			     list[currentMinIndex][0] = list[i][0];
			     list[i][0] = currentMinIndex;
			 
			    }
			   }
			  }
			 }
