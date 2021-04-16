package org.pavan.fsd.p4.api.mapper;

import org.mapstruct.Mapper;
import org.pavan.fsd.p4.api.dto.Question;

@Mapper
public interface AnswerMapperService {

	default org.pavan.fsd.p4.api.entity.Answer getAnswer(Integer answerIndex, Question questionDTO) {
		if (answerIndex == null || questionDTO == null) {
			return null;
		}
		
		org.pavan.fsd.p4.api.entity.Choice choice = new org.pavan.fsd.p4.api.entity.Choice();
		choice.setId(questionDTO.getChoices().get(answerIndex).getId());
		
		org.pavan.fsd.p4.api.entity.Question question = new org.pavan.fsd.p4.api.entity.Question();
		question.setId(questionDTO.getId());
		
		org.pavan.fsd.p4.api.entity.Answer answer = new org.pavan.fsd.p4.api.entity.Answer();
		answer.setChoice(choice);
		answer.setQuestion(question);
		
		return answer;
	}
	
	static Integer getIndex(org.pavan.fsd.p4.api.entity.Answer answer) {
		if (answer == null) {
			return null;
		}
		
		return answer.getQuestion().getChoices().indexOf(answer.getChoice());
	}
	
}
