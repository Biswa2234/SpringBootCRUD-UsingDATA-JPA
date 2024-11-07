package in.sp.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.beans.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
