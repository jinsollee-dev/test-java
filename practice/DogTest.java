package practice;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5]; 
		dog[0]= new Dog("바둑이", "진돗개");
		dog[1]= new Dog("삽사리", "삽살개");
		dog[2]= new Dog("뽀삐", "요크셔테리어"); 
		dog[3]= new Dog("두부", "포메라니안");
		dog[4]= new Dog("구름", "치와와");
		
		for(int i = 0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
			
		}
		System.out.println();
		
		for(Dog e : dog)
		{  System.out.println(e.showDogInfo());
		}

	}

}
