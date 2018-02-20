package stock;
/**
 * ExtendedQuote.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * 4 <p/>
 * Well, initially :).  To enable it to be be used with Internet
 * connection, we have disabled all the serializeability.
 * It represents the Response Object from a Web Service.
 * WSClass plays the role of the WebSvc proxy.
 * In adition, the Statistics accessors have been renamed
 * (to stockStatistics), to avoid using the Sql/Server reserved word
 * "statistics" (using it causes database deployment to fail
 * for Sql/Server).
 * 
 */
public class ExtendedQuote   /* extends stock.Common  implements java.io.Serializable  */ { 
    private java.lang.String name;				// example of scalar attribute
    private java.lang.String exchange;
    private stock.StockQuote quote;				// example of an object
    private stock.StockStatistics statistics[];	// example of Generic Bean Array
    private java.lang.String chart;
    private stock.ArrayOfStockNews news;		// example of Typed Bean Array

    public ExtendedQuote() {
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getExchange() {
        return exchange;
    }

    public void setExchange(java.lang.String exchange) {
        this.exchange = exchange;
    }

    public stock.StockQuote getQuote() {
        return quote;
    }

    public void setQuote(stock.StockQuote quote) {
        this.quote = quote;
    }

    public stock.StockStatistics[] getStockStatistics() {
        return statistics;
    }

    public void setStockStatistic(int i, stock.StockStatistics aStatistic) {
        this.statistics[i] = aStatistic;
    }

    public void setStockStatistics(stock.StockStatistics[] aStockArray) {
    	statistics = aStockArray;
    }
    
    public java.lang.String getChart() {
        return chart;
    }

    public void setChart(java.lang.String chart) {
        this.chart = chart;
    }

    public stock.ArrayOfStockNews getNews() {
        return news;
    }

    public void setNews(stock.ArrayOfStockNews news) {
        this.news = news;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        ExtendedQuote other = (ExtendedQuote) obj;
        boolean _equals;
        _equals = true
            && ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())))
            && ((this.exchange==null && other.getExchange()==null) || 
             (this.exchange!=null &&
              this.exchange.equals(other.getExchange())))
            && ((this.chart==null && other.getChart()==null) || 
             (this.chart!=null &&
              this.chart.equals(other.getChart())));
        if (!_equals) { return false; }
        if (!super.equals(obj)) { return false; }
        _equals = true
            && ((this.quote==null && other.getQuote()==null) || 
             (this.quote!=null &&
              this.quote.equals(other.getQuote())))
            && ((this.statistics==null && other.getStockStatistics()==null) || 
             (this.statistics!=null &&
              this.statistics.equals(other.getStockStatistics())))
            && ((this.news==null && other.getNews()==null) || 
             (this.news!=null &&
              this.news.equals(other.getNews())));
        if (!_equals) {
            return false;
        };
        return true;
    }

    public int hashCode() {
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getExchange() != null) {
            _hashCode += getExchange().hashCode();
        }
        if (getQuote() != null) {
            _hashCode += getQuote().hashCode();
        }
        if (getStockStatistics() != null) {
            _hashCode += getStockStatistics().hashCode();
        }
        if (getChart() != null) {
            _hashCode += getChart().hashCode();
        }
        if (getNews() != null) {
            _hashCode += getNews().hashCode();
        }
        return _hashCode;
    }

}
