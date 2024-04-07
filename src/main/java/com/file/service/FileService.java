package com.file.service;

import java.io.IOException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.file.model.FileModel;
import com.file.repository.FileRepository;

@Service
public class FileService {
	
	@Autowired
	private FileRepository fileRepository;
	
	public FileModel insert(String fromDate,String todate,String about,MultipartFile file) throws IOException {
		FileModel filemodel=new FileModel();
		filemodel.setFileName(file.getOriginalFilename());
		filemodel.setFileData(file.getBytes());
		filemodel.setFromDate(LocalDate.parse(fromDate));
		filemodel.setTodate(LocalDate.parse(todate));
		filemodel.setAbout(about);
		return fileRepository.save(filemodel);
		
		
	}
	

}
