package com.jbk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testapi")
public class QuestionController_Nikit_P {

	public Question getQuestion(int qid) {

		Question question = new Question();
		return question;
	}

	public List<Question> getAllQuestions() {

		List<Question> list = new ArrayList<>();
		return list;
	}

	public boolean updateQuestion(int qid) {
		return false;
	}

	public boolean deleteQuestion(int qid) {
		return false;
	}

	public List<Question> questionPaper(int count) {

		List<Question> list = new ArrayList<>();
		if (count == 10) {
			System.out.println("10 question selected");
		} else if (count == 25) {
			System.out.println("25 question selected");
		} else if (count == 30) {
			System.out.println("30 question selected");
		} else {
		}
		return list;
	}
	//le nikit 
	public String getSubject() {
		return "";
	}

}
