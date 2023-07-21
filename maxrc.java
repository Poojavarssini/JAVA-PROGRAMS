package placement;

public class maxrc {
	public static void main(String args[]) {
		int i,j;
		int arr[][]= {
				{5, 10, 15},
				{7, 21, 14},
				{19, 9, 20}
		};
		int n = arr.length;
		int rowMax[] = new int[n];
		int colMax[] = new int[n];
		int maxRow = 0;
		int maxCol = 0;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				if(arr[i][j] > maxRow) {
					maxRow = arr[i][j];
				}
				if(arr[j][i] > maxCol) {
					maxCol = arr[j][i];
				}
				//System.out.println(arr[i][j] + " ");
			}
			rowMax[i] = maxRow;
			colMax[i] = maxCol;
			maxRow = 0;
			maxCol = 0;
		}
		
		System.out.println("Row Max:");
		for(i=0; i<rowMax.length; i++) {
			System.out.println(rowMax[i] + " ");
		}
		
		System.out.println("Col Max:");
		for(i=0; i<colMax.length; i++) {
			System.out.println(colMax[i] + " ");
		}
	}
}
