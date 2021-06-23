package secondDayHomework1;


public class Main {

	public static void main(String[] args) {

		Course course1=new Course();
		course1.id=1;
		course1.name="Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course1.instructorName="Engin DEMÝROÐ";
		
		Course course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin DEMÝROÐ");
		
		Course course3=new Course();
		course3.id=3;
		course3.name="Programlamaya Giriþ için Temel Kurs";
		course3.instructorName="Engin DEMÝROÐ";
		
		Course[] courses= {course1,course2,course3};
		for (Course course:courses) {
			System.out.println(course.name);
		}
		
		Instructor instructor1=new Instructor(1,"Engin DEMÝROÐ");
		
		Instructor[] instructors= {instructor1};
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course1);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addInstructor(instructor1);
		
	}

}
