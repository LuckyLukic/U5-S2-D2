package Service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prenotazione")
public class ControllerPrenotazione {
	
	@GetMapping("")
	public ResponseEntity<String> getInfo(@RequestParam String lingua) {
		
		ResponseEntity<String> response = null;
		
		boolean ita = "italiano".equalsIgnoreCase(lingua);
		boolean eng = "inglese".equalsIgnoreCase(lingua);
		
		if(ita) {
			response = ResponseEntity.ok("Benvenuto");
		}
		
		if(eng) {
			
			response = ResponseEntity.ok("Welcome");
		}
		
		if(response == null) {
			return ResponseEntity.badRequest().body("Non trovato");
			
		} else return response;
		
	}
	

}
