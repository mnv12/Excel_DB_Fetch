package com.example.spreadsheet.excel_dataDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.spreadsheet.excel_dataDB.Entity.EXcel_Entity;
import com.example.spreadsheet.excel_dataDB.Entity.Helper;
import com.example.spreadsheet.excel_dataDB.Repo.ProductRepo;

@Service
public class Pr_Impl implements ProductService{

    @Autowired
	private ProductRepo  repo;



	@Override
	public List<EXcel_Entity> getAllList() {
	
		return repo.findAll();
	}

	@Override
	public void save(MultipartFile file) {
		try {
		List<EXcel_Entity> convert = Helper.convert(file.getInputStream());
		repo.saveAll(convert);	
		
	}
catch(Exception ex) {
	
	ex.printStackTrace();
}
	
	
	
}
}