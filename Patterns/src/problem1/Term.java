package problem1;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Term {

	private String name; // e.g. "Spring"

	private int year; // e.g. 2025

	private Set<CourseIF> courses = new HashSet<CourseIF>();

	public Term(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public boolean addCourse(CourseIF course) {
		return courses.add(course);
	}

	public boolean hasCourse(CourseIF course) {
		return courses.contains(course);
	}

	public String toString() {
		return name + " " + year;
	}

	public void print(PrintStream out) {
		out.println(this + ":");
		for (CourseIF course : courses)
			out.println("  " + course.toStringLong());
	}
	
	public Collection<CourseIF> getCoursesWithCode(String code) {
		List<CourseIF> result = new LinkedList<CourseIF>();
		for (CourseIF course : courses)
			if (code.equals(course.getCode()))
				result.add(course);
		return result;
	}

}
