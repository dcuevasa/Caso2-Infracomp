package main.java.com.caso2;

public class Proceso {
	
	public void correr(int nf, int nc) 
	{
		int[][] mat3 = null;
		int[][] mat2 = null;
		int[][] mat1 = null;
		for(int i=1; i<nf-1;i++) 
		{
			for(int j=1; j<nc-1;j++) 
			{
				int acum = 0;
				for(int a=-1;a<=1;a++) {
					for(int b=1;b<=1;b++) {
						int i2 = i+a;
						int j2 = j+b;
						int i3 = 1+a;
						int j3 = 1+b;
						acum  += (mat2[i3][j3]*mat1[i2][j2]);
					}
				}
				if (acum >=0 && acum<=255) 
				{
					mat3[i][j]=acum;
				}
				else if (acum<0)
				{
					mat3[i][j] = 0;
				}
				else 
				{
					mat3[i][j] = 255;
				}
			}
		}
		
		for (int i = 0;i<nc;i++)
		{
			mat3[0][i]=0;
			mat3[nf-1][i]=255;
		}
		for(int i=1;i<nf-1;i++) 
		{
			mat3[i][0]=0;
			mat3[i][nc-1]=255;
		}
	}

}
