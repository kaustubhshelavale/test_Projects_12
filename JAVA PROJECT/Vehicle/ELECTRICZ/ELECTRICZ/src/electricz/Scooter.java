package electricz;

import java.util.ArrayList;
import java.util.Scanner;

public class Scooter extends TwoWheeler 
{
	
	public void sco1()
	{
		ArrayList lk=new ArrayList();
		lk.add("1 for Ola Electric");
		lk.add("2 for Ather Energy ");
		lk.add("3 for Bajaj");
		lk.add("4 for TVS Mpotor");
		ArrayList pl=new ArrayList();
		pl.add("5 for Simple Energy");
		pl.add("6 for Hero Electric");
		pl.add("7 for Bounce Infinity");
		System.out.println(lk);
		System.out.println(pl);
		System.out.println("==========================================================================================");
	}
	
	public void sco2(int ch)
	{
		switch(ch)
		{
		case 1: olaElectric();
		break;
		case 2: atherEnergy();
		break;
		case 3: bajaj();
		break;
		case 4: tvsMotor();
		break;
		case 5: simpleEnergy();
		break;
		case 6: heroElectric();
		break;
		case 7: bounceInfinity();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}

	public void scooter()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
		sco1();
	int ch=m.nextInt();
	if(ch<8)
	{
		sco2(ch);
	}
	else if(ch>8)
	{
		System.out.println("please choose correct option");
		System.out.println("===========================================================");
		sco1();
		System.out.println("===========================================================");
		int n=m.nextInt();
		sco2(ch);

	}
}
	
	public void olaElectric()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
	ArrayList lk=new ArrayList();
	lk.add("1 for Ola S1");
	lk.add("2 for Ola S1 Pro1");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<3)
	{
		switch(ch)
		{
		case 1: s1();
		break;
		case 2: s1Pro();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}
	public  void s1() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Ola S1 ==========");
		}driver();
	}
	public  void s1Pro() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Ola S1 Pro ==========");
		}driver();
		
		
	}
	public  void atherEnergy()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
	ArrayList lk=new ArrayList();
	lk.add("1 for Ather 450X");
	lk.add("2 for Ather 450 Plus");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<3)
	{
		switch(ch)
		{
		case 1: ather450X();
		break;
		case 2: ather450Plus();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}
	public  void ather450X()
	{
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Ather 450X ==========");
		}driver();
		}
	public  void ather450Plus()
	{
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Ather 450 Plus ==========");
		}driver();
		}
	public  void bajaj()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
	ArrayList lk=new ArrayList();
	lk.add("1 for Chetak");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<2)
	{
		switch(ch)
		{
		case 1:chetak();
		break;
		default :System.out.println("please choose correct option");
		break;
		}
	}
	}
	public  void chetak() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Bajaj Chetak EV ==========");
		}driver();
	}
	public  void tvsMotor()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
	ArrayList lk=new ArrayList();
	lk.add("1 for Tvs iQube");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<2)
	{
		switch(ch)
		{
		case 1:iQube();
		break;
		default :System.out.println("please choose correct option");
		break;
		}
	}
	}
	public  void iQube() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing TVS iQube ==========");
		}driver();
	}
	public  void simpleEnergy()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
	ArrayList lk=new ArrayList();
	lk.add("1 for Simple One");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<2)
	{
		switch(ch)
		{
		case 1:simpleOne();
		break;
		default :System.out.println("please choose correct option");
		break;
		}
	}
	}
	public  void simpleOne() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Simple One ==========");
		}driver();
	
	}
	public  void heroElectric()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
	ArrayList lk=new ArrayList();
	lk.add("1 for Photon Hx");
	lk.add("2 for Optima CX");
	lk.add("3 for NYX HX");
	lk.add("4 for Optima LX");
	lk.add("5 for Atrica LX");
	lk.add("6 for Flash LX");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<2)
	{
		switch(ch)
		{
		case 1:photonHX();
		break;
		case 2:optimaCX();
		break;
		case 3:nyxHX();
		break;
		case 4:optimaLX();
		break;
		case 5:atricaLX();
		break;
		case 6:flashLX();
		break;
		default :System.out.println("please choose correct option");
		break;
		}
	}
	}
	public  void photonHX() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Hero Photon HX ==========");
		}driver();
	}
	public  void optimaCX() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Hero Optima CX ==========");
		}driver();
	}
	public  void nyxHX() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Hero NYX HX ==========");
		}driver();
	}
	public  void optimaLX() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Hero Optima LX ==========");
		}driver();
	}
	public  void atricaLX() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Hero Atrica LX ==========");
		}
		driver();
	}
	public  void flashLX() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Hero Flash LX ==========");
		}
		driver();
	}
	public void bounceInfinity()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
	ArrayList lk=new ArrayList();
	lk.add("1 for Bounce Infinity E1");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<2)
	{
		switch(ch)
		{
		case 1:e1();
		break;
		default :System.out.println("please choose correct option");
		break;
		}
	}
	}
	public void e1() {
		color();
		purchase();
		System.out.println("Please Enter OTP");
		Scanner m=new Scanner(System.in);
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Bounce Infinity E1 ==========");
		}
		driver();
	}
	
	public  void driver()
	{
		Electricz cz=new ThreeWheeler();
		cz.bye();
	}
}
