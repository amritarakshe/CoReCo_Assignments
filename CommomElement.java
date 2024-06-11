package task.com;

import java.io.*;
import java.util.*;

public class CommomElement {
	
	public static void FindCommonElements(int[] L1, int[] L2)
	{

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();


		for (int i : L1) {
			set1.add(i);
		}


		for (int i : L2) {
			set2.add(i);
		}

		set1.retainAll(set2);
		System.out.println("Common elements- " + set1);
	}


	public static void main(String[] args) {
		
		int[] L1= {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80 };
		
		int[] L2 = {81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93 };

        System.out.println("Array 1: "+ Arrays.toString(L1));
        System.out.println("Array 2: "+ Arrays.toString(L2));
        FindCommonElements(L1, L2);

	}

}
