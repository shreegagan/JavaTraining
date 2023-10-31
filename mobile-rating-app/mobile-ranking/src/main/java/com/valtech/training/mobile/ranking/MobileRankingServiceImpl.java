package com.valtech.training.mobile.ranking;

import java.util.List;

import com.valtech.training.pattern.cheker.PatternCheckerServiceImpl;

public class MobileRankingServiceImpl implements MobileRankingService {
	
	private PatternCheckerServiceImpl pattCheckServ=new PatternCheckerServiceImpl();

	@Override
	public int rankMobile(String mobile) {
		List<String> patterns = pattCheckServ.listPatterns(mobile);
		
//		logic for rating..
		
		return 0;
	}

}
