import java.util.*;
class  ageComparator implements Comparator<Add> 
{
	public int compare(Add obj1,Add obj2)
	{ 
		
		if(obj1.id<obj2.id)
		{
			return 1;
		}
		else if(obj1.id>obj2.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
class nameComparator implements Comparator<Add>
{
	public int compare(Add o1,Add o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}
class Add
{
	String name;
	int id;
	Add(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "Name :"+name+",  ID :"+id;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	public static void main(String args[])
	{
		ArrayList<Add> l=new<Add> ArrayList();
		Add d=new Add("Soyeb",12);
		Add d2=new Add("Asif",14);
		Add d3=new Add("Sanaya",23);

		l.add(d);
		l.add(d2);
		l.add(d3);
		Collections.sort(l,new ageComparator());
		System.out.println("Sorting Using Age :");
		for(Add l2:l)
		{
			System.out.println(l2);
		}
		System.out.println("Sorting by Name :");
		Collections.sort(l,new nameComparator());
		for(Add n2:l)
		{
			System.out.println(n2);
		}

	}
}