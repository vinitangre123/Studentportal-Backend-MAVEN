package com.data.studentsportal.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.data.studentsportal.Entity.Students;



@Repository
public interface StudentsRepo extends JpaRepository<Students,Integer> {
	
	
	
	 @Query("select u from Students u where u.id=:n")
	 List<?> FindBySortdata(@Param("n") Integer id);
	 
	 @Query("select u from Students u where u.studentname=:n")
	 List<Students> FindBySortname(@Param("n")  String studentname);
	 

     @Modifying
	 @Query("update Students u set u.studentname=:p where u.id=:n")
     @Transactional
	int Updatedata(@Param("p") String studentname,@Param("n") Integer id );
	   
     @Modifying
	 @Query(value="Delete from studentsdetails where id=:p",nativeQuery = true)
     @Transactional
	int deletedata(@Param("p") Integer id );
	   
//    @Query("select u from States u")
//	 List<Students> FindBystate(@Param("u")  String studentname);
}
