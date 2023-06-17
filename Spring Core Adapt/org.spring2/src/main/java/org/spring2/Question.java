package org.spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	private List<String> answersList;
	private String[] answersArr;
	private Set<String> answersSet;
	private Map<Integer,String> answersMap;
	
	public Question(int questionId,String question,List<String> answersList,String[] answersArr,Set<String> answersSet,Map<Integer,String> answersMap) {
		this.questionId=questionId;
		this.question=question;
		this.answersList=answersList;
		this.answersArr=answersArr;
		this.answersSet=answersSet;
		this.answersMap=answersMap;
	}
	
	public String arrToString() {
		String ans ="";
		for(String temp:answersArr) {
			ans= ans+temp+" ";
		}
		return ans;
	}
	@Override
	public String toString() {
		return questionId+" "+question+" "+answersList+" "+arrToString()+" "+answersSet+" "+answersMap;
	}
}
