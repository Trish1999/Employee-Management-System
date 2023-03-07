package awtproject.bean;


		import java.io.Serializable;

		public class User implements Serializable {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private String username;
			private  String password;
			private  int age;
				private  int id;
			private  String department;
				public  String getUsername() {
					return username;
				}
				public void setUsername(String username) {
					this.username = username;
				}
				public  String getPassword() {
					return password;
				}
				public void setPassword(String password) {
					this.password = password;
				
				}
				public  int getAge() {
					return age;
				}
				public void setAge(int age) {
					this.age = age;
				}
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				
					public String getDepartment() {
						return department;
					}
					public void setDepartment(String department) {
						this.department = department;
				
			}
	}

