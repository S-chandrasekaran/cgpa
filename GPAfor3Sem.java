import java.io.*;
import java.util.*;
class GPAfor3Sem{
public static void main(String h[]) throws Exception {
	System.out.println("__________________________________________\n\t\tGPA CALCULATOR \n__________________________________________");
	System.out.println(" SEMESTER :: 3 \n DEPARTMENT :: CSE \n REGULATION :: 2022\n__________________________________________");
	gpa g= new gpa();
	g.input();
	g.calculate();
    }
}

class gpa{
	void input()throws Exception{
		long regno; String name; String dept; int yr; String section;
		DataInputStream di= new DataInputStream(System.in);
		System.out.println("Enter your Register Number ::");
		regno=Long.parseLong(di.readLine());
		System.out.println("Enter your Name ::");
		name=di.readLine();
		System.out.println("Enter your Department Name ::");
		dept=di.readLine();
		System.out.println("Enter your Current Year ::");
		yr=Integer.parseInt(di.readLine());
		System.out.println("Enter your Section ::");
		section=di.readLine();
}
	void calculate() throws Exception{
		/*Discrete Maths - dm
		Digital Principles & Computer Organisation - dpco
		Software Engineering - se
		Object Oriented Programming - oop
		Data Structures - ds
		Data Structures laboratory - dsl
		Object Oriented Programming laboratory - oopl
		Professional Developement Laboratory - pdl
		Value Added Course - vac*/
		String dm,dpco,se,oop,ds,dsl,oopl,pdl,vac;
		DataInputStream di= new DataInputStream(System.in);
		System.out.println("Enter the grades that you've obtained.....\nEnter Grades in Capital Letters only\n________________________________________");
		System.out.println("Discrete Mathematics :: ");
		dm=di.readLine();
		int dm_pts=0;
			switch(dm){
				case "O":
					dm_pts=10*4;
					break;
				case "A+":
					dm_pts=9*4;
					break;
				case "A":
					dm_pts=8*4;
					break;
				case "B+":
					dm_pts=7*4;
					break;
				case "B":
					dm_pts=6*4;
					break;
				case "C":
				    dm_pts=5*4;
				    break;
		}
		System.out.println("Digital Principles and Computer Organisation :: ");
		dpco=di.readLine();
		int dpco_pts=0;
					switch(dpco){
						case "O":
							dpco_pts=10*4;
							break;
						case "A+":
							dpco_pts=9*4;
							break;
						case "A":
							dpco_pts=8*4;
							break;
						case "B+":
							dpco_pts=7*4;
							break;
						case "B":
							dpco_pts=6*4;
							break;
						case "C":
						    dpco_pts=5*4;
						    break;
		}
		System.out.println("Software Engineering :: ");
		se=di.readLine();
		int se_pts=0;
					switch(se){
						case "O":
							se_pts=10*3;
							break;
						case "A+":
							se_pts=9*3;
							break;
						case "A":
							se_pts=8*3;
							break;
						case "B+":
							se_pts=7*3;
							break;
						case "B":
							se_pts=6*3;
							break;
						case "C":
						    se_pts=5*3;
						    break;
		}
		System.out.println("Object Oriented Programming :: ");
		oop=di.readLine();
		int oop_pts=0;
							switch(oop){
								case "O":
									oop_pts=10*3;
									break;
								case "A+":
									oop_pts=9*3;
									break;
								case "A":
									oop_pts=8*3;
									break;
								case "B+":
									oop_pts=7*3;
									break;
								case "B":
									oop_pts=6*3;
									break;
								case "C":
								    oop_pts=5*3;
								    break;
		}
		System.out.println("Data Structures :: ");
		ds=di.readLine();
		int ds_pts=0;
							switch(ds){
								case "O":
									ds_pts=10*3;
									break;
								case "A+":
									ds_pts=9*3;
									break;
								case "A":
									ds_pts=8*3;
									break;
								case "B+":
									ds_pts=7*3;
									break;
								case "B":
									ds_pts=6*3;
									break;
								case "C":
								    ds_pts=5*3;
								    break;
		}
		System.out.println("Data Structures using C++ Laboratory :: ");
		dsl=di.readLine();
		double dsl_pts=0;
									switch(dsl){
										case "O":
											dsl_pts=15;
											break;
										case "A+":
											dsl_pts=13.5;
											break;
										case "A":
											dsl_pts=8*1.5;
											break;
										case "B+":
											dsl_pts=7*1.5;
											break;
										case "B":
											dsl_pts=6*1.5;
											break;
										case "C":
										    dsl_pts=5*1.5;
										    break;
		}
		System.out.println("Object Oriented Programming Laboratory :: ");
		oopl=di.readLine();
		double oopl_pts=0;
											switch(oopl){
												case "O":
													oopl_pts=10*1.5;
													break;
												case "A+":
													oopl_pts=9*1.5;
													break;
												case "A":
													oopl_pts=8*1.5;
													break;
												case "B+":
													oopl_pts=7*1.5;
													break;
												case "B":
													oopl_pts=6*1.5;
													break;
												case "C":
												    oopl_pts=5*1.5;
												    break;
		}
		System.out.println("Professional Development Laboratory :: ");
		pdl=di.readLine();
		int pdl_pts=0;
											switch(pdl){
												case "O":
													pdl_pts=10*1;
													break;
												case "A+":
													pdl_pts=9*1;
													break;
												case "A":
													pdl_pts=8*1;
													break;
												case "B+":
													pdl_pts=7*1;
													break;
												case "B":
													pdl_pts=6*1;
													break;
												case "C":
												    pdl_pts=5*1;
												    break;
		}
		System.out.println("Value Added course :: ");
		vac=di.readLine();
		int vac_pts=0;
											switch(vac){
												case "O":
													vac_pts=10*1;
													break;
												case "A+":
													vac_pts=9*1;
													break;
												case "A":
													vac_pts=8*1;
													break;
												case "B+":
													vac_pts=7*1;
													break;
												case "B":
													vac_pts=6*1;
													break;
												case "C":
												    vac_pts=5*1;
												    break;
		}
		double sum=0;
		sum=dm_pts+dpco_pts+se_pts+oop_pts+ds_pts+dsl_pts+oopl_pts+pdl_pts+vac_pts;
		double avg=0;
		avg=sum/22;
		System.out.println("_______________________________________\nCongratulations.....\nYour GPA for Semester 3 is....."+avg);
		/*		Grades::
				Discrete Maths - 4
				Digital Principles & Computer Organisation - 4
				Software Engineering - 3
				Object Oriented Programming - 3
				Data Structures - 3
				Data Structures laboratory - 1.5
				Object Oriented Programming laboratory - 1.5
				Professional Developement Laboratory - 1
				Value Added Course - 1*/
	}

}
