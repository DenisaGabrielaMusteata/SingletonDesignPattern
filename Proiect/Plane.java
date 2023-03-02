package Proiect;

//clasa SINGLETON PLANE ne va ajuta sa calculam costul biletului pentru utilizatorul curent dar si nr de locuri disponibile
//aceasta creaza o singura istanta a obiectului avion
//nu vor fi vandute acelea locuri in acelasi avion la doi useri diferiti
public class Plane {
	
	private static Plane plane = new Plane(); //instanta clasei plane
	private int locuri_libere_economy = 150;
	private int locuri_libere_bussiness=20;
	private int pret_economy = 150;
	private int pret_bussiness = 400;
	private int pret_gustari=50;
	private int pret_cafea=10;
	private int pret_bauturi=50;
	
	private Plane() {} //constructorul privat
	
	public static Plane getInstance() {
		if(plane == null)
		{
			synchronized(Plane.class)
			{
				if(plane == null ) {
					
					plane = new Plane();

				}
			}
		}
		return plane;
	}
	
	int getlocuri_libere_economy() { //functia ne v-a returna nr de locuri libere la economy
		return locuri_libere_economy;
	}
	
	int getlocuri_libere_bussiness() { //functia ne v-a returna nr de locuri libere la bussiness
		return locuri_libere_bussiness;
	}
	
	int getpret_economy() { //functia ne v-a returna pretul pentru economy
		return pret_economy;
	}
	
	int getpret_bussiness() {  //functia ne v-a returna pretul pentru bussiness
		return pret_bussiness;
	}
	
	int getpret_gustari() { //functia ne v-a returna pretul pentru gustari
		return pret_gustari;
	}
	
	int getpret_cafea() { //functia ne v-a returna pretul pentru cafea
		return pret_cafea;
	}
	
	int getpret_bauturi() { //functia ne v-a returna pretul pentru bauturi
		return pret_bauturi;
	}
	

	
	void actualizare_locuri_bussiness(int x) //functia v-a actualiza nr de locuri libere la bussiness dupa cumparare
	{
		locuri_libere_bussiness=locuri_libere_bussiness-x;
	}
	
	void actualizare_locuri_economy(int x) //functia v-a actualiza nr de locuri libere la economy dupa cumparare
	{
		locuri_libere_economy=locuri_libere_economy-x;
	}
	
	void actualizare_economy_retur(int x) { //functia v-a actualiza nr de locuri libere la economy dupa returnare
		locuri_libere_economy=locuri_libere_economy+x;
	}
	
	void actualizare_bussiness_retur(int x) { //functia v-a actualiza nr de locuri libere la bussiness dupa returnare
		locuri_libere_bussiness=locuri_libere_bussiness+x;
	}
	
	int pret_total_economy(int nr_locuri) { //functia v-a returna pretul total pentru biletele cerute la economy
		return pret_economy = pret_economy*nr_locuri;
	}
	
	int pret_total_bussiness(int nr_locuri) { //functia v-a returna pretul total pentru biletele cerute la bussiness
		return pret_bussiness=pret_bussiness*nr_locuri;
	}
	
}
