import java.io.*;

public class Student 
{
	 private String[] Student_Names= new String[5];
	 private char[] Grade = new char[5];
	 private double Marks[][] = new double[5][4];
	 public void Input(int i)throws IOException
	 {
		 BufferedReader BR_Object=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the name of Student "+(i+1)+" : ");
		 Student_Names[i]=BR_Object.readLine();
		 System.out.println("Enter the marks in 4 subjects : ");
		 for(int a=0;a<4;++a)
		 {
			 Marks[i][a]=Integer.parseInt(BR_Object.readLine());
		 }
	 }
	 public String getName(int i)
	 {
		return Student_Names[i];
	 }
	 public double getAverage(int a)
	 {
		double sum=0.0;
		for(int i=0;i<4;++i)
		{
			sum=sum+Marks[a][i];
		}
		return (sum/4);
	 }
	 public char getGrade(double avg,int i)
	 {
		if(avg<=100 && avg>=90)
		{
			Grade[i]='A';
			return Grade[i];
		}
		else if(avg<90 && avg>=80)
		{
			Grade[i]='B';
			return Grade[i];
		}
		else if(avg<80 && avg>=70)
		{
			Grade[i]='C';
			return Grade[i];
		}
		else if(avg<70 && avg>=60)
		{
			Grade[i]='D';
			return Grade[i];
		}
		else if(avg<60 && avg>=50)
		{
			Grade[i]='E';
			return Grade[i];
		}
			Grade[i]='F';
			return Grade[i];
	 }
	 public static void main(String[] args)throws IOException
	 {
		 Student Object=new Student();
		 int i;
		 for(i=0;i<5;++i)
			 Object.Input(i);
		 for(i=0;i<5;++i)
		 {
			 System.out.println("Student "+(i+1)+" :");
			 System.out.println("Name : "+Object.getName(i));
			 double average=Object.getAverage(i);
			 System.out.println("Average Score : "+average);
			 System.out.println("Grade : "+Object.getGrade(average,i));
		 } 
	 }
}
