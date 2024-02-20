package qlsv.dao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import qlsv.entity.Student;
import qlsv.entity.StudentXML;
import qlsv.utils.FileUtils;

public class StudentDao {
	private static final String STUDENT_FILE_NAME = "student.xml";
	private List<Student> listStudents;
	
	public StudentDao()
	{
		this.listStudents = readListStudents();
		if (listStudents == null)
			listStudents = new ArrayList<Student>();
	}
	
	//Lưu các đối tượng student vào file student.xml
	
}
