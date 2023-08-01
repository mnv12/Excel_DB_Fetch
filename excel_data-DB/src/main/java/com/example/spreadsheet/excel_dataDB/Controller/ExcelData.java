package com.example.spreadsheet.excel_dataDB.Controller;

import java.util.List;
import java.util.Map;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.spreadsheet.excel_dataDB.Entity.EXcel_Entity;
import com.example.spreadsheet.excel_dataDB.Entity.Helper;
import com.example.spreadsheet.excel_dataDB.Service.ProductService;

@RestController
@CrossOrigin("*")
public class ExcelData {
	
	@Autowired
private ProductService service;
	@PostMapping("/product/upload")
	public ResponseEntity<?>  upload(@RequestParam("file") MultipartFile f) {
		
		if(Helper.checkFileExcel(f)) {
		service.save(f);
		System.out.println(" Original File Name------->>>>>>>>> "+f.getOriginalFilename()+" Size of file: "+f.getSize());
		return ResponseEntity.ok(Map.of("message","File is uploaded"));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload the file ");
		
	}
	
	@GetMapping("/getAll")
	public List<EXcel_Entity>  getAll(){
		
		return service.getAllList();
	}
	
	
	
	
	
}
