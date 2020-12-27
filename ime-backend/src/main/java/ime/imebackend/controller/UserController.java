package ime.imebackend.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ime.imebackend.services.RegisterService;
import ime.imebackend.entity.Etudiant;
import ime.imebackend.entity.user;
import ime.imebackend.repository.EtudiantRepository;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("http://localhost:4200")
public class UserController {
	static Scanner Lire=new Scanner(System.in);
	@Autowired
	private RegisterService service;
	private EtudiantRepository EtudiantRepository;
	
	//register
	@PostMapping("/registeruser")
	public user registerUser(@RequestBody user user) throws Exception {
		String IdUser = user.getIduser();
		if(IdUser != null && !"".equals(IdUser)) {
			user userObj = service.featchUserById(IdUser);
			if(userObj != null) {
				throw new Exception("user with "+IdUser+ "is already exist");
			}
		}
		user userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	//login
	@PostMapping("/login")
	public user loginUser(@RequestBody user user) throws Exception {
		
		String idUser = user.getIduser();
		String pw = user.getPw();
		user userObj = null;
		System.out.println(""+idUser+"");
		if(idUser != null && pw != null) {
			userObj = service.featchUserByIdAndPw(idUser, pw);
		}
		
		if(userObj == null) {
			throw new Exception("User is not exist");
		}
		
		return userObj;
		
	}
	
	//get user
	@PostMapping("/searchUser")
	public user searchUser(@RequestBody user user) throws Exception {
		String iduser = user.getIduser();
		user userObj = null;
		if(iduser != null) {
			userObj = service.featchUserById(iduser);
		}
		else {
			throw new Exception("User is not exist"+iduser);
		}
		return userObj;
	}
	
	//get student register
	@GetMapping("/studentRegister")
	public List<Etudiant> getAllStudentRegister() {
		return EtudiantRepository.findByEtatinscriptionIs(0);
	}
}
