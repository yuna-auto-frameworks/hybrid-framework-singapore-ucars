package reportConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import commons.GlobalConstants;

	public class ExtentManager {
		public static final ExtentReports extentReports = new ExtentReports();

		public synchronized static ExtentReports createExtentReports() {
			ExtentSparkReporter reporter = new ExtentSparkReporter(GlobalConstants.PROJECT_PATH + "/report-ExtentV5/ExtentReport.html");
			reporter.config().setReportName("UCARS HTML Report");
			reporter.config().setDocumentTitle("UCARS HTML Report");
			reporter.config().setTimelineEnabled(true);
			reporter.config().setEncoding("utf-8");
			reporter.config().setTheme(Theme.DARK);

			extentReports.attachReporter(reporter);
			extentReports.setSystemInfo("Company", "UCARS SINGAPORE");
			extentReports.setSystemInfo("Project", "UCARS");
			extentReports.setSystemInfo("Team", "QA Yuna");
			extentReports.setSystemInfo("JDK version", GlobalConstants.JAVA_VERSION);
			return extentReports;
		}
	}


