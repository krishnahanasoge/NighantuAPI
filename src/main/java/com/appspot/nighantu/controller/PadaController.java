package com.appspot.nighantu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appspot.nighantu.model.Pada;
import com.appspot.nighantu.service.PadaService;

@RestController
public class PadaController {
	
	@Autowired
	private PadaService padaService;
	
	@RequestMapping("/padas")
	public List<Pada> getAllPadas() {
		return padaService.getAllPadas();
	}
	
	@RequestMapping("/padas/{englishPada}")
	public Pada getPada(@PathVariable String englishPada) {
		return padaService.getPada(englishPada);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/padas")
	public void addPada(@RequestBody Pada pada) {
		padaService.addPada(pada);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/padas")
	public void updatePada(@RequestBody Pada pada) {
		padaService.updatePada(pada);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/padas")
	public void deletePada(@RequestBody Pada pada) {
		padaService.deletePada(pada);
	}

}
