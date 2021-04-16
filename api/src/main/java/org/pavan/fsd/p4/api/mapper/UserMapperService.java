package org.pavan.fsd.p4.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapperService {

	default org.pavan.fsd.p4.api.entity.User findById(String id) {
		if (id == null) {
			return null;
		}
		
		org.pavan.fsd.p4.api.entity.User user = new org.pavan.fsd.p4.api.entity.User();
		user.setEmail(id);
		
		return user;
	}
	
	default String findByUser(org.pavan.fsd.p4.api.entity.User user) {
		if (user == null) {
			return null;
		}
		
		return user.getEmail();
	}
	
}
