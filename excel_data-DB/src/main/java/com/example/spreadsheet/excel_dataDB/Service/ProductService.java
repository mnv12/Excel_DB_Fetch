package com.example.spreadsheet.excel_dataDB.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.spreadsheet.excel_dataDB.Entity.EXcel_Entity;

public interface ProductService  {
   public void save(MultipartFile file);
	public List<EXcel_Entity>  getAllList();
	
}
