package com.br.datafeed.service.impl;

import javax.inject.Inject;

import com.br.datafeed.model.Feedback;
import com.br.datafeed.repository.IFeedbackRepository;
import com.br.datafeed.service.IFeedbackService;

public class FeedbackService implements IFeedbackService{

	@Inject
	IFeedbackRepository repository;

	public void adicionarFeedback(Feedback feedback) {
		repository.adicionarFeedback(feedback);	
	}

	public Feedback pegarFeedback(int dataset_id) {
		return repository.pegarFeedback(dataset_id);
	}
}
