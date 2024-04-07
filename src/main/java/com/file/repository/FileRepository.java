package com.file.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.file.model.FileModel;

public interface FileRepository extends JpaRepository<FileModel,Long> {

}
