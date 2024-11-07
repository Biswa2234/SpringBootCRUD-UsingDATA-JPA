package in.sp.beans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.beans.entity.User;
import in.sp.beans.repository.UserRepository;

// for bean use service annotation
@Service
public class UserServiceImplemented implements UserService {
	@Autowired
	private UserRepository userRepository;

	// Insert Data In Database
	@Override
	public boolean addStudentDetails(User usr) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			userRepository.save(usr);
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			flag = false;
		}
		return flag;
	}

	// Retrive All Data from user
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	// Rerive data by id
	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		Optional<User> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}

	}

	@Override
	public boolean updateUserDetails(long id, String city) {
		// TODO Auto-generated method stub
		User user = getUserById(id);
		if (user != null) {
			user.setCity(city);
			userRepository.save(user);

			return true;
		} else {

		}
		return false;
	}

	@Override
	public boolean deleteUserById(long id) {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			userRepository.deleteById(id);
			flag = true;
		} catch (Exception e) {
			// TODO: handle
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

}
