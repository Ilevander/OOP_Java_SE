/**
 * 
 */
package E_X_E_R_C_I_S_E;

/**
 * 
 */
public class Client {

	private String nom;
	private String id;
	private String adress;
	private long tele;
	
	public Client() {}
	public Client(String nom,String id,String adress,long tele) 
		      {
				this.nom=nom;
				this.id=id;
				this.adress=adress;
				this.tele=tele;
		      }
	
	public String getNom()
						{
							return this.nom;
						}
	public String getId()
						{
							return this.id;
						}
	public String getAdrss()
						{
							return this.adress;
						}
	public long getTele()
						{
							return this.tele;
						}
	
}
