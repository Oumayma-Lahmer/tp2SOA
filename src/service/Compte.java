package service;

import java.util.Date;

public class Compte {
	int code;
	Double solde;
	Date DateCreation;
	
	
	
	public Compte(int code, double d, Date dateCreation) {
		super();
		this.code = code;
		this.solde = d;
		DateCreation = dateCreation;
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public Double getSolde() {
		return solde;
	}
	
	public void setSolde(float solde) {
		this.solde = (double) solde;
	}

	public Date getDateCreation() {
		return DateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	
}
