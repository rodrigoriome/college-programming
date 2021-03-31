package controller;

import java.util.ArrayList;

import util.Teclado;

public class ex_04 {
	
	public static void main(String[] args) {
		String name;
		int roleId;
		double salary;
		ArrayList<String> namesList = new ArrayList<String>();
		ArrayList<Integer> rolesList = new ArrayList<Integer>();
		ArrayList<Double> salariesList = new ArrayList<Double>();
		
		while (true) {
			name = Teclado.lerTexto("Digite o nome do funcionário");
			if (name.equals("fim")) {
				break;
			}
			
			namesList.add(name);
			
			roleId = Teclado.lerInt("Digite o código do cargo do funcionário");
			rolesList.add(roleId);
			
			salary = Teclado.lerDouble("Digite o salário do funcionário");
			salariesList.add(raise(salary, roleId));
		}
		
		System.out.println("Salários reajustados:");
		for(int i = 0; i < namesList.size(); i++) {
			System.out.println(namesList.get(i) + " - R$ " + salariesList.get(i));
		}
		
	}
	
	public static double raise(double salary, int roleId) {
		switch (roleId) {
		case 1:
			salary = salary*1.05;
			break;
		case 2:
			salary = salary*1.1;
			break;
		case 3:
			salary = salary*1.2;
			break;
		}
		
		return salary;
	}
}
