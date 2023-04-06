package com.prospecta.service;

import java.util.List;

import com.prospecta.exceptions.InvalidEntryException;
import com.prospecta.models.Entries;

public interface EntriesService {

	public String saveEntry(Entries entries)throws InvalidEntryException; 
	public List<Entries> getAllEntries();
}
