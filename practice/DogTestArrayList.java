package practice;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog>dogs = new ArrayList<Dog>();

		dogs.add(new Dog("바둑이", "진돗개"));
		dogs.add(new Dog("삽사리", "삽살개"));
		dogs.add(new Dog("뽀삐", "요크셔테리어")); 
		dogs.add(new Dog("두부", "포메라니안"));
		dogs.add(new Dog("구름", "치와와"));
		
		for(int i=0; i<dogs.size(); i++) {
			Dog dog = dogs.get(i); 
		    System.out.println(dog.showDogInfo());
		}System.out.println();

      System.out.println("========향상된 for문 사용 ======");	
	for(Dog dog : dogs) {
		 System.out.println(dog.showDogInfo());
	}
}
}
