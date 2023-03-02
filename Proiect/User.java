package Proiect;

import java.io.File;
import java.util.Scanner;
import java.util.Vector;

////clasa SINGLETON USER ne va ajuta sa dam login in contul utilizatorului folosind datele din fisierele database
public class User {

	private static User user = new User();
	
	private User() {} //constructorul privat
	
	public static User getInstance() {
		if(user == null) {
			synchronized(User.class)
			{
				if(user == null) {
					user = new User();
				}
			}
		}
		return user;
	}
	
	//metoda de verificare a utilizatorului
	int verify_user(char[] x, char[] y, int aux) {
		try {
			//string-urile pentru citirea din fisier
			String str_username;
			String str_password;
			
			int ok=1;//parametru auxiliar de verificare
			
			//deschiderea fisierelor
			Scanner sc_username = new Scanner (new File("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\DataBase\\db_username.txt"));
			Scanner sc_password = new Scanner (new File("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\DataBase\\db_password.txt"));
			
			//cititrea si verificarea
			while(sc_username.hasNextLine() && sc_password.hasNextLine() && aux!=1) {
				//citirea din fisier
				str_username = sc_username.nextLine();
				//System.out.println("username: "+str_username);
				str_password = sc_password.nextLine();
				//System.out.println("password: "+str_password);
				
				//crearea a doi vectori char pentru a parcurge cuvintele citite din fisier
 				char str1[] = new char [str_username.length()];
				char str2[] = new char [str_password.length()];
				
				int i=0;//parametru de parcurgere
				
				while(str_username.charAt(i)!=' ')//cat timp nu a fost intalnit spatiu, cuvantul va fi citit litera cu litera
				{
					str1[i] = str_username.charAt(i);
					i++;
				}
				
				int j=0;//paramentru de parcugere
				while(str_password.charAt(j)!=' ')//cat timp nu a fost intalnit spatiu, cuvantul va fi citit litera cu litera
				{	
					str2[j]=str_password.charAt(j);
					j++;
				}		
				
				//System.out.println("x:"+ String.valueOf(x));
				//System.out.println("str1:"+ String.valueOf(str1));
				//System.out.println(y);
				//System.out.println(str2);
				
				//System.out.println(x.length);
				//System.out.println(str1.length);
				
				if(x.length==str1.length-1 && y.length==str2.length-1) { //daca lungimile sunt acelea ok=1
					ok=1;
				}
				
				if(x.length!=str1.length-1) { //daca lungime diferita ok=0
					ok=0;
				}
				
				if(y.length!=str2.length-1) { //daca lungime diferita ok=0
					ok=0;
				}
				
				if(ok!=0) { //daca lungimea e aceeasi verificam daca cuvintele sunt aceleasi
				for(int m=0; m<str1.length-1; m++) {
					if(str1[m]!=x[m])
					{
						ok=0;
					}
				}
			}
				//System.out.println("ok dupa for 1:"+ok);
			
				if(ok!=0) { //daca lungimea e aceeasi si la al doilea cuvant verificam sa fie si acelasi cuvant
				for(int m=0; m<str2.length-1; m++) {
					if(str2[m]!=y[m])
					{
						ok=0;
					}
				}
			}
				//System.out.println("ok: "+ok) ;
				
				if(ok!=0) //daca lungimea si cuvintele sunt aceleasi ok nu s-a modificat
				{
					aux=1; //aux devine 1, inchidem bucla
					return 1; //programul se incheie si returneaza 1
				}
				//System.out.println("aux: "+aux);
			}
			
			//inchidem fisierele
			sc_username.close();
			sc_password.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;//daca programul nu a returnat 1, returneaza 0 (utilizatorul nu exista in database
	}
		
}
