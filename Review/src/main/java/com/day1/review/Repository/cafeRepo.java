package com.day1.review.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.day1.review.databaseex.cafeideas;

import jakarta.transaction.Transactional;
@Repository
public interface cafeRepo extends JpaRepository<cafeideas, Integer> 
{
        @Query(value="select * from cafeideas ",nativeQuery=true)
        public List<cafeideas> getAllData();
        
        @Query(value="select * from cafeideas where cafenum=:id",nativeQuery=true)
        public List<cafeideas> byCafenum (@Param("id")int id);
        
        @Query(value="select * from cafeideas where cafenum between :start and :end",nativeQuery=true)
        public List<cafeideas> startEnd(@Param("start") int start,@Param("end")int end);
        
        @Modifying
        @Transactional
        @Query(value="delete from cafeideas where cafenum=?1 and cafename=?2",nativeQuery = true)
        Integer deleteD(@Param("id") int pid,@Param ("name") String pname);
        
        @Modifying
        @Transactional
        @Query(value="update cafeideas set cafenum=:pid where cafename=:pname",nativeQuery=true)
        public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
        
        @Query(value="select c from cafeideas c")
        List<cafeideas> jpqlQ();
        
        @Query(value="select c from cafeideas c where c.cafenum=?1")
        public List<cafeideas> jqBYCon(@Param ("id")int sid);
        
        
        
            
}
