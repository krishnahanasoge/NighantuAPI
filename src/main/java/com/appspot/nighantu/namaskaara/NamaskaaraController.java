package com.appspot.nighantu.namaskaara;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamaskaaraController {

	@RequestMapping("/namaskaara")
	public String namaskaaraHelu() {
		return "Namaskaara";
	}
}
