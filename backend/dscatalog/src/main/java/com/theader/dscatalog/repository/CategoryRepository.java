package com.theader.dscatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theader.dscatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
