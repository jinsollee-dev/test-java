package practice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// 배열실습문제1-Q1.
		System.out.println("배열실습문제1-Q1");
		System.out.println("알파벳 한 문자를 입력하세요");
		Scanner scan1 = new Scanner(System.in);
		String a1 = scan1.next();
		char c = a1.charAt(0);
		for (int i = 97; i <= c; i++) {
			for (int j = i; j <= c; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		System.out.println();

		// 배열실습문제1-Q2.
		System.out.println("배열실습문제1-Q2");
		System.out.println("정수 10개 입력");
		Scanner scan2 = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int input = scan2.nextInt();
			arr[i] = input;
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		// 배열실습문제1-Q3.
		System.out.println();
		System.out.println("배열실습문제1-Q3");
		System.out.println("정수를 입력하세요");
		Scanner scan3 = new Scanner(System.in);
		
		
		try {int input = scan3.nextInt();
		     if (input % 2 == 0) {
		     System.out.println("짝수");
			} else if (input % 2 == 1) {
				System.out.println("홀수");
			} else {
				System.out.println("수를 입력하지 않아 종료합니다.");
			 }
		}
		catch(InputMismatchException e){
			System.out.println("수를 입력하지 않아 종료합니다.");
		}

		System.out.println();

		// 배열실습문제1-Q5.
		System.out.println("배열실습문제1-Q5");
		System.out.println("수 10개 입력");
		Scanner scan4 = new Scanner(System.in);

		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			int input2 = scan4.nextInt();
			arr2[i] = input2;

		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		// 배열실습문제2-Q1.
		System.out.println("배열실습문제2-Q1");
		System.out.println("금액을 입력하세요.");
		Scanner scan5 = new Scanner(System.in);
		int put = scan5.nextInt();
		int[] money = new int[10];
		int a = put / 50000; // 5만원짜리 갯수
		money[0] = a;
		put = put - (50000 * a);

		int b = put / 10000;
		money[1] = b; // 1만원
		put = put - (10000 * b);

		int C = put / 5000;
		money[2] = C;
		put = put - (5000 * C);

		int d = put / 1000;
		money[3] = d;
		put = put - (1000 * C);

		int e = put / 500;
		money[4] = e;
		put = put - (500 * e);

		int f = put / 100;
		money[5] = f;
		put = put - (100 * f);

		int g = put / 50;
		money[6] = g;
		put = put - (50 * g);

		int h = put / 10;
		money[7] = h;
		put = put - (10 * h);

		int i = put / 5;
		money[8] = i;
		put = put - (5 * i);

		money[9] = put;

		for (int array1 : money) {
			System.out.print(array1 + " ");

		}
		System.out.println();

		// 배열실습문제2-Q2.
		System.out.println();
		System.out.println("배열실습문제2-Q2");
		System.out.println("1부터 99사이의 정수를 입력해주세요.");
		Scanner scan6 = new Scanner(System.in);
		int input3 = scan6.nextInt();
		// 0<input3 < 100
		int st = input3 / 10;
		int sec = input3 % 10;

		if ((st == 3 || st == 6 || st == 9) && (sec == 3 || sec == 6 || sec == 9)) {
			System.out.println("박수짝짝");
		} else if (st == 3 || st == 6 || st == 9) {
			System.out.println("박수짝");
		} else if (sec == 3 || sec == 6 || sec == 9) {
			System.out.println("박수짝");
		} else
			System.out.println("1과 99까지의 정수 입력해주세요.");
		System.out.println();

		// 배열실습문제2-Q3.
		System.out.println("배열실습문제2-Q3");
		System.out.println(" | 1  2  3  4  5  6  7  8  9");
		System.out.println("-+---------------------------");
		for (i = 1; i < 10; i++) {
			System.out.print(i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}

		System.out.println();

		// 배열실습문제2-Q4. -> 배열실습문제1-Q1과 동일

		// 배열실습문제2-Q5.
		System.out.println("배열실습문제2-Q5");

		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() < 10) {
			int num1 = (int) ((Math.random() * 100) + 1);
			while (num1 % 3 != 0) {
				num1 = (int) ((Math.random() * 100) + 1);
			}
			set.add(num1);
		}

		Integer[] Arr = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(Arr));
		System.out.println();

		// 배열실습문제2-Q6.
		System.out.println("배열실습문제2-Q6");
		//선택정렬 
		int[] sort = {15, 7, 2, 9, 10, 12, 17, 11, 20, 5};
		int tempValue, tempJ = 0;
		for (i = 0; i < sort.length; i++) {  // 배열 처음부터 끝까지 반복 (i는 현재 위치)
			int min = Integer.MAX_VALUE;  // 제일 작은 수를 찾기 위해, min은 int의 최대 값으로 임시 세팅
			for (int j = i; j < sort.length; j++) {
				if (sort[j] < min) {  // 현재 위치부터 배열 마지막까지 반복문 돌면서 최소 값을 계속 찾음
					min = sort[j];
					tempJ = j;
				}
			}
			tempValue = sort[i]; // 찾은 최소값과 현재 위치의 값과 서로 바꿈
			sort[i] = sort[tempJ];
			sort[tempJ] = tempValue;
		}
		
		System.out.println("선택정렬"+ Arrays.toString(sort));
		
		//삽입정렬 
		int target; 
		for ( i = 1; i < sort.length; i++) {
			tempValue = sort[i]; // 선택된 숫자를 임시 저장
			target = i - 1;  // 비교 대상의 위치
			while (target >= 0 && sort[target] > tempValue) { // 왼쪽 끝까지 가거나, 자신보다 작은 수를 만나기 전까지 이동하면 삽입될 위치를 찾음
				sort[target + 1] = sort[target]; // 나보다 큰 수는 오른쪽으로 한칸 이동
				target--; // 그 다음 비교대상을 왼쪽으로 한 칸 이동
			}
			sort[target + 1] = tempValue;  // 적정한 위치를 찾아 선택된 숫자를 삽입
		}
		System.out.println("삽입정렬"+Arrays.toString(sort));
		
		//버블정렬 
		for (i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort.length - i - 1; j++) { // 0 ~ n, 0 ~ n-1 번 반복를 돌면서 바로 옆 숫자릴 비교
				if (sort[j] > sort[j + 1]) {  // 바로 오른쪽 숫자와 비교하여 크기가 클 경우, 서로 위치를 바꿈
					tempValue = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = tempValue;
				}
			}
		}
		System.out.println("버블정렬"+Arrays.toString(sort));
		

		// 배열실습문제2-Q7.
		System.out.println("배열실습문제2-Q7");
		int line = 9; 
		int space = line / 2 + 1;
		int star = 1;

		for (i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {
				System.out.print('*');
			}
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}

			if (i < line / 2) {
				space -= 1;
				star += 2;
			} else {
				space += 1;
				star -= 2;
			}
			System.out.println();
		}

	}
}
