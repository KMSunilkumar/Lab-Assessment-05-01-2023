package result;
import java.util.*;
import java.io.*;
class Books implements Serializable{
	String Authorname,Bookname;
	int isbcno;
	Books(String Authorname,String Bookname,int isbcno)
	{
		this.Authorname=Authorname;
		this.Bookname=Bookname;
		this.isbcno=isbcno;
	}
	public String toString()
	{
		return "Authorname : "+Authorname+"\n"+"Bookname : "+Bookname+"\n"+"isbcno : "+isbcno;
	}
}
class Books1{
	public static void main(String...args)throws IOException,ClassNotFoundException
	{
		LinkedHashSet<Book> l=new LinkedHashSet<Book>();
		Books b1=new Books("Jhon","Industrial revolution",2235);
		Books b2=new Books("krishnan","Subconcious strength",3546);
		Books b3=new Books("Aravind","Agriculture",7947);
		Books b4=new Books("Agarwal","Aptitude",8976);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		for(Book b:l)
		{
			System.out.println(b);
		}
		FileOutputStream fos=new FileOutputStream("D:\\Lab\\Assessment\\Books.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(l);
		oos.close();
		fos.close();
		FileInputStream fis=new FileInputStream("D:\\Lab\\Assessment\\Books.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		LinkedHashSet<Book> readObject2 = (LinkedHashSet<Book>)ois.readObject();
		LinkedHashSet<Book> readObject = readObject2;
		LinkedHashSet<Book> rd=readObject;
		ois.close();
		fis.close();
		LinkedHashSet<Book> clone = (LinkedHashSet<Book>)rd.clone();
		LinkedHashSet<Book> clo=clone;
		Iterator<Book> it=clo.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
