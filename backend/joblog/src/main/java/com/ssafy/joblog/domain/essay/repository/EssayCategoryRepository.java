package com.ssafy.joblog.domain.essay.repository;

import com.ssafy.joblog.domain.essay.entity.Essay;
import com.ssafy.joblog.domain.essay.entity.EssayCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EssayCategoryRepository extends JpaRepository<EssayCategory, Integer> {
}
