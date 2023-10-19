package practice;

public class Employee {

	public String name; 
	public String grade; 
	
	
	public Employee(String name) {
		this.name = name; 
	}
}

class Engineer extends Employee {
		private String skillset; 
		public String getSkillSet() {
			return skillset; 
		}

public Engineer() {
	super("이름없음");
}		
		
public void setSkillSet(String skillset) {
    	this.skillset = skillset; 
        }


}


