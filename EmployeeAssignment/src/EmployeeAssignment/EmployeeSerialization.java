package EmployeeAssignment;

import java.io.*;
public class EmployeeSerialization {
public static void main(String[] args) throws IOException{
	Employee e1 = new Employee(1, "Johny");
	Employee e2 = new Employee(2, "Jake");
	Employee e3 = new Employee(3, "Kat");
	Employee e4 = new Employee(4, "Harris");
	FileOutputStream fos;
	FileInputStream fis;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	
	//serialization, writing employee
	try {
		fos = new FileOutputStream("employees.dat");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		oos.writeObject(e4);
		
		oos.flush();
	} catch(Exception e) {
		e.printStackTrace(); 
	} finally {
		if (oos != null)
			oos.close();
	}
	
	//deserialization, reading employee
	try {
		fis = new FileInputStream("employees.dat");
		ois = new ObjectInputStream(fis);
		Employee[] empList = new Employee[4];
		empList[0] = (Employee)ois.readObject();
		empList[1] = (Employee)ois.readObject();
		empList[2] = (Employee)ois.readObject();
		empList[3] = (Employee)ois.readObject();
		
		
		for (Employee e : empList)
			System.out.println(e.getName() + " " + e.getId());
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (ois != null) {
			ois.close();
		}
	}
	
}
}
