package Basic.dev;

import java.util.Scanner;

/**
 * Viet chuong trinh khai bao mang so nguyen 5 phan tu.
 * Nhap gia tri cho mang tu ban phim
 * Tim gia tri lon nhat trong mang vua nhap
 * @author Administrator
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
        	System.out.format("a[%d]=" , 1);
        	a[i] = sc.nextInt();
        }
        
        //Tim gia tri lon nhat
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
        	if(max < a[i])
        		max = a[1];
        }
        
        System.out.println("Gia tri lon nhat: " + max);
	}

}
