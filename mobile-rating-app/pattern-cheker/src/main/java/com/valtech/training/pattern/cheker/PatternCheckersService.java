package com.valtech.training.pattern.cheker;

import java.util.List;
import java.util.Map;

public interface PatternCheckersService {

	Map<String,Integer> checkPatterns(List<String> phoneNumbers);
}