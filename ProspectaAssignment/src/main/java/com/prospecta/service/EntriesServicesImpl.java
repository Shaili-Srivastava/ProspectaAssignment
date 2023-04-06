package com.prospecta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prospecta.exceptions.InvalidEntryException;
import com.prospecta.models.Entries;
import com.prospecta.repository.EntriesRepo;


@Service
public class EntriesServicesImpl implements EntriesService{

	@Autowired
	private EntriesRepo ERepo;
	
	@Override
	public String saveEntry(Entries entries)throws InvalidEntryException {
		Entries en =   ERepo.findByApi(entries.getApi());
		
		if(en!=null) {
			 throw new InvalidEntryException("Invalid Entry") ;
		}else {
			ERepo.save(entries);
			return "success";
		}
			
	}

	@Override
	public List<Entries> getAllEntries() {
		// TODO Auto-generated method stub
		return ERepo.findAll();
	}
}
