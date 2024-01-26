package Exercice1;

import FirstCodeOopJava.Compte;

public class Compte {
	//Attrs
	private int solde = 0;
	private String nomTitulaire;
	
	//Methods
	public void retirer(int montant)
	{
		solde = solde - montant;
	} 
	
	public void deposer(int montant)
	{ 
		solde = solde + montant;
	}
	
	public void verserVers(int montant,Compte destination)
	{
		this.retirer(montant);
		destination.deposer(montant);
	}  
	
	@Override
	public String toString()
	{
		return "-Sole : " +solde+ "-Nom de Titulaire : " +nomTitulaire;
	}
	 
	//Constructors
	public Compte() {} 
	public Compte()    
	{
		this.solde = 10;
		this.nomTitulaire="__Ukonwn";
	}
	   
	public Compte(int solde,String nomTitulaire)
	{
		this.solde = solde;
		this.nomTitulaire= nomTitulaire;
	}
	
	
	//Getter and Setters :
	
	public int getSolde()
	{
		return solde;
	}
	
	public void setSolde(int solde)
	{
		this.solde=solde;
	}
	
	public String getNomTitulaire()
	{
		return nomTitulaire;
	}
	
	public void setNomTitulaire(String  nomTitulaire)
	{
		this.nomTitulaire=nomTitulaire;
	}
}
