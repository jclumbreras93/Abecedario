package abecedario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import abecedario.modelo.repositorio.RepositorioLibro;


@Controller
public class ControllerHome {
	
	@Autowired
	private RepositorioLibro repolib;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
		
		WebDataBinder webdat;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return "index";
	}
	
}
