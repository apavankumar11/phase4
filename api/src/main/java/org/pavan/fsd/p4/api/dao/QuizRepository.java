package org.pavan.fsd.p4.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.pavan.fsd.p4.api.entity.Category;
import org.pavan.fsd.p4.api.entity.Quiz;
import org.pavan.fsd.p4.api.entity.User;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
	
	List<Quiz> findByCategory(Category category);
	List<Quiz> findByTester(User user);
	
	@EntityGraph(attributePaths={"image"})
    Quiz findWithImageAttachedById(Long id);
	
}
