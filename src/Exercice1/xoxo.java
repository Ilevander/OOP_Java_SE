package Exercice1;
import java.util.Scanner;

import FirstCodeOopJava.Compte;

public class xoxo {

	public static void main(String[] args) {
		Compte C1 = new Compte();
		Compte C2 = new Compte();
		
		C1.deposer(500);
		C2.deposer(1000);
		C2.reirer(10);
		
		System.out.println(C1.toString());
		System.out.println(C2.toString());
		
		C1.virerVers(75, C2);
		
		System.out.println("Compte 1 :"+C1);
		System.out.println("Compte 2 :"+C2);
		
		Compte [] myacc = new Compte[10];
		
		for(int i=0;i<myacc.length;i++)
		{
			myacc[i] = new Compte();
			myacc[i].deposer(200 + 100*i);
			
			System.out.println("Le solde su compte :"+(i+1)+ "est : "+myacc[i] );
		}
		
		
		System.out.println("L'éxeution de constructeur par défaut dans la première ligne par compiler.");
		System.out.println(C1.toString());
		System.out.println("L'éxeution de constructeur d'initialisation par compiler.");
		System.out.println(C2.toString());
		
		C1.deposer(10);
		System.out.println("Ajouter 10 dh à C1.");
		System.out.println(C1.toString());  
		
		C2.deposer(100);
		System.out.println("Ajouter 100 dh à C2.");
		System.out.println(C2.toString());
		
		C2.retirer(50);
		System.out.println("Ajouter 100 dh à C2.");
		System.out.println(C2.toString());
		
		C2.verserVers(50, C1);
		
		System.out.println("C1 après verssement");
		System.out.println(C1.toString());  
		
		System.out.println("C2 après verssement");
		System.out.println(C2.toString());  
		
		Compte [] accounts = new Compte[10];
		 
		for(int i =0;i<accounts.length;i++) 
		{  
			accounts[i] = new Compte(50,"9addour"); 
			accounts[i].deposer(200);
			System.out.println("Accounts : "+ accounts[i]);
		}
		  
		
	}


     }

