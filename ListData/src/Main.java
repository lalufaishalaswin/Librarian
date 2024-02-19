import java.sql.Date;
import java.text.DateFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.text.Utilities;

public class Main {

	Scanner scan = new Scanner(System.in);
	Vector<userDetail> userDetails = new Vector<>();
	Random rand = new Random();
	DateFormat std1 = DateFormat.getDateInstance();
	userDetail u;
	int menu;
	String userName , phoneNumber , bookTitle;
	String name, noTicket, genre, author;
	String borrowTime;
	public Main() {
			do {
				cls();
				System.out.println("Menu List");
				System.out.println("================");;
				System.out.println("1. Add List user");
				System.out.println("2. View user");
				System.out.println("3. Remove user");
				System.out.println("4. Exit");
				System.out.print("Choose >> ");
				menu = scan.nextInt();
				scan.nextLine();
				switch (menu) {
				case 1:
					do {
						System.out.print("Insert user name [3 - 20 characters]: ");
						userName = scan.nextLine();
					} while (userName.length() < 3 || userName.length() > 20);
					do {
						System.out.print("Insert user phoneNumber [3 - 20 characters]: ");
						phoneNumber = scan.nextLine();
					} while (phoneNumber.length() < 3 || phoneNumber.length() > 20);
					do {
						System.out.print("Insert Books's author [3 - 20 characters]: ");
						author = scan.nextLine();
					} while (author.length() < 3 || author.length() > 20);
					do {
						System.out.print("Insert Books's name [3 - 20 characters]: ");
						name = scan.nextLine();
					} while (name.length() < 3 || name.length() > 20);
					do {
						System.out.print("Choose books genre [Horror|Adventure|Fantasy|Comedy|Romance|]: ");
						genre = scan.nextLine();
					} while (!genre.equals("Adventure") && !genre.equals("Horror") && !genre.equals("Comedy")
							&& !genre.equals("Romance") && !genre.equals("Fantasy"));
					System.out.print("Insert borrow Time: ");
					borrowTime = scan.nextLine();
					
					
					noTicket = "" + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10);

					u = new userDetail(noTicket, name, genre, author, userName, phoneNumber);
					userDetails.add(u);
					
				
					System.out.println("Insert Success!");
					cls();
					System.out.println("press enter for back to menu");
					scan.nextLine();

					break;

				case 2:
					cls();
					if (userDetails.size() == 0) {
						System.out.println("There are no book!");
						scan.nextLine();
					} else {
						viewBook();
						System.out.println(" ");
						System.out.println("press enter for back to menu");	
						scan.nextLine();
					}
					break;
					
				case 3:
					cls();
					if(userDetails.size() == 0) {
						System.out.println("There are no books!");
						scan.nextLine();
					} else {
						try {
							Thread.sleep(2000);
							viewBook();
							System.out.print("Insert no ticket: ");
							noTicket = scan.nextLine();
							int index = 0, flag = 0;
							for (userDetail u : userDetails) {
								if (u.getnoTicket().equals(noTicket)) {
									flag = 1;
									userDetails.remove(index);
									Thread.sleep(2000);
									cls();
									System.out.println("Success delete user");
									System.out.println(" ");
									System.out.println("press enter for back to menu");
									scan.nextLine();
									break;
								}
								index++;
							}
							if (flag == 0) {
								System.out.println("Books not found!");
								scan.nextLine();
								System.out.println(" ");
							}
						}catch(Exception e) {
							
						}
						
					}
					break;
				}
			} while (menu != 5);
		}
		
		
			
	

	private void viewBook() {
		System.out.println("User List");
		System.out.println("===========");
		try {
			Thread.sleep(2000);
			for(userDetail userDetail : userDetails) {
				System.out.println("No Ticket: "+userDetail.getnoTicket());
				System.out.println("User Name: "+userDetail.getuserName());
				System.out.println("Phone Number:"+userDetail.getphoneNumber());
				System.out.println("Books Name: "+userDetail.getAuthor());
				System.out.println("Books Author Name: "+userDetail.getgenre());
				System.out.println("Borrow Time Books: "+borrowTime+ " Days");
				System.out.println("===========");	
				Thread.sleep(2000);

			}
			
			
		}catch(Exception e) {
			System.out.println("error");
		}
			
		
	}

	private void cls() {
		for (int q = 1; q <= 100; q++)
			System.out.println();
	}

	public static void main(String[] args) {
		new Main();
	}
	
	public static void timea() {
		try {
			Thread.sleep(2500);;
		}
		catch(Exception e) {
			
		}
	}
}
