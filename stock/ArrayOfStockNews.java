/**
 * ArrayOfStockNews.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * 4
 */

package stock;

public class ArrayOfStockNews  /* implements java.io.Serializable */ { 
    private stock.StockNews[] stockNews;

    public ArrayOfStockNews() {
    }

    public stock.StockNews[] getStockNews() {
        return stockNews;
    }

    public void setStockNews(stock.StockNews[] stockNews) {
        this.stockNews = stockNews;
    }

    public stock.StockNews getStockNews(int i) {
        return stockNews[i];
    }

    public void setStockNews(int i, stock.StockNews value) {
        this.stockNews[i] = value;
    }

    /*
    private transient java.lang.ThreadLocal __history;
    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        if (__history == null) {
            synchronized (this) {
                if (__history == null) {
                    __history = new java.lang.ThreadLocal();
                }
            }
        }
        ArrayOfStockNews history = (ArrayOfStockNews) __history.get();
        if (history != null) { return (history == obj); }
        if (this == obj) return true;
        __history.set(obj);
        ArrayOfStockNews other = (ArrayOfStockNews) obj;
        boolean _equals;
        _equals = true
            && ((this.stockNews==null && other.getStockNews()==null) || 
             (this.stockNews!=null &&
              java.util.Arrays.equals(this.stockNews, other.getStockNews())));
        if (!_equals) {
            __history.set(null);
            return false;
        };
        __history.set(null);
        return true;
    }

    private transient java.lang.ThreadLocal __hashHistory;
    public int hashCode() {
        if (__hashHistory == null) {
            synchronized (this) {
                if (__hashHistory == null) {
                    __hashHistory = new java.lang.ThreadLocal();
                }
            }
        }
        ArrayOfStockNews history = (ArrayOfStockNews) __hashHistory.get();
        if (history != null) { return 0; }
        __hashHistory.set(this);
        int _hashCode = 1;
        if (getStockNews() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockNews());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStockNews(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashHistory.set(null);
        return _hashCode;
    }
*/
}
