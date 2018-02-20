/**
 * StockNews.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * 4
 */

package stock;

public class StockNews  /* extends stock.Common  implements java.io.Serializable */ { 
    private java.lang.String headline;
    private java.lang.String ticker;
    private java.lang.String date;
    private java.lang.String time;
    private java.lang.String source;
    private java.lang.String url;

    public StockNews() {
    }

    public java.lang.String getHeadline() {
        return headline;
    }

    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }

    public java.lang.String getTicker() {
        return ticker;
    }

    public void setTicker(java.lang.String ticker) {
        this.ticker = ticker;
    }

    public java.lang.String getDate() {
        return date;
    }

    public void setDate(java.lang.String date) {
        this.date = date;
    }

    public java.lang.String getTime() {
        return time;
    }

    public void setTime(java.lang.String time) {
        this.time = time;
    }

    public java.lang.String getSource() {
        return source;
    }

    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public java.lang.String getUrl() {
        return url;
    }

    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        StockNews other = (StockNews) obj;
        boolean _equals;
        _equals = true
            && ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline())))
            && ((this.ticker==null && other.getTicker()==null) || 
             (this.ticker!=null &&
              this.ticker.equals(other.getTicker())))
            && ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())))
            && ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())))
            && ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource())))
            && ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
        if (!_equals) { return false; }
        if (!super.equals(obj)) { return false; }
        return true;
    }

    public int hashCode() {
        int _hashCode = super.hashCode();
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getTicker() != null) {
            _hashCode += getTicker().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        return _hashCode;
    }

}
