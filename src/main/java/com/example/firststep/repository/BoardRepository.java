package com.example.firststep.repository;

import com.example.firststep.domain.FBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<FBoard, Long> {
    @Query(value = "select * from Friend where fno = :fno", nativeQuery = true)
    FBoard searchFno(@Param("fno") Long fno);
}
