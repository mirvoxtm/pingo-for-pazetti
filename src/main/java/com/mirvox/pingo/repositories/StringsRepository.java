package com.mirvox.pingo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirvox.pingo.entities.Strings;

@Repository
public interface StringsRepository extends JpaRepository<Strings, Long> {

}
