package day44Abstract2.browserTask;

public interface WebDriver extends SearchContext{
    /*
   2. Create a child interface of SearchContext named WebDriver
				Abstract methods (return-type is void):
					get(String url);
					close();
					quit();
					getTitle();
     */

void get(String url);
void close();
void quit();
void getTitle();


//    @Override
//    void findElement(String locator);
//
//    @Override
//    void findElements(String locator);
}

