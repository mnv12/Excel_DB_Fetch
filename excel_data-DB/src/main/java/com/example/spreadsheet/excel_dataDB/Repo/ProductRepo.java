package com.example.spreadsheet.excel_dataDB.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spreadsheet.excel_dataDB.Entity.EXcel_Entity;

public interface ProductRepo extends JpaRepository<EXcel_Entity, Long> {

	
	
}
