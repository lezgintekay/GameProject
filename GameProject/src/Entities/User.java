package Entities;

public class User {

	


		private int userId;
		private String firstName;
		private String lastName;
		private String nationalityId;
		private int birthYear;
		private String email;
		
		public User(int userId, String firstName, String lastName, String nationalityId, int birthYear, String email) {
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalityId = nationalityId;
			this.birthYear = birthYear;
			this.email = email;
		}

		public int getuserId() {
			return userId;
		}

		public void setPlayerId(int userId) {
			this.userId = userId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getNationalityId() {
			return nationalityId;
		}

		public void setNationalityId(String nationalityId) {
			this.nationalityId = nationalityId;
		}

		public int getBirthYear() {
			return birthYear;
		}

		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
	}

	
	
	
	

