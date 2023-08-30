package com.example.tdd.teamresult.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {
	@Override
	public List<Map<String, Integer>> getResult(List<Map<String, Integer>> result) {
		Collections.reverse(result);
		Collections.sort(result, new Comparator<Map<String, Integer>>() {
			public int compare(final Map<String, Integer> o1, final Map<String, Integer> o2) {
				Integer sum1 = o1.values().stream().reduce(0, Integer::sum);
				Integer sum2 = o2.values().stream().reduce(0, Integer::sum);
				return sum2.compareTo(sum1);
			}
		});

		return result;
	}

}
