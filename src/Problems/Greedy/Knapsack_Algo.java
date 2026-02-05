package Problems.Greedy;

import java.util.Arrays;

public class Knapsack_Algo {
	
	public static double maxProfit(double[] value,int[] weight,int limit) {
		double[] c=new double[value.length];
		double p=0;
		for(int i=0;i<c.length;i++) {
			c[i]=value[i]/weight[i];
		}
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length-i-1;j++) {
				if(c[j]<c[j+1]) {
					double temp1=c[j];
					double temp2=value[j];
					int temp3=weight[j];
					c[j]=c[j+1];
					value[j]=value[j+1];
					weight[j]=weight[j+1];
					c[j+1]=temp1;
					value[j+1]=temp2;
					weight[j+1]=temp3;
				}
			}
		}
		
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<c.length;i++) {
			if(limit<weight[i]) {
				p+=c[i]*limit;
				limit=limit-limit;
			}else {
				p+=c[i]*weight[i];
				limit=limit-weight[i];
			}
		}
		
		return p;
	}
	
	public static void main(String[] args) {
		double[] value= {25,24,15};
		int[] weight= {18,15,10};
		System.out.println(maxProfit(value, weight, 30));
	}
}
