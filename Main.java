// Dakota Mitchem
// CS 202 Section 002
// Assignment 9.1

public class Main {

	public static void main(String[] args) {
		Employee Jim = new Employee();
		Jim.goToWork();
		Jim.goofAround();
		
		Doctor Tom = new Doctor();
		Tom.checkup();
		Tom.rectalExam();
		
		Surgeon Zed = new Surgeon();
		Zed.surgery();
		Zed.cleanUp();
		
		Receptionist Carol = new Receptionist();
		Carol.answerPhone();
		Carol.scheduleAppointment();
		
		Janitor Carl = new Janitor();
		Carl.cleanSpill();
		Carl.fixLightBulb();
	}

}
