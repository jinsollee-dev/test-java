package object;


class Book{
	int bookNumber; 
	String bookTitle; 
	
Book(int bookNumber, String bookTitle){
	this.bookNumber = bookNumber; 
	this.bookTitle = bookTitle; 
 }
 
@Override
public String toString() {
	// TODO Auto-generated method stub
	return bookTitle + "," + bookNumber;
}


@Override
public boolean equals(Object obj) {
	if(obj instanceof Book) {
		Book book = (Book)obj; //매개변수  자리 obj가 object형으로 되어 있기 때문에 book 메서드 사용하려면 명시적 형변환 
		if(this.bookNumber==book.bookNumber
				&& this.bookTitle == book.bookTitle) {
			return true; 
		} else if(this.bookNumber != book.bookNumber && this.bookTitle == book.bookTitle) {
			System.out.println("bookNumber가 다릅니다.");
		} 
	} 	return false;
}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미"); 
		System.out.println(book1);
		System.out.println(book1.toString());
		Book book2 = book1; 
		Book book3 = new Book(200, "개미"); 
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book3));
		String str1 = new String("가"); 
		String str2  = str1;
		String str3 = new String("가");
		Book book4 = new Book(300, "개미"); 
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str3)); //equals의 재정의된 메서드 사용됨 
		System.out.println(str1==str3); //메모리 주소 비교 
		System.out.println(book1.equals(book4));

		
		
	
	}

}
