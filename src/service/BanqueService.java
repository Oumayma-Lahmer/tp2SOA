package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	public double conversion (double montant) {
		return montant*2;
	}
	//Activité 2-2 
	private Compte getCompte() {
		return new Compte(5, 4, new Date());
	}
	private List<Compte> getComptes(){
		List<Compte> list = new ArrayList();
		Date d = new Date(2020, 6, 9);
		Compte c = new Compte(4, 8, d);
		list.add(c);
		return list;
	}
	
	
}
