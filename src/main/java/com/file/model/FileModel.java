//package com.file.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Table(name="file_model")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class FileModel {
//	
//	@Id
//	@GeneratedValue
//	private Long id;
//	private String fromDate;
//	private String todate;
//	private String about;
//	private String fileName;
//	
//	@Lob
//	@Column(columnDefinition="LONGBLOB")
//	private byte[] fileData;
//	
//
//}


package com.file.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name="file_model")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FileModel {
	
	@Id
	@GeneratedValue
	private Long id;
	private LocalDate fromDate;
	private LocalDate todate;
	private String about;
	private String fileName;
	
	@Lob
	@Column(columnDefinition="LONGBLOB")
	private byte[] fileData;
	

}
