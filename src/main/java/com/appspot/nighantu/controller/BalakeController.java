package com.appspot.nighantu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appspot.nighantu.model.Balake;
import com.appspot.nighantu.model.Pada;
import com.appspot.nighantu.service.BalakeService;

@RestController
public class BalakeController {
	
	@Autowired
	private BalakeService balakeService;
	
	@RequestMapping("/padas/{englishPada}/balakes")
	public List<Balake> getAllPadas(@PathVariable String englishPada) {
		return balakeService.getAllBalakes(englishPada);
	}
	
	@RequestMapping("/padas/{englishPada}/balakes/{englishBalake}")
	public Balake getBalake(@PathVariable String englishBalake) {
		return balakeService.getBalake(englishBalake);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/padas/{englishPada}/balakes")
	public void addBalake(@RequestBody Balake balake, @PathVariable String englishPada) {
		Pada pada = new Pada(englishPada,"","");
		balake.setPada(pada);
		balakeService.addBalake(balake);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/padas/{englishPada}/balakes")
	public void updateBalake(@RequestBody Balake balake, @PathVariable String englishPada) {
		Pada pada = new Pada(englishPada,"","");
		balake.setPada(pada);
		balakeService.updateBalake(balake);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/padas/{englishPada}/balakes")
	public void deleteBalake(@RequestBody Balake balake) {
		balakeService.deleteBalake(balake);
	}

}
