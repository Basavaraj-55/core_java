package P;

public class TwoDarry {
	 public static void main(String[] args) {
/*
	        int[][] a = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        System.out.println(a[0][0]);
	        System.out.println(a[0][1]);
	        System.out.println(a[1][2]);
	    }

	}
*/
// 2D arry 
		 int[][] a = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        for(int i = 0; i < a.length; i++) {
		            for(int j = 0; j < a[i].length; j++) {
		                System.out.print(a[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}	 