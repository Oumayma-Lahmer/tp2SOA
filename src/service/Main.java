package service;

import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BanqueService bs = new BanqueService();
		double m ;
		double resultat;
		Scanner sc = new Scanner(System.in);
		System.out.println("donner un nombre: ");
		m = sc.nextInt();
		resultat = bs.conversion(m);
		System.out.println(" la resultat de conversion est: "+resultat);
		
		//active 2-2
		Date d = new Date(1999, 2, 4);
		Compte a = new Compte(12, 45.2, d);
		Compte b = new Compte(9, 4, d);
		List<Compte> list = new ArrayList();
		list.add(a);
		list.add(b);
	
		
		
		
	}
}
