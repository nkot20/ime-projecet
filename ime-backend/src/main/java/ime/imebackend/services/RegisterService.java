package ime.imebackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ime.imebackend.entity.role;
import ime.imebackend.entity.user;
import ime.imebackend.repository.RoleRepository;
import ime.imebackend.repository.UserRepository;

@Service
public class RegisterService {

	@Autowired
	private UserRepository repo;
	private RoleRepository reporole;
	
	public user saveUser(user user) {
		return repo.save(user);
	}
	
	public user featchUserById(String Id) {
		return repo.findByIduser(Id);
	}
	
	public user featchUserByIdAndPw(String Id, String pw) {
		return repo.findByIduserAndPw(Id, pw);
	}
	
	public role searchRoleById(Long Id) {
		return reporole.findByIdrole(Id);
	}
	
	
}
