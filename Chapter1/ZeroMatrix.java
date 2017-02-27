import java.io.*;

public class ZeroMatrix{

	public static boolean zeroMatrix(int[][] matrix){

		boolean[] row=new boolean[matrix.length];
		boolean[] col=new boolean[matrix[0].length];
		// get zeros
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j]==0){
					row[i]=true;
					col[j]=true;
				}

			}

		}
		// row full of zeros

		for(int x=0; x<row.length; x++){
			if(row[x]==true){
				for(int i=0; i<matrix[0].length; i++){
					matrix[x][i]=0;
				}
			}

		}
		// col full of zeros
		for(int y=0; y<col.length; y++){
			if(col[y]==true){
				for(int j=0; j<matrix.length; j++){
					matrix[j][y]=0;
				}
			}

		}

		return true;
	}

	public static void main(String[] args){
		int[][] matrix= {{1,2,3},
						{5,6,7},
						{9,0,11},
						{13,14,15} };
		System.out.println(zeroMatrix(matrix));
		for(int i=0; i<matrix.length;i++){
			System.out.println(" ");
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j]);
			}

		}

	}

}