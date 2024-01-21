package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        double tong=0;
        int dem=0;
        System.out.println("Nhập các phần tử của mảng:");

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.println("Mảng sau khi được sắp xếp tăng dần: ");

        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nPhần tử nhỏ nhất của mảng: " + arr[0]);

        for (int i = 0; i < n; i++) 
        {
            if(arr[i]%3==0)
            {
            	tong+=arr[i];
            	dem++;
            }	
        }
        
        System.out.println("\nTrung bình cộng các phần tử chia hết cho 3: " + tong/dem);

        scanner.close();
	}
}
