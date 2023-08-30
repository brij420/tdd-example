package com.example.tdd.teamresult.service;

import java.util.List;
import java.util.Map;

public interface ResultService {

	List<Map<String,Integer>> getResult(List<Map<String,Integer>> input);
}
