package com.lti.oops.basics;

public class TestStudent {

	public static void main(String[] args) {
		
		/*Student[] s=new Student[3];
		for(int i=0;i<3;i++)
		{
			s[i]=new Student();
			s[i].setStu_id(id);//id input from user
		}*/

		Student s1 = new Student();
		s1.setStu_id(101);
		s1.setStu_name("Jay");
		s1.setStu_fees(1000.00f);
		System.out.println(s1.getStu_id());
		System.out.println(s1.getStu_name());
		System.out.println(s1.getStu_fees());

		Student s2 = new Student();
		s2.setStu_id(103);
		s2.setStu_name("Vijay");
		s2.setStu_fees(3000.00f);
		System.out.println(s2.getStu_id());
		System.out.println(s2.getStu_name());
		System.out.println(s2.getStu_fees());

	}

}
