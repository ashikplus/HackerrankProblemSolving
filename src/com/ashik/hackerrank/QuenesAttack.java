package com.ashik.hackerrank;

public class QuenesAttack {

	public static void main(String[] args) {
		
		int n = 5;
		int k = 0;
		
		int r_q = 4;
		int c_q = 3;
		int[][] obstracles = { {5,5},{4,2},{2,3} };
		
		int up,left,right,down,uld,urd,dld,drd;
		
		up = n-r_q;
        down = r_q-1;
        left = c_q-1;
        right = n-c_q;
        uld=up<left?up:left; 
        urd=up<right?up:right; 
        dld=down<left?down:left;
        drd=down<right?down:right;
        
        for(int[] obstracle : obstracles) {
        	int r_o = obstracle[0];
        	int c_o = obstracle[1];
        	
        	if(c_o == c_q){
                //vertical
                int path = Math.abs(r_o-r_q)-1;
                if(r_q<r_o){

                    up=up<path?up:path;
                }else{
                    down=down<path?down:path;
                }
            }else if(r_o == r_q){
                //horizontal
                int path = Math.abs(c_o - c_q)-1;
                if(c_q < c_o){
                    right = right<path?right:path;
                }else{
                    left=left<path?left:path;
                }
			} else {
				int path = Math.abs(c_o - c_q) - 1;
				int path2 = Math.abs(r_o - r_q) - 1;

				if (path == path2) {
					if (c_q < c_o && r_q < r_o) {

						// urd
						urd = urd < path ? urd : path;
					} else if (c_q > c_o && r_q < r_o) {
						// uld
						uld = uld < path ? uld : path;
					} else if (c_q < c_o && r_q > r_o) {
						// drd
						drd = drd < path ? drd : path;
					} else {
						dld = dld < path ? dld : path;
					}
				}
			}
        }
        int total = up+down+left+right+urd+uld+drd+dld;
        System.out.println(total);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static int attackSquares(int n, int k, int r_q, int c_q) {
//		
//		int sum = 0;
//		int min = Math.min(r_q, c_q);
//		double mid =  Math.ceil((double)n/2);
//		if(min >= mid) {
//			int cal = Math.abs(n - min) == 0 ? n-1 : Math.abs(n - min) * 2;
//			sum = (n+n) - 2 + cal;
//		}else {
//			int cal = Math.abs(1 - min) == 0 ? n-1 : Math.abs(1 - min) * 2;
//			sum = (n+n) - 2 + cal;
//		}
//		
//		return sum;
//	}

}
