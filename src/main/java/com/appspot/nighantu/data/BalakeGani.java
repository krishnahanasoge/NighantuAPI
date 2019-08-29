package com.appspot.nighantu.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.appspot.nighantu.model.Balake;

public interface BalakeGani extends CrudRepository<Balake, String>{
	
	public List<Balake> findByPadaEnglishPada(String englishPada);

}
