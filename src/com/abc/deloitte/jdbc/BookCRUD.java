
package com.abc.deloitte.jdbc;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class BookCRUD {

	private static Connection con;
	private static BufferedReader input;

	public static void main(String[] args) {
		try {
			input = new BufferedReader(new InputStreamReader(System.in));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Anjana", "Anjana");

			String option,op;

			while (true) {
				Menu();
				option = input.readLine();

				switch (option) {
				case "1":
                    AuthorMenu();
                    op = input.readLine();
					switch(op){
					case "1":viewAuthors();
					break;
					case "2":addAuthor();
					break;	
					case "3":updateAuthor();
					break;
					case "4":
						deleteAuthor();
						break;
					case "5":
						return;
					default:
						System.out.println("Invalid Input, please try again");
						input.readLine();
					}
					
				
				case "2":
					BookMemberMenu();
					op = input.readLine();
					switch(op){
					case "1":
						viewBookMembers();
						break;
					case "2":
						addBookMember();
						break;
					case "3":
						updateBookMember();
						break;
					case "4":
						deleteBookMember();
						break;
					case "5":
						return;
					default:
						System.out.println("Invalid Input, please try again");
						input.readLine();
					}
					
				case "3":
					OrderMenu();
					op = input.readLine();
					switch(op){
					case "1":
						viewOrders();
						break;
					case "2":
						addOrder();
						break;
					case "3":
						updateOrder();
						break;
					case "4":
						deleteOrder();
						break;
					case "5":
						return;
					default:
						System.out.println("Invalid Input, please try again");
						input.readLine();
					}
				
				
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(con)) {
				try {
					con.close();
				} catch (Exception e) {

				}
			}
		}
	}
	public static void Menu() {
		System.out.println();
		System.out.println("######## Table Menu ########");
		System.out.println(
				"1.  Authors\n2.Book Members\n3. Orders\n5. Exit");
		System.out.print("Your Option: ");
	}

	public static void AuthorMenu() {
		System.out.println();
		System.out.println("######## Author Menu ########");
		System.out.println(
				"1. View Authors\n2. Add Author\n3. Update Author\n4. Delete Author\n5. Exit");
		System.out.print("Your Option: ");
	}
	public static void BookMemberMenu() {
		System.out.println();
		System.out.println("######## Book Member Menu ########");
		System.out.println(
				"\n1. View Book Member\n2. Add Book Memnber\n3. Update Book Member\n4. Delete Book Member\n5. Exit");
		System.out.print("Your Option: ");
	}
	public static void OrderMenu() {
		System.out.println();
		System.out.println("######## Order Menu ########");
		System.out.println(
				"1. View Orders\n2.Add Order\n3.Update Order\n4.Delete Order\n5. Exit");
		System.out.print("Your Option: ");
	}

	public static void addAuthor() {
		Statement st = null;

		try {
			System.out.println("#########  AUTHOR  DETAILS ########");

			System.out.print("Name: ");
			String name = input.readLine();

			System.out.print("Email: ");
			String email = input.readLine();

			System.out.print("Mobile: ");
			String mobile = input.readLine();

			System.out.print("Description: ");
			String description = input.readLine();

			st = con.createStatement();
			st.executeUpdate("INSERT INTO Authors VALUES(member_sequence.nextval, '" + name + "', '" + email + "', '"
					+ mobile + "', '" + description + "')");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void viewAuthors() {
		Statement st = null;
		ResultSet rs = null;

		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM Authors");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " # " + rs.getString(2) + " # " + rs.getString(3) + " # "
						+ rs.getString(4) + " # " + rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(rs)) {
				try {
					rs.close();
				} catch (Exception e) {

				}
			}
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void updateAuthor() {
		Statement st = null;
		ResultSet rs = null;

		try {

			st = con.createStatement();

			System.out.println("#########  UPDATE MEMBER DETAILS ########");
			System.out.print("Enter member id to update: ");
			int Author_Id = Integer.parseInt(input.readLine());

			rs = st.executeQuery("SELECT * FROM Authors WHERE Author_Id =" + Author_Id);

			String oldName = "";
			String oldEmail = "";
			String oldMobile = "";
			String oldDescription = "";
			if (rs.next()) {
				oldName = rs.getString(2);
				oldEmail = rs.getString(3);
				oldMobile = rs.getString(4);
				oldDescription = rs.getString(5);
			}

			System.out.println("Old Name: " + oldName);
			System.out.print("Enter New Name: ");
			String name = input.readLine();

			System.out.println("Old Email: " + oldEmail);
			System.out.print("Enter New Email: ");
			String email = input.readLine();

			System.out.println("Old Name: " + oldMobile);
			System.out.print("Enter New Name: ");
			String mobile = input.readLine();

			System.out.println("Old Name: " + oldDescription);
			System.out.print("Enter New Name: ");
			String description = input.readLine();

			if (Objects.isNull(name) || name.trim().length() == 0) {
				name = oldName;
			}
			if (Objects.isNull(email) || email.trim().length() < 10) {
				email = oldEmail;
			}
			if (Objects.isNull(mobile) || mobile.trim().length() < 10) {
				mobile = oldMobile;
			}
			if (Objects.isNull(description) || description.trim().length() > 100) {
				description = oldDescription;
			}

			st.executeUpdate("UPDATE Authors SET name = '" + name + "', email = '" + email + "' WHERE " + "member_id="
					+ Author_Id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void deleteAuthor() {
		Statement st = null;

		try {
			System.out.print("Author id for deletion: ");
			int AuthorId = Integer.parseInt(input.readLine());

			st = con.createStatement();
			st.executeUpdate("DELETE FROM Authors WHERE Author_id=" + AuthorId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void addBookMember() {
		Statement st = null;

		try {
			System.out.println("#########  NEW BOOK MEMBER DETAILS ########");

			System.out.print("Name: ");
			String name = input.readLine();

			System.out.print("Email: ");
			String email = input.readLine();

			System.out.print("Mobile: ");
			String mobile = input.readLine();

			System.out.print("Password: ");
			String password = input.readLine();

			st = con.createStatement();
			st.executeUpdate("INSERT INTO BookMembers VALUES(member_sequence.nextval, '" + name + "', '" + email
					+ "', '" + mobile + "', '" + password + "')");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void viewBookMembers() {
		Statement st = null;
		ResultSet rs = null;

		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM BookMembers");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " # " + rs.getString(2) + " # " + rs.getString(3) + " # " + rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(rs)) {
				try {
					rs.close();
				} catch (Exception e) {

				}
			}
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void deleteBookMember() {
		Statement st = null;

		try {
			System.out.print("Book Member id for deletion: ");
			int memberId = Integer.parseInt(input.readLine());

			st = con.createStatement();
			st.executeUpdate("DELETE FROM BookMembers WHERE member_id=" + memberId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void updateBookMember() {
		Statement st = null;
		ResultSet rs = null;

		try {

			st = con.createStatement();

			System.out.println("#########  UPDATE BOOK MEMBER DETAILS ########");
			System.out.print("Enter member id to update: ");
			int memberId = Integer.parseInt(input.readLine());

			rs = st.executeQuery("SELECT * FROM BookMembers WHERE member_id =" + memberId);

			String oldName = "";
			String oldEmail = "";
			String oldMobile = "";
			String oldPassword = "";
			if (rs.next()) {
				oldName = rs.getString(2);
				oldEmail = rs.getString(3);
				oldMobile = rs.getString(3);
				oldPassword = rs.getString(4);

			}

			System.out.println("Old Name: " + oldName);
			System.out.print("Enter New Name: ");
			String name = input.readLine();

			System.out.println("Old Email: " + oldEmail);
			System.out.print("Enter New Email: ");
			String email = input.readLine();

			System.out.println("Old Mobile: " + oldMobile);
			System.out.print("Enter New Mobile: ");
			String mobile = input.readLine();

			System.out.println("Old Password: " + oldPassword);
			System.out.print("Enter New Password: ");
			String password = input.readLine();

			if (Objects.isNull(name) || name.trim().length() == 0) {
				name = oldName;
			}
			if (Objects.isNull(email) || email.trim().length() < 10) {
				email = oldEmail;
			}

			if (Objects.isNull(mobile) || name.trim().length() < 10) {
				mobile = oldMobile;
			}
			if (Objects.isNull(password) || password.trim().length() > 10) {
				password = oldPassword;
			}

			st.executeUpdate("UPDATE BookMembers SET name = '" + name + "', email = '" + email + "', mobile = '"
					+ mobile + "', password = '" + password + "' WHERE " + "member_id=" + memberId);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void addOrder() {
		Statement st = null;

		try {
			System.out.println("#########  ORDER  DETAILS ########");

			System.out.print("Member Id: ");
			int memberid = Integer.parseInt(input.readLine());

			System.out.print("Status: ");
			int status = Integer.parseInt(input.readLine());

			System.out.print("Date: ");

			String dateString = input.readLine();
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
			Date date = sdf.parse(dateString);
			System.out.println(date);
			sdf = new SimpleDateFormat("d-MMM-yyyy");

			st = con.createStatement();
			st.executeUpdate("INSERT INTO Orders VALUES(member_sequence.nextval, '" + memberid + "', '"
					+ sdf.format(date) + "', '" + status + "')");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void viewOrders() {
		Statement st = null;
		ResultSet rs = null;

		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM Orders");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " # " + rs.getInt(2) + " # " + rs.getDate(3) + " # " + rs.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(rs)) {
				try {
					rs.close();
				} catch (Exception e) {

				}
			}
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void updateOrder() {
		Statement st = null;
		ResultSet rs = null;

		try {

			st = con.createStatement();

			System.out.println("#########  UPDATE ORDER DETAILS ########");
			System.out.print("Enter order id to update: ");
			int orderId = Integer.parseInt(input.readLine());

			rs = st.executeQuery("SELECT * FROM Orders WHERE order_id =" + orderId);

			int oldMemberId = -1;
			Date oldDate = new Date();
			int oldstatus = -1;

			if (rs.next()) {
				oldMemberId = rs.getInt(2);
				oldDate = rs.getDate(3);
				oldstatus = rs.getInt(4);

			}

			System.out.println("Old Member Id: " + oldMemberId);
			System.out.print("Enter New Member Id: ");
			int mid = Integer.parseInt(input.readLine());

			System.out.println("Old Date: " + oldDate);
			System.out.print("Enter New Date: ");
			String dateString = input.readLine();
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
			Date date = sdf.parse(dateString);
			sdf = new SimpleDateFormat("d-MMM-yyyy");

			System.out.println("Old Status: " + oldstatus);
			System.out.print("Enter New Status: ");
			int status = Integer.parseInt(input.readLine());

			if (Objects.isNull(mid)) {
				mid = oldMemberId;
			}
			if (Objects.isNull(date)) {
				date = oldDate;
			}

			if (Objects.isNull(status)) {
				status = oldstatus;
			}

			st.executeUpdate("UPDATE BookMembers SET member_id = '" + mid + "', ordered_on = '" + date + "', status = '"
					+ status + "' WHERE " + "order_id=" + orderId);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}

			}

		}
	}

	public static void deleteOrder() {
		Statement st = null;

		try {
			System.out.print("Order id for deletion: ");
			int orderId = Integer.parseInt(input.readLine());

			st = con.createStatement();
			st.executeUpdate("DELETE FROM Orders WHERE order_id=" + orderId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

}
