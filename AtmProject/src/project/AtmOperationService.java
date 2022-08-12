package project;

import java.util.Map;

public interface AtmOperationService {
	
	public double viewBalance();

	public String withdrawAmount(double withdrawAmount);

	public String depositAmount(double depositAmount);

	public Map<Double, String> viewMiniStatement();

}
