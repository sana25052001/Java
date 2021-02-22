package code1;

public class Code3 {
	  
	static class Testarray5{  
	public static void main(String args[]){  
	  
	int a[][]={{1,3,4},{3,4,5},{1,2,3}};  
	int b[][]={{1,3,4},{3,4,5},{1,0,2}};  
	//Addition of matrices    
	
	int c[][]=new int[3][3];  
	 for(int i=0;i<3;i++){  
     	for(int j=0;j<3;j++){
    	for(int k=0;k<3;k++) {
	 c[i][j]=a[i][k]+b[j][k];
	}
	System.out.print(c[i][j]+" ");  
	}  
	System.out.println();//new line  
	} 
	//Multiplication matrices
	int d[][]= new int[3][3];
    for(int i=0;i<3;i++) {
	for (int j=0;j<3;j++) {
		d[i][j]=0;
		for(int k=0;k<3;k++) {
		d[i][j]+=a[i][k]*b[k][j];
			}
			System.out.print(d[i][j]+" ");
		}
		System.out.println();
			}
		}
	  }
	}  

