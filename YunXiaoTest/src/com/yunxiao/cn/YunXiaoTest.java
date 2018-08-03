package com.yunxiao.cn;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class YunXiaoTest {

	public static void main(String[] args) {
		int year, month;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入月份（1~12）");
		month = in.nextInt();
		// 判断是否为闰年也恰好查询2月份天数
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
					System.out.println("您的输入月份错误！");
			}
		
	}

}
