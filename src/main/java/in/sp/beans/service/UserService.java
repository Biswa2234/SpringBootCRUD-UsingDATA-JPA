package in.sp.beans.service;

import java.util.List;

import in.sp.beans.entity.User;

public interface UserService {
    public boolean addStudentDetails(User usr);
    public List<User>getAllUser();
    public User getUserById(long id);
    public boolean updateUserDetails(long id , String city);
    public boolean deleteUserById(long id );
    
}
