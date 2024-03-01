package class3;

import java.util.Arrays;

public class Student {

	private long id;
	private String name;
	private Program program;
	private String[] courses;
	private int size=0; 
	private int pointer=0;
	
public Student(long id,String name) {
	this.id=id;
	this.name=name;
	courses=new String[2];
	size=2;
}

public void setProgram(Program p) {
	this.program=p;
}
	public Program getProgram() {
		return this.program;
	}
	public void addCourse(String s) {
		if(pointer<size) {
		courses[pointer]=s;
		pointer++;
		}else {
			resize();
//			System.out.print(size);
//			courses[pointer]=s;
//			pointer++;
		}
	}
	public boolean  removeCourse(int index) {
		if(index>=size) return false;
	courses[index]=null;
	String[] newArr= new String[size];
	int x=0;
	for(int i=0;i<courses.length;i++) {
		if(courses[i]!=null) {
			newArr[x]=courses[i];
		}
	}
	courses=newArr;
	return true;
		
		
	}
	
	public void resize() {
		size=size*2;
		String[] newArr= new String[size];
		newArr=Arrays.copyOf(courses, size);
		System.out.print(newArr.length);
		courses=newArr;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st= new Student(1,"jo");
st.setProgram(Program.COMPRO);
st.addCourse("FPP");
st.addCourse("MPP");
st.addCourse("EA");
System.out.println(Arrays.toString(st.courses));
	}
	

}
