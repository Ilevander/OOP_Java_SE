package Exercice2;

public class Personne {

		//attrs
        private String nom;
        private String prenom;
        private String cin;
        private long tele;
        
        //mthds
        //Contructors
        public Personne(String nom,String prenom,String cin, long tele)
				        {
				        	this.nom=nom;
				        	this.prenom=prenom;
				        	this.cin=cin;
				        	this.tele=tele;
				        }
        public Personne() {}
        //Getters
        public String getNom()
		        {
		        	return nom;
		        }
        
        public String getPrenom()
		        {
		        	return prenom;
		        }
        
        public String getCin()
		        {
		        	return cin;
		        }
        
        public long getTele()
		        {
		        	return tele;
		        }
        //Need only one setter to modify the phone number:     
        public void setTele(long tele)
		        {
		        	this.tele=tele;
		        }
        
        
        //Override this method , because its already existed in java , just we need to redefine it with another functionnality
        @Override
        public String toString()  
				{
        	        System.out.println("****************************************************************");
					return "La personne |" +this.getNom()+ "| dispose de : \n" + "\t-Nom : " +this.getNom()+ "\t-Prenom : " +this.getPrenom()+ "\t-CIN : " +this.getCin()+ "\t-Tél : " +this.getTele() ;
				}
        //Test names between this of 
        public boolean testName(Personne p)
		        {
		        	return (this.getNom().equalsIgnoreCase(p.getNom()));
		        }
        
        
        
        
        
        
        
        
        
        
}
