/**
 * StockStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * 4
 */

package stock;

public class StockStatistics  /* implements java.io.Serializable */ { 
    private java.lang.String price_Earnings;
    private java.lang.String price_Sales;
    private java.lang.String market_Cap;
    private java.lang.String EPS;
    private java.lang.String EPS_Estimate;

    public StockStatistics() {
    }

    public java.lang.String getPrice_Earnings() {
        return price_Earnings;
    }

    public void setPrice_Earnings(java.lang.String price_Earnings) {
        this.price_Earnings = price_Earnings;
    }

    public java.lang.String getPrice_Sales() {
        return price_Sales;
    }

    public void setPrice_Sales(java.lang.String price_Sales) {
        this.price_Sales = price_Sales;
    }

    public java.lang.String getMarket_Cap() {
        return market_Cap;
    }

    public void setMarket_Cap(java.lang.String market_Cap) {
        this.market_Cap = market_Cap;
    }

    public java.lang.String getEPS() {
        return EPS;
    }

    public void setEPS(java.lang.String EPS) {
        this.EPS = EPS;
    }

    public java.lang.String getEPS_Estimate() {
        return EPS_Estimate;
    }

    public void setEPS_Estimate(java.lang.String EPS_Estimate) {
        this.EPS_Estimate = EPS_Estimate;
    }
/*
    private transient java.lang.ThreadLocal __history;
    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        StockStatistics other = (StockStatistics) obj;
        boolean _equals;
        _equals = true
            && ((this.price_Earnings==null && other.getPrice_Earnings()==null) || 
             (this.price_Earnings!=null &&
              this.price_Earnings.equals(other.getPrice_Earnings())))
            && ((this.price_Sales==null && other.getPrice_Sales()==null) || 
             (this.price_Sales!=null &&
              this.price_Sales.equals(other.getPrice_Sales())))
            && ((this.market_Cap==null && other.getMarket_Cap()==null) || 
             (this.market_Cap!=null &&
              this.market_Cap.equals(other.getMarket_Cap())))
            && ((this.EPS==null && other.getEPS()==null) || 
             (this.EPS!=null &&
              this.EPS.equals(other.getEPS())))
            && ((this.EPS_Estimate==null && other.getEPS_Estimate()==null) || 
             (this.EPS_Estimate!=null &&
              this.EPS_Estimate.equals(other.getEPS_Estimate())));
        if (!_equals) { return false; }
        if (__history == null) {
            synchronized (this) {
                if (__history == null) {
                    __history = new java.lang.ThreadLocal();
                }
            }
        }
        StockStatistics history = (StockStatistics) __history.get();
        if (history != null) { return (history == obj); }
        if (this == obj) return true;
        __history.set(obj);
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
        StockStatistics history = (StockStatistics) __hashHistory.get();
        if (history != null) { return 0; }
        __hashHistory.set(this);
        int _hashCode = 1;
        if (getPrice_Earnings() != null) {
            _hashCode += getPrice_Earnings().hashCode();
        }
        if (getPrice_Sales() != null) {
            _hashCode += getPrice_Sales().hashCode();
        }
        if (getMarket_Cap() != null) {
            _hashCode += getMarket_Cap().hashCode();
        }
        if (getEPS() != null) {
            _hashCode += getEPS().hashCode();
        }
        if (getEPS_Estimate() != null) {
            _hashCode += getEPS_Estimate().hashCode();
        }
        __hashHistory.set(null);
        return _hashCode;
    }
*/
}
