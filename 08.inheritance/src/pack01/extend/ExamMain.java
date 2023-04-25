package pack01.extend;

public class ExamMain {
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		System.out.println(pc.parent_field);
		pc.parentMethod();
		
		ChildClass cc = new ChildClass();
		System.out.println(cc.Child_field);
		cc.ChildMethod();
		
		System.out.println("ㅁㅁㅁㅁㅁㅁㅁㅁ상속후");
		System.out.println("Child : " + cc.parent_field);
	}
}
