package result;

import java.util.*;
class Student implements Comparator<Student>{
	String sname;
	int sid,marks;
	double att;
		public int compare(Student s1, Student s2){
		return s1.sname.compareTo(s2.sname);
	}
	Student(String sname,int sid,int marks,double att)
	{
		this.sname=sname;
		this.sid=sid;
		this.marks=marks;
		this.att=att;
			}
	Student(){
	}
	public String toString()
	{
		return "Student Name :"+sname+" Student ID :"+sid+" Marks :"+marks+" Attendance :"+att;
	}
}
class MainStudent1
{
	public static void main(String...args)
	{
		LinkedList<Student> s=new LinkedList<Student>();
		Student s1= new Student("saravanan",21501,90,90.5);
		Student s2=new Student("Gopi",21502,86,70.5);
		Student s3=new Student("karthik",21503,60,65.5);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		Collections.sort(s,new Student());
		Iterator<Student> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}