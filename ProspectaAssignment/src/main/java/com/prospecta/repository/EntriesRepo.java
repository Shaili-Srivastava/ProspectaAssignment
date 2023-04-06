package com.prospecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecta.models.Entries;

public interface EntriesRepo extends JpaRepository<Entries, Integer>{
	public Entries findByApi(String api);

}
