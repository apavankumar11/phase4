package org.pavan.fsd.p4.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper extends
	EntityDtoMapper<org.pavan.fsd.p4.api.dto.Category, org.pavan.fsd.p4.api.entity.Category> {
	
}
