//University

import java.util.Scanner;

abstract class University
{
	public String name;
	public String department[] = new String[3];
	public static int maxStudents[] = {10,10,10,10,10,10};
	University()
	{
		for(int i=0;i < 3;i++)
		{
			department[i] = new String();
		}
		department[0] = " ";
		department[1] = " ";
		department[2] = " ";
	}
	University(String s1,String s2,String s3)
	{
		for(int i=0;i < 3;i++)
		{
			department[i] = new String();
		}
		department[0] = s1;
		department[1] = s2;
		department[2] = s3;
	}
	abstract void display();
}

class SoC extends University
{
	SoC(){
		super("CSE","IT","ICT");
	}
	void display()
	{
		for(int i = 0;i < 3;i ++)
		{
			System.out.println("SoC....");
			System.out.println("Department : "+department[i]);
			System.out.println("Max Students allowed : "+maxStudents[i]);
		}
	}
}

class SEEE extends University
{
	SEEE(){
		super("ECE","EEE","EIE");
	}
	void display()
	{
		for(int i = 0;i<3;i++)
		{
			System.out.println("SEEE....");
			System.out.println("Department : "+department[i]);
			System.out.println("Max Students allowed : "+maxStudents[i+3]);
		}
	}
}

class Student
{
	int stuId;
	String sName;
	double perc;
	public University admittedSchool;
	Student(){}
	Student(int stuId,String sName,double perc)
	{
		this.stuId = stuId;
		this. sName= sName;
		this. perc= perc;
		if((double)perc/10 >= 9.0)
		{
			admittedSchool = new SoC();
			SoC.maxStudents[0] --;
		}
		else if((double)perc/10 >= 8.5)
		{
			admittedSchool = new SoC();
			SoC.maxStudents[1] --;
		}
		else if((double)perc/10 >= 8)
		{
			admittedSchool = new SEEE();
			SEEE.maxStudents[3] --;
		}
		else if((double)perc/10 >= 7.5)
		{
			admittedSchool = new SoC();
			SoC.maxStudents[2] --;
		}
		else if((double)perc/10 >= 7)
		{
			admittedSchool = new SEEE();
			SEEE.maxStudents[4] --;
		}
		else if((double)perc/10 >= 6.5)
		{
			admittedSchool = new SEEE();
			SEEE.maxStudents[5] --;
		}
		else
		{
			System.out.println("Your're not eleigible to get into this University");
			admittedSchool = new SEEE();
		}
	}
}

class UniversityDemo
{
	public static void main(String args[])
	{
		int id,i;
		String name;
		double per; 
		Student s[] = new Student[10];
		Scanner scan = new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("Enter Student's id name percentage : ");
			id = scan.nextInt();
			name = scan.next();
			per = scan.nextDouble();
			s[i] = new Student(id,name,per);
			s[i].admittedSchool.display();
		}	
	}
}