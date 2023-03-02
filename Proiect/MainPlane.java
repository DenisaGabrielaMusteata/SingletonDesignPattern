package Proiect;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

////POZELE SI FISIERELE TEXT PENTRU LOG IN AU FOST SALVATE IN CALCULATORUL MEU, PENTRU A VERIFICA FUNCTIONALITATEA TREBUIE SCHIMBATE LOCATIILE
////AM ATASAT IN ZIP SI FOLDERELE CU FISIERE SI POZE

public class MainPlane {
	Plane plane = Plane.getInstance(); //instanta avion
	User user = User.getInstance(); //instanta user
	JFrame Login;
	JFrame Principal;
	JFrame Cumparare;
	JFrame Beneficii;
	JFrame PretFinal;
	JFrame AnulareRezervare;
	private JTextField nr_bil_ec;
	private JTextField nr_bil_bs;
	int pret_final,pret_economy=0,pret_ec,pret_bs;
	private JTextField usertext;
	private JTextField passtext;
	private JLabel textlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPlane window = new MainPlane();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPlane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	    //constructie interfete 
		/////interfata cu Meniul Principal
		Principal = new JFrame();
		Principal.getContentPane().setBackground(new Color(196, 255, 255));
		Principal.getContentPane().setLayout(null);
		Principal.setBackground(new Color(196, 255, 255));
		Principal.setBounds(0, 0, 1540, 855);
		Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Principal.setVisible(false);
		
		/////contruire interfata de cumparare
		Cumparare = new JFrame();
		Cumparare.getContentPane().setForeground(new Color(0, 0, 0));
		Cumparare.setBackground(new Color(0, 128, 255));
		Cumparare.getContentPane().setBackground(new Color(196, 255, 255));
		Cumparare.getContentPane().setLayout(null);
		Cumparare.setBounds(0, 0, 1540, 855);
		Cumparare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Cumparare.setVisible(true);
		
