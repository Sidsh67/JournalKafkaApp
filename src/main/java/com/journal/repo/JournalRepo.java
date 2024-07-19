package com.journal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.journal.pojo.JournalEntity;

@Repository
public interface JournalRepo extends JpaRepository<JournalEntity, Integer> {

}
