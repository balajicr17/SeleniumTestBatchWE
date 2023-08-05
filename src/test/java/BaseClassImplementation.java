import org.base.BaseClass;
import org.constants.URLConstants;

public class BaseClassImplementation {

	BaseClass baseClass = new BaseClass();

	public void chromeBrowserStartUpGetGoolePage() throws InterruptedException {

		baseClass.chromeBrowserInstantiation();

		baseClass.getPage(URLConstants.googleURL);

		baseClass.close();

	}

	public void firefoxBrowserStartUpGetGoolePage() throws InterruptedException {

		baseClass.fireFoxBrowserInstantiation();

		baseClass.getPage(URLConstants.googleURL);

		baseClass.close();

	}

	public static void main(String[] args) throws InterruptedException {

		BaseClassImplementation obj = new BaseClassImplementation();
		obj.chromeBrowserStartUpGetGoolePage();
		obj.firefoxBrowserStartUpGetGoolePage();

	}

}
