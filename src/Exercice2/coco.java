package Exercice2;

public class coco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p1 = new Personne("toto","titi","45zv",064477);
		Personne p2 = new Personne("tata","fofo","35zfdzv",61461461);
		Personne p3 = new Personne("caca","coco","321zv",05465465465);
		Personne p4 = new Personne("toto","dodo","154aff",268164276);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		System.out.println();
		
		System.out.println("Modification of phone number of p4 : ");
		p4.setTele(06445533);
		System.out.println(p4.toString());
		
		System.out.println();
		System.out.println("Test des nom entre les personnes (p1) et (p4) : ");


		if(p1.testName(p4))
			System.out.println("Ces deux personne ont le même nom.");
		else
			System.out.println("Différents nom.");
	}

}
  