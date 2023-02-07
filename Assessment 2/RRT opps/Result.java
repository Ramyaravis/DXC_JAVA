package RRT_OPPS;

public class Result {
	

		public static void main(String[] args) {
			RegularCourse course=new RegularCourse("Rakesh","JEE",85,5);
			System.out.println("Regular Course Registration Details");
			System.out.println("************");
			System.out.println("Student Name :"+course.getStudentname());
			System.out.println("Course Name :"+course.getCoursename());
			System.out.println("Course Duration :"+course.getDuration());
			System.out.println("Registration Id :"+course.getRegistrationid());
			System.out.println("Fees :"+course.calculate(0));
			System.out.println();
			crashCourse course1=new crashCourse("Roshan","Angular",71);
			System.out.println("Crash Course Registration Details");
			System.out.println("************");
			System.out.println("Student Name :"+course1.getStudentname());
			System.out.println("Course Name :"+course1.getCoursename());
			System.out.println("Registration Id :"+course1.getRegistrationid());
			System.out.println("Fees :"+course1.calculate(0));

		}

	}

}
