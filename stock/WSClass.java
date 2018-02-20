package stock;

import java.util.Enumeration;
import java.util.Vector;
// import versata.common.*;
// import versata.vls.*;
import java.util.*;
import java.math.*;
import stock.*;
/**
 * Plays the role of a WebSvc Proxy - normally generated from
 * a WSDL with WebSvc tooling.  The WebSvc call (getQuote)
 * returns a stock.ExtendedQuote object,
 * handled by com.versata.tl.examples.slx.common.ObjectCreation#copyBeanToDataObject().
 * 
 * @author valhuber
 *
 */
public class WSClass {
	
	public static Object getQuote(String symbol)
	{
		System.err.println("Going to call the WS.." + symbol);
		
	 try
        {
		/*  stock.XigniteQuotesSoapStub service1 = (stock.XigniteQuotesSoapStub) new stock.XigniteQuotesLocator()
					.getXigniteQuotesSoap();
		
		ExtendedQuote eq = service1.getQuote(symbol);
		
		System.err.println("ExtendedQuote " + eq.getName());


				StockNews[] stknews = eq.getNews().getStockNews();

				for(int i =0; i < stknews.length; i++)
					System.err.println("News " + stknews[i].getHeadline());
		
		
			System.err.println("StockNews....");


		return eq;*/
			
			ExtendedQuote eq = new ExtendedQuote();
			
			eq.setName("IGATE CORPORATN");
			eq.setExchange("NASDAQ");
			
			StockQuote qt = new StockQuote();
			qt.setSymbol("IGTE");
			qt.setPrevious_Close("3.12");
			
			eq.setQuote(qt);
			
			StockStatistics st = new StockStatistics();
			st.setPrice_Earnings("0.59");
			
			eq.setChart("http://data.moneycentral.msn.com/scripts/chrtsrv.dll?Symbol=IGTE&C1=1&C2=&C3=1&C4=3C9=1&Width=352&Height=184&legend=0&banner=2");
			
			ArrayOfStockNews anews = new ArrayOfStockNews();
			StockNews snews = new StockNews();
			snews.setHeadline("iGATE Corporation Financials");
			snews.setSource("EDGAR Online Financials");
			snews.setTicker("TickNas");
			
			StockNews[] sNewsArray = new StockNews[1];
			sNewsArray[0] = snews;
			anews.setStockNews(sNewsArray);
			
			eq.setNews(anews);
			
			stock.StockStatistics stockStats[] = new stock.StockStatistics[2];
			StockStatistics stock1 = new StockStatistics();
			stock1.setEPS("EPS1");
			stock1.setEPS_Estimate("Est1");
			stock1.setMarket_Cap("1");
			stock1.setPrice_Earnings("1");
			stock1.setPrice_Sales("1");
			stockStats[0] = stock1;
			
			StockStatistics stock2 = new StockStatistics();
			stock2.setEPS("EPS2");
			stock2.setEPS_Estimate("Est2");
			stock2.setMarket_Cap("2");
			stock2.setPrice_Earnings("2");
			stock2.setPrice_Sales("2");
			stockStats[1] = stock2;
			
			eq.setStockStatistics(stockStats);
			
			
			return eq;
			
		
		
	}
        catch (Exception ex)
        {
            ex.printStackTrace ();
		return null;
        }
	
		
	}
	
	
}
