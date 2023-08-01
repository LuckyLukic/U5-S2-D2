package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Classi.User;

@RestController
@RequestMapping("/utente")
public class UserController {
	
   @Autowired
   UserService us;

   @PostMapping("")
   @ResponseStatus(HttpStatus.CREATED)
   public User salvaUser(@RequestBody User bodyUtente) {
	  return us.save(bodyUtente);
   }

   @GetMapping("")
   public List <User> visualizzaUtente() {
	  return us.getUsers();
	

 }
 }
