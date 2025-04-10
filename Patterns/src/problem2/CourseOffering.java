package problem2;

public class CourseOffering {

	private Course course;
	private Term term; // term in which this offering takes place
	private String instructor = "";
	private String building = "";
	private int room = 0; // room number
	private int capacity = 0; // max number of students

	public CourseOffering(String code, int number, String name, String termName, int year) {	
		this.course = new Course(code, number, name);
		this.term = new Term(termName, year);
		this.instructor = "";
		this.building = "";
		this.room = 0;
		this.capacity = 0;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getBuilding() {
		return building;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getRoom() {
		return room;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCode(String code) {
		this.course.setCode(code);
	}

	public String getCode() {
		return course.getCode();
	}

	public void setNumber(int number) {
		this.course.setNumber(number);
	}

	public int getNumber() {
		return course.getNumber();
	}

	public void setName(String name) {
		this.course.setName(name);
	}

	public String getName() {
		return course.getName();
	}

	public String toString() {
		return course.getCode() + course.getNumber() + ": " + course.getName() + "[term=" + term + ", instructor="
				+ instructor
				+ ", room=" + building + " " + room + ", capacity=" + capacity
				+ "]";
	}

}
