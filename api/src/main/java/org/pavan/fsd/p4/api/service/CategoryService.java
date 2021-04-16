package org.pavan.fsd.p4.api.service;

import java.util.List;

import org.pavan.fsd.p4.api.dto.Category;
import org.pavan.fsd.p4.api.exception.OnlineTestServiceException;

public interface CategoryService {

	List<Category> getCategories() throws OnlineTestServiceException;
	
}
