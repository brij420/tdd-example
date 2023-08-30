package com.example.tdd.teamresult.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.example.tdd.teamresult.service.ResultService;
import com.example.tdd.teamresult.service.ResultServiceImpl;

import static org.junit.jupiter.api.Assertions.*;


public class ResultSeviceImplTest{

	
	ResultService resultService=new ResultServiceImpl();

	private List<Map<String, Integer>> input;

	public ResultSeviceImplTest() {
		this.input = getTestRecords();
	}

	@Test
	public void test_for_team_result() {
		List<Map<String, Integer>> output = resultService.getResult(input);
		assertEquals(output,input);
		assertEquals(output.size(), input.size());
	}

	@Test
	public void test_input() {
		assertNotNull(input);
		assertNotEquals(input.size(),0);
		
	}

	public List<Map<String, Integer>> getTestRecords() {

		List<Map<String, Integer>> input = new ArrayList<>();
		Map<String, Integer> team1 = new LinkedHashMap<>();
		team1.put("Mexico", 0);
		team1.put("Canada", 5);
		input.add(team1);

		Map<String, Integer> team2 = new LinkedHashMap<>();
		team2.put("Spain", 10);
		team2.put("Brazil", 2);
		input.add(team2);

		Map<String, Integer> team3 = new LinkedHashMap<>();
		team3.put("Germany", 2);
		team3.put("France", 2);
		input.add(team3);

		Map<String, Integer> team4 = new LinkedHashMap<>();
		team4.put("Uruguay", 6);
		team4.put("Italy", 6);
		input.add(team4);

		Map<String, Integer> team5 = new LinkedHashMap<>();
		team5.put("Argentina", 3);
		team5.put("Australia", 1);
		input.add(team5);

		return input;
	}

}
