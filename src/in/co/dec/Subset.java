package in.co.dec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subset {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, k;
		n = scanner.nextInt();
		k = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		ArrayList<Integer> result = smallestSubArray(list, k);
		for (Integer smallEle : result) {
			System.out.print(smallEle + " ");
		}
	}

	private static ArrayList<Integer> smallestSubArray(ArrayList<Integer> list, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < list.size() - k; i++) {
			Set<Integer> set = new HashSet<Integer>();
			int j;
			boolean flag = false;
			for (j = i; j < i + k; j++) {
				set.add(list.get(j));
				if (set.size() == k) {
					result.add(i);
					result.add(i + k - 1);
					flag = true;
					break;
				}

			}
			if (flag == true) {
				break;
			}


		}
		if (result.size() == 0) {
			result.add(-1);
			return result;
		}
		return result;
	}
}
