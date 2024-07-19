package com.journal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.journal.pojo.JournalEntity;
import com.journal.repo.JournalRepo;

@Service
public class JournalService {

	@Autowired
	private JournalRepo repo;

	public ResponseEntity<JournalEntity> save(JournalEntity journal) {

//		JournalEntity journal = new JournalEntity(journalDto.getTitle(), journalDto.getDescription());
		JournalEntity je = repo.save(journal);

		return ResponseEntity.status(HttpStatus.CREATED).body(je);
	}
	
	public ResponseEntity<List<JournalEntity>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
	}

}
