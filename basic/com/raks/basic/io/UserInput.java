package com.raks.basic.io;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
	
	private ArrayList<OrderBo> orders = new ArrayList<OrderBo>();
	
	public void setValues(OrderBo order) {
		orders.add(order);
	}

	public void start() {
		String inputValue = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("주문 [o], 종료 [q] : ");
		inputValue = sc.nextLine();
		System.out.println(inputValue);

		if("q".equals(inputValue)) {
			System.out.println("종료합니다..");
		}
		else {
			productSelect();
		}
	}

	public void productSelect() {
		String inputValue = "";
		Scanner sc = new Scanner(System.in);
		OrderBo obo = new OrderBo();

		System.out.print("상품번호 :");
		inputValue = sc.nextLine();

		if(inputValue != null && !"".equals(inputValue)) {
			obo.setProductId(Integer.parseInt(inputValue));
		}

		System.out.print("주문 수량 :");
		inputValue = sc.nextLine();

		if(inputValue != null && !"".equals(inputValue)) {
			obo.setCount(Integer.parseInt(inputValue));
		}
	}

	public static void main(String[] args) {

		UserInput ui = new UserInput();
		
		ui.start();
	}
}
