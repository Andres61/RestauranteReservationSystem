package com.technisoft.tablemingle.repository;

import com.technisoft.tablemingle.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
}
