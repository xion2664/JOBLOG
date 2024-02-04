package com.ssafy.joblog.domain.essay.repository;

import com.ssafy.joblog.domain.essay.entity.Essay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EssayRepository extends JpaRepository<Essay, Integer> {

    List<Essay> findByUserId(Integer userId);

    @Modifying
    @Query("UPDATE Essay essay SET essay.isDelete = true WHERE essay.id = :id")
    void markDeletedEssay(@Param("id") int id);
}
