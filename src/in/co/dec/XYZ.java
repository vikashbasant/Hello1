package in.co.dec;

public class XYZ {
	public static void main(String[] args) {
		int i, j, sum =0, k= 45;
		for (i = 3; i > 0; i--) {
			for(j=0; j<=i; j++) {
				if(j!=i) {
					sum+=sum+k*i;
				}
				else {
					sum -= sum - k;
				}

			}
			k++;
		}
		System.out.println(sum);
	}
}
