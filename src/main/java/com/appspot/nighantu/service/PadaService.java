package com.appspot.nighantu.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appspot.nighantu.data.PadaGani;
import com.appspot.nighantu.model.Pada;

@Service
public class PadaService {
	
	@Autowired
	PadaGani padaGani;
	
	public List<Pada> getAllPadas(){
		List<Pada> padas = new ArrayList<>();
		padaGani.findAll().forEach(padas::add);
		return padas;
	}
	
	public Pada getPada(String englishPada) {
		return padaGani.findById(englishPada).get();
	}
	
	public void addPada(Pada pada) {
		padaGani.save(pada);
	}

	public void updatePada(Pada pada) {
		padaGani.save(pada);
	}
	
	public void deletePada(Pada pada) {
		padaGani.delete(pada);
	}

}
