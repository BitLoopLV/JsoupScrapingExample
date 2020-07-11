package amazonpricechecker;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class AmazonPriceChecker {
	
	static String amazonItemUrl = "https://www.amazon.com/Texas-Instruments-Graphing-Calculator-Frustration/dp/B07SPVP7D4/";

	public static void main(String[] args) {
		try {
			Document amazonPage = Jsoup.connect(amazonItemUrl).get();
			String price = amazonPage.getElementById("priceblock_ourprice").text();
			System.out.println("The price of this item is: "+price);
			double priceNum = Double.parseDouble(price.replace("$", ""));
			if(priceNum < 170) {
				System.out.println("Wow that's a great deal");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
