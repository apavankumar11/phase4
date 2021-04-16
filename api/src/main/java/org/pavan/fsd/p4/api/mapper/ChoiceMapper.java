package org.pavan.fsd.p4.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { QuestionMapperService.class })
public interface ChoiceMapper extends
	EntityDtoMapper<org.pavan.fsd.p4.api.dto.Choice, org.pavan.fsd.p4.api.entity.Choice> {

	@Mapping(expression = "java(QuestionMapperService.findById(questionId))", target = "question")
	org.pavan.fsd.p4.api.entity.Choice toEntity(org.pavan.fsd.p4.api.dto.Choice dto, Long questionId);
	
	org.pavan.fsd.p4.api.dto.Choice toDto(org.pavan.fsd.p4.api.entity.Choice entity);
	
}
