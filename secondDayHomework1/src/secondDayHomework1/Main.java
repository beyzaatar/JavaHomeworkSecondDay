package secondDayHomework1;


public class Main {

	public static void main(String[] args) {

		Course course1=new Course();
		course1.id=1;
		course1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)";
		course1.instructorName="Engin DEM�RO�";
		
		Course course2=new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin DEM�RO�");
		
		Course course3=new Course();
		course3.id=3;
		course3.name="Programlamaya Giri� i�in Temel Kurs";
		course3.instructorName="Engin DEM�RO�";
		
		Course[] courses= {course1,course2,course3};
		for (Course course:courses) {
			System.out.println(course.name);
		}
		
		Instructor instructor1=new Instructor(1,"Engin DEM�RO�");
		
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
