package basic;

public class DriverOfStudent {

	public static void main(String[] args) {
		Student sarr[]=new Student[5];
		System.out.println(sarr);
		sarr[0]=new Student(12,"jeevan","bed",75.3);
		sarr[1]=new Student(14,"sravan","mtech",80.3);
		sarr[2]=new Student(22,"pradeep","engineer",55.3);
		sarr[3]=new Student(27,"pramod","docter",69.3);
		System.out.println(sarr[3]);
	}

}
