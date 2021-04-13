package address.book;

import address.book.Contact;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program.");
		
		Contact storeValue = new Contact("abc", "efg", "klm", "mno", "abc01@gmail.in", 909878, 10230);
		storeValue.Display();
		
		AddContact displayContact = new AddContact();
		displayContact.NewContact();
	}
}
