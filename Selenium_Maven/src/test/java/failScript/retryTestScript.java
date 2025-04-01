package failScript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryTestScript implements IRetryAnalyzer {

    private int retrycount=0;
    private int maxretrycount=3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retrycount<maxretrycount){
            retrycount++;
            return true;
        }
        return false;
    }
}
