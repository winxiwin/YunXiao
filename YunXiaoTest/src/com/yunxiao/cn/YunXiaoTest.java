package com.yunxiao.cn;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class YunXiaoTest {

	public static void main(String[] args) {
		int year, month;
		Scanner in = new Scanner(System.in);
		System.out.println("�������·ݣ�1~12��");
		month = in.nextInt();
		// �ж��Ƿ�Ϊ����Ҳǡ�ò�ѯ2�·�����
			switch (month) {
				case 2:
					System.out.println(28);
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					System.out.println(31);
					break;
				case 4:
				case 6:
				case 9:
				case 11:
				case 12:
					System.out.println(30);
					break;
				default :
					System.out.println("���������·ݴ���");
			}
		
	}

}
