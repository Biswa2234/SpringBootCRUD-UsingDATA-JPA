package in.sp.beans;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.beans.entity.User;
import in.sp.beans.service.UserService;
import in.sp.beans.service.UserServiceImplemented;

@SpringBootApplication
public class SpringBootProject4UsingDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootProject4UsingDataJpa1Application.class, args);
		UserService usrService = context.getBean(UserServiceImplemented.class);

		// for insert data

//	User usr = new User();
//	usr.setName("Jaga");
//	usr.setAge(26);
//	usr.setPincode(767540);
//	usr.setCity("BpHero");
//	boolean flag =usrService.addStudentDetails(usr);
//	if (flag) {
//		System.out.println("User insert succesfully");
//	} else {
//		System.out.println("User not insert FAILED");
//	}

		// for retrive all data

//		List<User> usrList= usrService.getAllUser();
//		for (User user : usrList) {
//			System.out.println("Id :" +user.getId());
//			System.out.println("name :" +user.getName());
//			System.out.println("age :"+ user.getAge());
//			System.out.println("pincode :" +user.getPincode());
//			System.out.println("city :"+ user.getCity());
//			System.out.println("=======================");
//		}

//		
//	//	for data retrive by id
//		
//	User user=	usrService.getUserById(1l);
//	if (user!=null) {
//		System.out.println("Id :" +user.getId());
//		System.out.println("name :" +user.getName());
//		System.out.println("age :"+ user.getAge());
//		System.out.println("pincode :" +user.getPincode());
//		System.out.println("city :"+ user.getCity());
//	} else {
//System.out.println("ERRORRRRRRRRRRRRRRRRRRRRRRRRRRRR");
//	}
		// for update by id

		boolean flag = usrService.updateUserDetails(1l, "Banglore");
		if (flag) {
			System.out.println("student Details update Succesfully");
		} else {
			System.out.println("student Details not updated");
		}

//		boolean flag = usrService.deleteUserById(2l);
//		if (flag) {
//			System.out.println("Delete succesfully");
//		} else {
//			System.out.println("Error");
//		}
	}

}
