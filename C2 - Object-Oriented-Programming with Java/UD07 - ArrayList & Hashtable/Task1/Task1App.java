package Task1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Task1App {

	/*
	 *	Returns the average of all of an ArrayList's elements.
	 * 
	 *  @param	m_arraylist	The ArrayList to process; it *must* be made out of 'Floats'
	 *  @return				The calculated average of all the ArrayList's elements
	 */
	public static float m_arraylist_calc_avg(ArrayList <Float> m_arraylist) {
		float m_result = 0;
		int i;
		
		// Iterate for the entire ArrayList length...
		for (i = 0; i < m_arraylist.size(); i++)
		{
			// ..and increment the result w/each index's value
			m_result += m_arraylist.get(i);
		}
		
		// Return the result divided by the total ArrayList size (Effectively, returning the average)
		return (m_result / m_arraylist.size());
	}
	
	/*
	 *	Fills the students structures dinamically, asks the user for information such as total student
	 *	size, it's names and each of it's grades and stores them appropiately in the required structures.
	 * 
	 *  @param	m_students		The Hashtable that contains the students and it's averages
	 *  @param	m_student_marks	The ArrayList that contains the student's average
	 */
	public static void m_students_fill(Hashtable <String, Float> m_students, ArrayList <Float> m_student_marks) {
		int m_students_number, m_students_mark_size, i, j;
		String m_student_name;
		float m_student_mark;
		
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		System.out.println("Input the total number of students:");
		
		// Read the students size
		m_students_number = m_stdin_input.nextInt();
		
		System.out.println("Input the total number of marks per student:");
		
		// Read the total marks size
		m_students_mark_size = m_stdin_input.nextInt();
		
		// Do this as long as we have pending students to process
		for (i = 0; i < m_students_number; i++)
		{
			System.out.println("Input the student's name:");
			
			// Save the students name
			m_student_name = m_stdin_input.next();
			
			// Do this as long as we still have pending grades to process
			for (j = 0; j < m_students_mark_size; j++)
			{
				System.out.println("Input " + m_student_name + "'s mark number " + (j + 1) + ":");
				
				// Ask the user for the grade...
				m_student_mark = m_stdin_input.nextFloat();
				
				// ...and add it to the ArrayList
				m_student_marks.add(m_student_mark);
			}
			
			// Calculate the average mark from the filled ArrayList
			m_student_mark = m_arraylist_calc_avg(m_student_marks);
			
			/*
			 * IMPORTANT
			 * 
			 * This clears the ArrayList to calculate next student's average without affecting it's average,
			 * If we don't clean the list, the next student will have previous's student marks on the calculation too.
			 */
			m_student_marks.clear();

			// Insert the average mark and the student's name inside the HashMap
			m_students.put(m_student_name, m_student_mark);
		}

	}

	/*
	 *	Displays the finished student structure.
	 * 
	 *  @param	m_students		The Hashtable that contains the students and it's averages
	 */
	public static void m_students_show(Hashtable <String, Float> m_students) {
		m_students.forEach((m_name, m_mark) -> System.out.println(m_name + " has an average mark of " + m_mark));
	}
	
	public static void main(String[] args) {
		/*
		 * Use a Hashtable to hold the student's name and it's average mark.
		 * 
		 * We'll use floats as we don't really need a lot of precision
		 * (<= 3 decimals) and we'll see a big memory footprint difference
		 * if hashtable entries start adding up.
		 */
		Hashtable <String, Float> m_students = new Hashtable <String, Float> ();
		
		/*
		 * Use an ArrayList to store the student's marks.
		 * ArrayLists are mutable and dynamic arrays that can
		 * hold as many elements as you want; this suits this
		 * use-case because we don't exactly know how many marks
		 * the user plans to introduce.
		 * 
		 * We could also make an array based-off the input of the user
		 * with a numeric value; but an ArrayList is by far, more
		 * convenient.
		 */
		ArrayList <Float> m_student_marks = new ArrayList <Float> ();

		// Fill the students struct with data provided by the user
		m_students_fill(m_students, m_student_marks);
		
		// Show the filled students structure
		m_students_show(m_students);
	}

}
