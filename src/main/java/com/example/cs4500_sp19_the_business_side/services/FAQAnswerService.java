package com.example.cs4500_sp19_the_business_side.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500_sp19_the_business_side.models.FrequentlyAskedAnswer;
import com.example.cs4500_sp19_the_business_side.repositories.FAQAnswerRepository;

@RestController
@CrossOrigin(origins="*")
public class FAQAnswerService {
	@Autowired
	FAQAnswerRepository repository;
	@GetMapping("/api/faq-answers")
	public List<FrequentlyAskedAnswer> findAllFrequentlyAskedQuestions() {
		return repository.findAllFrequentlyAskedAnswers();
	}
	@GetMapping("/api/faq-answers/{id}")
	public FrequentlyAskedAnswer findFrequentlyAskedQuestionById(
			@PathVariable("id") Integer id) {
		return repository.findFrequentlyAskedAnswerById(id);
	}
}