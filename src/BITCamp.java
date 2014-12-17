/**
 * The assignment was that we make two classes.
 * First class is 'Student' and it has only two parameters: name and surname.
 * Second class is 'BITCamp' and it presents our classroom.
 * We need to make seating arrangement as in real life.
 * @author eminamuratovic
 *
 */
public class BITCamp {
	
	public static void main(String[] args) {
		Student[][] classroom = new Student [6][4];
		
		classroom[0][3] = new Student("Gorjan", "Kalauzovic");
		classroom[0][2] = new Student("Amra", "Poprzanovic");
		classroom[0][1] = new Student("Sanela", "Grcic");
		classroom[0][0] = new Student("Jesenko", "Gavric");
		
		classroom[1][3] = new Student("Edib", "Imamovic");
		classroom[1][2] = new Student("Nedzad", "Hamzic");
		classroom[1][1] = new Student("Emir", "Imamovic");
		classroom[1][0] = new Student("Davor", "Stankovic");
		
		classroom[2][3] = new Student("Nermin", "Graca");
		classroom[2][2] = new Student("Neldin", "Dzeko");
		classroom[2][1] = new Student("Adnan", "Alic");
		classroom[2][0] = new Student("Selma", "Tabakovic");
		
		classroom[3][3] = new Student("Mustafa", "Ademovic");
		classroom[3][2] = new Student("Haris", "Arifovic");
		classroom[3][1] = new Student("Gordan", "Sajevic");
		classroom[3][0] = new Student("Haris", "Krkalic");
		
		classroom[4][0] = new Student("Nedim", "Omerovic");
		classroom[4][1] = new Student("Hikmet", "Durgutovic");
		classroom[4][2] = new Student("Mirza", "Becic");
		classroom[4][3] = new Student("Nermin", "Vucinic");
		
		classroom[5][3] = new Student("Emina", "Muratovic");
		classroom[5][2] = new Student("prazno", "prazno");
		classroom[5][1] = new Student("prazno", "prazno");
		classroom[5][0] = new Student("Vedad", "Zornic");
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 4; j++) {
				if(j % 2 == 0 && j != 0) {
					System.out.print("\t\t");
				System.out.print(classroom[i][j].toString() );
				}
				else {
					System.out.print(classroom[i][j].toString() );
				}
			}
			System.out.println();
		}
		
	}
	
	/**
	 * adds a student in the classroom
	 * @param name String name of the student
	 * @param surname String surname of the student
	 * @return new student
	 */
	public Student addStudent(String name, String surname) {
		Student newStudent = new Student(name, surname);
		return newStudent;
	}
	
}
