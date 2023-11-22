import com.valtech.training.mobile.ranking.MobileRankingService;
import com.valtech.training.mobile.ranking.MobileRankingServiceImpl;
import com.valtech.training.pattern.cheker.PatternCheckerServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class RatingHelper {
	
//	private MobileRankingServiceImpl mobileRankingService = new MobileRankingServiceImpl();
//	
//	public int getRanking(String mobile) {
////Validation	
//		
//		
//		return mobileRankingService.rankMobile(mobile);
//	}
	public int rankNumber(List<String> numbers,String number) {
		PatternCheckerServiceImpl patternChecker=new PatternCheckerServiceImpl();
		Map<String,Integer> phoneNumberScores=patternChecker.checkPatterns(numbers);
		return phoneNumberScores.get(number);
	}
	
	public static void rankingNumbers() {
		List<String> phoneNumbers = Arrays.asList("1234567890", "2345678901", "3456789012", "4567890123", "5678901234",
				"6789054321", "7890123456", "8901234567", "9012345678", "0123456789");
		
		PatternCheckerServiceImpl patternChecker=new PatternCheckerServiceImpl();
		Map<String,Integer> phoneNumberScores=patternChecker.checkPatterns(phoneNumbers);
		System.out.println(phoneNumberScores);
		
		MobileRankingService mobileRanker=new MobileRankingServiceImpl();
		List<String> rankedMobileNumbers=mobileRanker.rankMobiles(phoneNumberScores);
		System.out.println(rankedMobileNumbers);
	}
	
	public static void main(String[] args) {
		rankingNumbers();
	}
}