		/////construire frame beneficii
		Beneficii = new JFrame();
		Beneficii.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 37));
		Beneficii.getContentPane().setForeground(new Color(0, 0, 0));
		Beneficii.setBackground(new Color(0, 128, 255));
		Beneficii.getContentPane().setBackground(new Color(196, 255, 255));
		Beneficii.getContentPane().setLayout(null);
		Beneficii.setBounds(0, 0, 1540, 855);
		Beneficii.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Beneficii.setVisible(true);
		
		/////interfata cu pretul final
		PretFinal = new JFrame();
		PretFinal.getContentPane().setForeground(new Color(0, 0, 0));
		PretFinal.setBackground(new Color(0, 128, 255));
		PretFinal.getContentPane().setBackground(new Color(196, 255, 255));
		PretFinal.getContentPane().setLayout(null);
		PretFinal.setBounds(0, 0, 1540, 855);
		PretFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//PretFinal.setVisible(true);
		
		/////contructie frame pentru anulare rezervare
		AnulareRezervare = new JFrame();
		AnulareRezervare.getContentPane().setForeground(new Color(0, 0, 0));
		AnulareRezervare.setBackground(new Color(0, 128, 255));
		AnulareRezervare.getContentPane().setBackground(new Color(196, 255, 255));
		AnulareRezervare.getContentPane().setLayout(null);
		AnulareRezervare.setBounds(0, 0, 1540, 855);
		AnulareRezervare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//AnulareRezervare.setVisible(true);
		
		//Adaugare poze la frameuri
		/////poze frame Principal	
		Container c = Principal.getContentPane();
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\cloud2.png"));
		label.setBounds(900, 566, 496, 242);
		c.add(label);
		JLabel label1 = new JLabel();
		label1.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\cloud2.png"));
		label1.setBounds(162, 566, 496, 242);
		c.add(label1);
		JLabel label4 = new JLabel();
		label4.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\plane7.png"));
		label4.setBounds(-199, 420, 1090, 324);
		c.add(label4);
		
		/////poze frame Cumparare
		Container c1 = Cumparare.getContentPane();
		JLabel label2 = new JLabel();
		label2.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\plane4.png"));
		label2.setBounds(30, 69, 341, 148);
		c1.add(label2);
		JLabel label3 = new JLabel();
		label3.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\plane5.png"));
		label3.setBounds(992, 409, 1033, 998);
		c1.add(label3);
		
		/////poze frame Beneficii
		Container c2 = Beneficii.getContentPane();
		JLabel label5 = new JLabel();
		label5.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\plane11.png"));
		label5.setBounds(60, -160, 1334, 348);
		c2.add(label5);
		
		/////poze frame PretFinal
		Container c3 = PretFinal.getContentPane();
		JLabel label6 = new JLabel();
		label6.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\plane10.png"));
		label6.setBounds(-67, 531, 1334, 348);
		c3.add(label6);
		JLabel label7 = new JLabel();
		label7.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\cloud2.png"));
		label7.setBounds(1030, 328, 496, 242);
		c3.add(label7);
		JLabel label8 = new JLabel();
		label8.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\cloud2.png"));
		label8.setBounds(-15, 347, 496, 242);
		c3.add(label8);
		
		/////poze frame AnulareRezervare
		Container c4 = AnulareRezervare.getContentPane();
		JLabel label9 = new JLabel();
		label9.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\sadcloud1.png"));
		label9.setBounds(-190, 443, 1334, 348);
		c4.add(label9);
		
		//adaugare texte la frameuri
		
		/////texte frame Principal
		JLabel Text1 = new JLabel("Ce actiune doriti sa efectuati?");
		Text1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		Text1.setBounds(528, 155, 504, 62);
		Principal.getContentPane().add(Text1);
		
		JLabel titlu = new JLabel("Welcome   to   PIP   Airways");
		titlu.setFont(new Font("Elsie Black", Font.BOLD, 59));
		titlu.setBounds(362, 37, 897, 79);
		Principal.getContentPane().add(titlu);
		
		/////texte frame Cumparare
		JLabel titlu1 = new JLabel("Completeaza in functie de preferintele tale");
		titlu1.setFont(new Font("Georgia", Font.PLAIN, 40));
		titlu1.setBounds(440, 38, 819, 46);
		Cumparare.getContentPane().add(titlu1);
		
		JLabel bil_ec = new JLabel("Cate bilete de tipul economy doresti?");
		bil_ec.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		bil_ec.setBounds(202, 189, 575, 60);
		Cumparare.getContentPane().add(bil_ec);
		
		JLabel bil_bussiness = new JLabel("Cate bilete de tipul bussiness doresti?");
		bil_bussiness.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		bil_bussiness.setBounds(832, 189, 575, 60);
		Cumparare.getContentPane().add(bil_bussiness);
		
		JLabel pret_bilet_ec = new JLabel("( Pret bilet economy: " + plane.getpret_economy()+ " RON )");
		pret_bilet_ec.setFont(new Font("Tahoma", Font.BOLD, 16));
		pret_bilet_ec.setBounds(309, 241, 269, 20);
		Cumparare.getContentPane().add(pret_bilet_ec);
		
		JLabel pret_bilet_bs = new JLabel("( Pret bilet bussiness: " + plane.getpret_bussiness()+ " RON )");
		pret_bilet_bs.setFont(new Font("Tahoma", Font.BOLD, 16));
		pret_bilet_bs.setBounds(932, 241, 269, 20);
		Cumparare.getContentPane().add(pret_bilet_bs);
		
		JTextPane informatii = new JTextPane();
		informatii.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		informatii.setBackground(new Color(196, 255, 255));
		informatii.setText("Cateva note informative:\r\n\r\n-pretul biletului la economy class nu include si gustarile de pe timpul zborului\r\n-pretul biletului la economy class nu include si cafea de pe timpul zborului\r\n-pretul biletului la economy class nu include si alte bauturi de pe timpul zborului\r\n-cele mentionate mai sus se vor achita separat doar de catre beneficiarii biletelor de la economy class\r\n-persoanele care vor cumpara bilete la bussiness class vor avea beneficii suplimentare\r\n-copii nu pot calatorii la bussiness class\r\n-pretul biletelor pentru copii ce vor calatori la economy class este jumatate din pretul total\r\n");
		informatii.setBounds(10, 621, 617, 176);
		Cumparare.getContentPane().add(informatii);
		
		
		/////texte frame Beneficii
		JLabel beneficii_text = new JLabel("Te rugam sa ne spui mai jos daca doresti ca pe timpul zborului sa beneficiezi de:");
		beneficii_text.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		beneficii_text.setBounds(371, 213, 852, 36);
		Beneficii.getContentPane().add(beneficii_text);
		
		JTextPane beneficii = new JTextPane();
		beneficii.setBackground(new Color(196, 255, 255));
		beneficii.setFont(new Font("Times New Roman", Font.PLAIN, 31));
		beneficii.setText("Gustari\r\n\r\nCafea\r\n\r\nAlte bauturi\r\n\r\n");
		beneficii.setBounds(660, 259, 157, 192);
		Beneficii.getContentPane().add(beneficii);
		
		
		/////texte frame PretFinal
		JLabel pret = new JLabel("Pretul total pentru achizitia dumneavoastra este de:");
		pret.setFont(new Font("Times New Roman", Font.PLAIN, 43));
		pret.setBounds(309, 98, 913, 150);
		PretFinal.getContentPane().add(pret);
		
		JLabel company = new JLabel("PIP AIRWAYS");
		company.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 33));
		company.setBounds(1238, 674, 267, 31);
		PretFinal.getContentPane().add(company);
		
		JLabel titlu3 = new JLabel("PIP AIRWAYS, YOUR FAVOURITE PLANE");
		titlu3.setForeground(new Color(255, 128, 128));
		titlu3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 57));
		titlu3.setBounds(202, 35, 1138, 72);
		PretFinal.getContentPane().add(titlu3);
		
		/////texte frame AnulareRezervare
		JTextPane NePareRau = new JTextPane();
		NePareRau.setBackground(new Color(196, 255, 255));
		NePareRau.setFont(new Font("Tahoma", Font.BOLD, 22));
		NePareRau.setText("\t\tNe pare rau ca doresti sa iti anulezi rezervarea\r\n\t  \t        Te asteptam in zborurile urmatoare");
		NePareRau.setBounds(373, 678, 758, 58);
		AnulareRezervare.getContentPane().add(NePareRau);
		
		JLabel titluu = new JLabel("PIP AIRWAYS");
		titluu.setForeground(new Color(255, 128, 128));
		titluu.setFont(new Font("Times New Roman", Font.BOLD, 58));
		titluu.setBounds(605, 31, 534, 49);
		AnulareRezervare.getContentPane().add(titluu);
		
		JLabel text_anularerezervare = new JLabel("Pentru a putea anula rezervarea te rugam sa ne spui cate bilete ai cumparat la economy class si cate la bussiness class\r\n");
		text_anularerezervare.setFont(new Font("Tahoma", Font.BOLD, 23));
		text_anularerezervare.setBounds(57, 111, 1459, 58);
		AnulareRezervare.getContentPane().add(text_anularerezervare);
		
		JLabel bilete_retur_ec = new JLabel("Bilete cumparate la economy class");
		bilete_retur_ec.setFont(new Font("Times New Roman", Font.BOLD, 24));
		bilete_retur_ec.setBounds(216, 259, 415, 49);
		AnulareRezervare.getContentPane().add(bilete_retur_ec);
		
		JLabel bilete_retur_ec_1 = new JLabel("Bilete cumparate la bussiness class");
		bilete_retur_ec_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		bilete_retur_ec_1.setBounds(956, 259, 415, 49);
		AnulareRezervare.getContentPane().add(bilete_retur_ec_1);
		
		
		//adaugare TextField-uri la frameuri
		/////TextFields frame Cumparare
		JTextField nr_bilete = new JTextField();
		nr_bilete.setBorder(null);
		nr_bilete.setBackground(new Color(196, 255, 255));
		nr_bilete.setFont(new Font("Serif", Font.PLAIN, 23));
		nr_bilete.setBounds(480, 82, 697, 36);
		Cumparare.getContentPane().add(nr_bilete);
		nr_bilete.setColumns(10);
		nr_bilete.setEditable(false);
		//pentru afisarea biletelor disponibile folosim intanta plane a avionului
		//aceasta se va actualiza dupa fiecare noua operatiune
		nr_bilete.setText("Mai sunt disponibile " +  plane.getlocuri_libere_economy() + " bilete economy class si " + plane.getlocuri_libere_bussiness() + " bilete bussiness class");
	
		nr_bil_ec = new JTextField("0");
		nr_bil_ec.setFont(new Font("Times New Roman", Font.BOLD, 46));
		nr_bil_ec.setBorder(null);
		nr_bil_ec.setBounds(359, 271, 163, 46);
		Cumparare.getContentPane().add(nr_bil_ec);
		nr_bil_ec.setColumns(10);
		
		nr_bil_bs = new JTextField("0");
		nr_bil_bs.setFont(new Font("Times New Roman", Font.BOLD, 46));
		nr_bil_bs.setBorder(null);
		nr_bil_bs.setColumns(10);
		nr_bil_bs.setBounds(992, 271, 163, 46);
		Cumparare.getContentPane().add(nr_bil_bs);
		
		/////TextFields frame PretFinal
		JTextField pret_final = new JTextField("0");
		pret_final.setEditable(false);
		pret_final.setForeground(new Color(0, 0, 0));
		pret_final.setBackground(new Color(196, 255, 255));
		pret_final.setFont(new Font("Times New Roman", Font.BOLD, 27));
		pret_final.setBorder(null);
		pret_final.setBounds(696, 226, 163, 46);
		PretFinal.getContentPane().add(pret_final);
		pret_final.setColumns(10);
		
		/////TextFields frame AnulareRezervare
		JTextField bil_ret_ec = new JTextField("0");
		bil_ret_ec.setForeground(new Color(0, 0, 0));
		bil_ret_ec.setFont(new Font("Times New Roman", Font.BOLD, 40));
		bil_ret_ec.setBounds(328, 318, 96, 40);
		AnulareRezervare.getContentPane().add(bil_ret_ec);
		bil_ret_ec.setColumns(10);
		
		JTextField bil_ret_bs = new JTextField("0");
		bil_ret_bs.setForeground(new Color(0, 0, 0));
		bil_ret_bs.setFont(new Font("Times New Roman", Font.BOLD, 40));
		bil_ret_bs.setColumns(10);
		bil_ret_bs.setBounds(1088, 318, 96, 40);
		AnulareRezervare.getContentPane().add(bil_ret_bs);
		
		
		//adaugare JButtons la frame-uri
		/////Butoane frame Principal
		JButton cumpar = new JButton("Cumpar bilet");
		cumpar.setFont(new Font("Tahoma", Font.PLAIN, 23));
		cumpar.setBounds(630, 238, 260, 42);
		Principal.getContentPane().add(cumpar);
		
		JButton anulezb = new JButton("Anulez bilet");
		anulezb.setFont(new Font("Tahoma", Font.PLAIN, 23));
		anulezb.setBounds(630, 302, 260, 42);
		Principal.getContentPane().add(anulezb);
		
		JButton anulezc = new JButton("Anulez cerere");
		anulezc.setFont(new Font("Tahoma", Font.PLAIN, 23));
		anulezc.setBounds(630, 368, 260, 42);
		Principal.getContentPane().add(anulezc);
		
		/////Butoane frame Cumparare
		JButton continua1 = new JButton("CONTINUA");
		continua1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		continua1.setBounds(629, 441, 269, 52);
		Cumparare.getContentPane().add(continua1);
		
		JButton meniu_principal = new JButton("Meniu principal");
		meniu_principal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		meniu_principal.setBounds(629, 519, 269, 52);
		Cumparare.getContentPane().add(meniu_principal);
		
		/////Butoane frame Beneficii
		JRadioButton GustariDa = new JRadioButton("DA");
		GustariDa.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		GustariDa.setBackground(new Color(196, 255, 255));
		GustariDa.setBounds(823, 273, 72, 21);
		Beneficii.getContentPane().add(GustariDa);
		
		JRadioButton CafeaDa = new JRadioButton("DA");
		CafeaDa.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		CafeaDa.setBackground(new Color(196, 255, 255));
		CafeaDa.setBounds(823, 346, 65, 21);
		Beneficii.getContentPane().add(CafeaDa);
		
		JRadioButton BauturiDa = new JRadioButton("DA");
		BauturiDa.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		BauturiDa.setBackground(new Color(196, 255, 255));
		BauturiDa.setBounds(823, 414, 72, 21);
		Beneficii.getContentPane().add(BauturiDa);
		
		ButtonGroup bg_gustari = new ButtonGroup();
		bg_gustari.add(GustariDa);

		ButtonGroup bg_cafea = new ButtonGroup();
		bg_cafea.add(CafeaDa);

		ButtonGroup bg_bauturi = new ButtonGroup();
		bg_bauturi.add(BauturiDa);


		JButton continua2 = new JButton("CONTINUA");
		continua2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		continua2.setBounds(620, 498, 332, 43);
		Beneficii.getContentPane().add(continua2);
		
		JButton meniu_anterior = new JButton("PAGINA ANTERIOARA");
		meniu_anterior.setFont(new Font("Tahoma", Font.PLAIN, 30));
		meniu_anterior.setBounds(620, 564, 332, 43);
		Beneficii.getContentPane().add(meniu_anterior);
		
		JButton meniu_principal2 = new JButton("MENIU PRINCIPAL");
		meniu_principal2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		meniu_principal2.setBounds(620, 630, 332, 43);
		Beneficii.getContentPane().add(meniu_principal2);
		
		/////Butoane frame PretFinal
		JButton anulezfinal = new JButton("ANULEZ");
		anulezfinal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		anulezfinal.setBounds(578, 477, 317, 58);
		PretFinal.getContentPane().add(anulezfinal);
		
		JButton continua3 = new JButton("Confirm cumparare");
		continua3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		continua3.setBounds(578, 390, 317, 58);
		PretFinal.getContentPane().add(continua3);
		
		/////Butoane frame AnulareRezervare
		JButton meniuprincipal3 = new JButton("MENIU PRINCIPAL");
		meniuprincipal3.setFont(new Font("Tahoma", Font.BOLD, 23));
		meniuprincipal3.setBounds(607, 499, 332, 58);
		AnulareRezervare.getContentPane().add(meniuprincipal3);
		
		JButton anuleaza_rezervare = new JButton("ANULEAZA REZERVARE");
		anuleaza_rezervare.setFont(new Font("Tahoma", Font.BOLD, 23));
		anuleaza_rezervare.setBounds(607, 405, 332, 58);
		AnulareRezervare.getContentPane().add(anuleaza_rezervare);
		
		
		//adaugare functionalitate pe butoane
		/////pentru butoanele din frame Principal
		//butonul cumpar va reseta la 0 valoarea de pe textfields si ne va duce pe urmatorul frame
		cumpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					nr_bil_ec.setText("0");
					nr_bil_bs.setText("0");
					Principal.setVisible(false);
					Cumparare.setVisible(true);
				
			}
		});
		
		//butonul anulezb ne va duce pe frame-ul pentru anularea rezervarii
		anulezb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal.setVisible(false);
				AnulareRezervare.setVisible(true);
			}
		});
		
		//butonul anulezc v-a inchide cererea
		anulezc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal.setVisible(false);
			}
		});
		

		/////pentru butoanele din frame Cumparare
		//butoanele meniu principal ne vor duce la farme-ul Principal
		meniu_principal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cumparare.setVisible(false);
				Principal.setVisible(true);
			}
		});
		
		//butonul continua1 ii va duce pe utilizatorii care au cerut bilete economy pe pagine unde isi vor selecta beneficiile
		//de asemenea, tot aici se v-a calcula si pretul in cazul in care nu se vor cere bilete economy, caz in care utilizatorii vor fi dusi in ultimul frame
		continua1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	nr_bil_economy_cerute=nr_bil_ec.getText();
				int txt = Integer.valueOf(nr_bil_economy_cerute);
				if(Integer.parseInt(nr_bil_economy_cerute )>0) {
						Cumparare.setVisible(false);
						Beneficii.setVisible(true);
					}
				else if(Integer.parseInt(nr_bil_economy_cerute )==0)
				{
					String nr_bil_bussiness_cerute=nr_bil_bs.getText();
					System.out.println("bs: "+nr_bil_bussiness_cerute);
					int txt1 = Integer.valueOf(nr_bil_bussiness_cerute);
					int pret = txt1*plane.getpret_bussiness();
					System.out.println("pret: "+pret);
					pret_final.setText(String.valueOf(pret));
							
					Cumparare.setVisible(false);
					PretFinal.setVisible(true);
				}
			}
							
		});
				
		/////pentru frame AnulareRezervare
		meniuprincipal3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					AnulareRezervare.setVisible(false);
					Principal.setVisible(true);					
				}
			});
			
		//butonul anuleaza rezervare v-a actualiza nr de bilete disponibile dupa ce se vor returna de catre utilizator
		anuleaza_rezervare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String retur_ec = bil_ret_ec.getText();
					int ret1 = Integer.valueOf(retur_ec);
					plane.actualizare_economy_retur(ret1);
					String retur_bs = bil_ret_bs.getText();
					int ret2 = Integer.valueOf(retur_bs);
					plane.actualizare_bussiness_retur(ret2);
					nr_bilete.setText("Mai sunt disponibile " +  plane.getlocuri_libere_economy() + " bilete economy class si " + plane.getlocuri_libere_bussiness() + " bilete bussiness class");
					bil_ret_ec.setText("0");
					bil_ret_bs.setText("0");
					AnulareRezervare.setVisible(false);
					Principal.setVisible(true);
				}
			});
				
		/////pentru frame Beneficii
		//butonul continua2 va calcula pentru utilizatorii ce doresc bilete economy, pretul in functie de beneficiile suplimentare dorite
		continua2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	nr_bil_economy_cerute = nr_bil_ec.getText();
				int txt = Integer.valueOf(nr_bil_economy_cerute);
				
				String nr_bil_bussiness_cerute=nr_bil_bs.getText();
				int txt1 = Integer.valueOf(nr_bil_bussiness_cerute);
				
				if (GustariDa.isSelected() && CafeaDa.isSelected() && BauturiDa.isSelected())
				{
					int pret = txt*(plane.getpret_economy()+plane.getpret_gustari()+plane.getpret_cafea()+plane.getpret_bauturi())+txt1*plane.getpret_bussiness();
					pret_final.setText(String.valueOf(pret) + " RON");
				}
				else if(GustariDa.isSelected() && CafeaDa.isSelected())
				{
					int pret = txt*(plane.getpret_economy()+plane.getpret_gustari()+plane.getpret_cafea())+txt1*plane.getpret_bussiness();
					pret_final.setText(String.valueOf(pret) + " RON");
				}
				
				else if(CafeaDa.isSelected() && BauturiDa.isSelected())
				{
					int pret =txt*(plane.getpret_economy()+plane.getpret_cafea()+plane.getpret_bauturi())+txt1*plane.getpret_bussiness();
					pret_final.setText(String.valueOf(pret) + " RON");
				}
				
				else if(GustariDa.isSelected()&&BauturiDa.isSelected())
				{
					int pret = txt*(plane.getpret_economy()+plane.getpret_gustari()+plane.getpret_bauturi())+txt1*plane.getpret_bussiness();
					pret_final.setText(String.valueOf(pret) + " RON");
				}
				
				else if(GustariDa.isSelected())
				{
					int pret = txt*(plane.getpret_economy()+plane.getpret_gustari())+txt1*plane.getpret_bussiness();
					pret_final.setText(String.valueOf(pret) + " RON");
				}
				
				else if(CafeaDa.isSelected())
				{
					int pret = txt*(plane.getpret_economy()+plane.getpret_cafea())+txt1*plane.getpret_bussiness();
					pret_final.setText(String.valueOf(pret) + " RON");
				}
				
				else if(BauturiDa.isSelected())
				{
					int pret = txt*(plane.getpret_economy()+plane.getpret_bauturi())+txt1*plane.getpret_bussiness();
					pret_final.setText(String.valueOf(pret) + " RON");
				}
				
				Beneficii.setVisible(false);
				PretFinal.setVisible(true);
					}
				
		});
		
		//butoanele meniu anterior ne vor dupa la frame-ul anterior
		meniu_anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Beneficii.setVisible(false);
				Cumparare.setVisible(true);
			}
		});
		
		meniu_principal2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Beneficii.setVisible(false);
				Principal.setVisible(true);
			}
		});
		
		/////pentru frame PretFinal
		//utilizatorul are posibilitatea de a anula cererea daca nu ii convine pretul final
		anulezfinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PretFinal.setVisible(false);
				Principal.setVisible(true);
			}
		});
		
		//butonul continua3 confirma cumpararea, actualizeaza nr de locuri disponibile si v-a sterge preferintele utilizatorului anterior
		continua3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	nr_bil_economy_cerute=nr_bil_ec.getText();
				System.out.println("ec:"+nr_bil_economy_cerute);
				int txt = Integer.valueOf(nr_bil_economy_cerute);
				
				String nr_bil_bussiness_cerute=nr_bil_bs.getText();
				System.out.println("bs: "+nr_bil_bussiness_cerute);
				int txt1 = Integer.valueOf(nr_bil_bussiness_cerute);
				plane.actualizare_locuri_bussiness(txt1);
				plane.actualizare_locuri_economy(txt);
				nr_bilete.setText("Mai sunt disponibile " +  plane.getlocuri_libere_economy() + " bilete economy class si " + plane.getlocuri_libere_bussiness() + " bilete bussiness class");
				
				bg_gustari.clearSelection();
				bg_cafea.clearSelection();
				bg_bauturi.clearSelection();
				PretFinal.setVisible(false);
				Principal.setVisible(true);
					}
				
		});
	
		/////CREARE FRAME LOGIN
		Login = new JFrame();
		Login.getContentPane().setBackground(new Color(196, 255, 255));
		Login.getContentPane().setLayout(null);
		
		/////adaugare poza frame loogin
		Container c5 = Login.getContentPane();
		JLabel label10 = new JLabel();
		label10.setIcon(new ImageIcon("C:\\Users\\muste\\eclipse-workspace\\SingletonDesignPattern\\SingletonDesignPattern\\src\\Proiect\\poze\\plane2.png"));
		label10.setBounds(-194, 573, 1334, 348);
		c5.add(label10);
		
		/////adaugare texte frame login
		JLabel titlu_login = new JLabel("Bun Venit la PIP AIRWAYS\r\n");
		titlu_login.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 77));
		titlu_login.setBounds(313, 47, 1131, 93);
		Login.getContentPane().add(titlu_login);
		
		JLabel text_login = new JLabel("Pentru a continua te rugam sa completezi datele contului tau\r\n");
		text_login.setFont(new Font("Times New Roman", Font.BOLD, 27));
		text_login.setBounds(401, 150, 741, 34);
		Login.getContentPane().add(text_login);
		
		textlogin = new JLabel("Conectare nereusita! Reintrodu datele contului tau!\r\n");
		textlogin.setForeground(new Color(255, 0, 0));
		textlogin.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textlogin.setBounds(525, 545, 556, 43); 
		textlogin.setVisible(false);
		
		JLabel text_username = new JLabel("Introduceti username:\r\n");
		text_username.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		text_username.setBounds(514, 250, 190, 25);
		Login.getContentPane().add(text_username);
		
		JLabel text_password = new JLabel("Introduceti password:\r\n");
		text_password.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		text_password.setBounds(514, 326, 190, 25);
		Login.getContentPane().add(text_password);
		
		/////adaugare TextField frame login
		usertext = new JTextField();
		usertext.setFont(new Font("Times New Roman", Font.BOLD, 22));
		usertext.setBounds(714, 240, 324, 43);
		Login.getContentPane().add(usertext);
		usertext.setColumns(10);
		
		passtext = new JTextField();
		passtext.setFont(new Font("Times New Roman", Font.BOLD, 22));
		passtext.setColumns(10);
		passtext.setBounds(714, 316, 324, 43);
		Login.getContentPane().add(passtext);
		
		/////adaugare buton si functionalitate buton frame login
		JButton loginbtn = new JButton("LOG IN\r\n");
		loginbtn.setFont(new Font("Times New Roman", Font.BOLD, 26));
		loginbtn.setBounds(636, 425, 246, 50);
		Login.getContentPane().add(loginbtn);
		
		//butonul log in va citi din textfield username-ul si parola introduse de user
		//v-a apela metoda de verificare a utilizatorului cu ajutorul intantei user
		//v-a verifica daca in baza de date (fisiere text) exista username-ul si parola si v-a trece la pagina principala daca exista
		//in caz contrare utilizatorul v-a fi rugat sa reintroduca username-ul si parola
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = usertext.getText();
				System.out.println("un:"+un);
				String pw = passtext.getText();
				char username[] = new char[un.length()];
				char password[] = new char[pw.length()];
				
				for(int i = 0; i<un.length(); i++) {
					username[i]=un.charAt(i);
				}
				
				for(int i=0; i<pw.length();i++) {
					password[i]=pw.charAt(i);
				}
				int aux=0;
				
				System.out.println("aux m: "+aux);
				if(user.verify_user(username, password, aux)==1) {
					System.out.println("conectare reusita din buton");
					Login.setVisible(false);
					Principal.setVisible(true);
				}
				else if(user.verify_user(username, password, aux)==0) {
					textlogin.setVisible(true);
					usertext.setText("");
					passtext.setText("");
					
				}
			}
		});

		Login.getContentPane().add(textlogin);
		
		Login.setBackground(new Color(196, 255, 255));
		Login.setBounds(0, 0, 1540, 855);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Login.setVisible(false);
		
		
	}
}
