
public class Student {
	private String name;
	private String surname;
	
	/**
	 * creates a student with no parameters
	 */
	public Student() {
		this.name = " ";
		this.surname = " ";
	}
	
	/**
	 * creates student with all of the parameters
	 * @param name String name of the student
	 * @param surname String surname of the student
	 */
	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	

	/**
	 * gets the name of the student
	 * @return name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of the student
	 * @throws IllegalArgumentException("Student must have a name! ")
	 * @param name String name of the student
	 */
	public void setName(String name) {
		if(isEmptyString(name.length()))
		{
			throw new IllegalArgumentException("Student must have a name! ");
		}
		else this.name = name;
	}

	/**
	 * gets the surname of the student
	 * @return surname of the student
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * sets the surname of the student
	 * @throws IllegalArgumentException("Student must have a surname! ")
	 * @param surname String surname of the student
	 */
	public void setSurname(String surname) {
		if(isEmptyString(surname.length()))
		{
			throw new IllegalArgumentException("Student must have a surname! ");
		}
		else this.surname = surname;
	}
	
	/**
	 * checks of the given string is empty
	 * @param length int length of the string
	 * @return true or false (length < 1)
	 */
	private boolean isEmptyString(int length) {
		return length < 1;
	}
	
	/**
	 * returns a string representation of the object
	 */	
	public String toString() {
		String str = "";
		str += "Name: " + name;
		str += " Surname: " + surname;
		str += "\t";
		
		return str;
	}
	
	

}
