package com.valtech.training.mobile.rating.ui;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.valtech.training.mobile.ranking.MobileRankingService;
import com.valtech.training.mobile.ranking.MobileRankingServiceImpl;
import com.valtech.training.pattern.cheker.PatternCheckerServiceImpl;


public class MobileRankingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MobileRankingServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PatternCheckerServiceImpl patternChecker=new PatternCheckerServiceImpl();
		MobileRankingService mobileNumberRanker=new MobileRankingServiceImpl();
		
		String phoneNumbersInput = request.getParameter("phoneNumbers");
        String[] phoneNumbersArray = phoneNumbersInput.split("\n");
        List<String> phoneNumbers = Arrays.asList(phoneNumbersArray);

        Map<String, Integer> phoneScores = patternChecker.checkPatterns(phoneNumbers);
        List<String> rankedPhoneNumbers = mobileNumberRanker.rankMobiles(phoneScores);
        
        request.setAttribute("rankedPhoneNumbers", rankedPhoneNumbers);
        
        request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
