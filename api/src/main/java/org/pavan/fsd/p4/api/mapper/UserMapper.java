package org.pavan.fsd.p4.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends
	EntityDtoMapper<org.pavan.fsd.p4.api.dto.User, org.pavan.fsd.p4.api.entity.User> {
	
}
