package amazonpricechecker;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class AmazonPriceChecker {

	public static void main(String[] args) {
		String amazonItemUrl = "https://www.amazon.com/Apple-MacBook-1-8GHz-dual-core-Intel/dp/B07211W6X2/ref=sr_1_4?dchild=1&keywords=macbook&qid=1594575939&s=electronics&sr=1-4";
		try {
			Document amazonPage = Jsoup.connect(amazonItemUrl).get();
			String priceStr = amazonPage.getElementById("priceblock_ourprice").text();
			System.out.println(priceStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
