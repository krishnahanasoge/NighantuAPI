package com.appspot.nighantu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appspot.nighantu.data.BalakeGani;
import com.appspot.nighantu.model.Balake;

@Service
public class BalakeService {
	
	@Autowired
	BalakeGani balakeGani;
	
	public List<Balake> getAllBalakes(String englishPada){
		return balakeGani.findByPadaEnglishPada(englishPada);
	}
	
	public Balake getBalake(String englishBalake) {
		return balakeGani.findById(englishBalake).get();
	}
	
	public void addBalake(Balake balake) {
		balakeGani.save(balake);
	}

	public void updateBalake(Balake balake) {
		balakeGani.save(balake);
	}
	
	public void deleteBalake(Balake balake) {
		balakeGani.delete(balake);
	}

}
