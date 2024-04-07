package com.file.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.file.model.FileModel;
import com.file.service.FileService;

@RestController
@CrossOrigin
@RequestMapping("/file")
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	
	
	@PostMapping("/post")
	public ResponseEntity<?> insert(
	        @RequestParam String fromDate,
	        @RequestParam String toDate, 
	        @RequestParam String about,
	        @RequestParam MultipartFile file) throws IOException {

	    FileModel fileModel = fileService.insert(fromDate, toDate, about, file);

	    if (fileModel != null) {
	        return ResponseEntity.ok(fileModel);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	
	

}
