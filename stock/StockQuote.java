/**
 * StockQuote.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * 4
 */

package stock; 

public class StockQuote  /* implements java.io.Serializable */ {
    private java.lang.String symbol;
    private java.lang.String previous_Close;
    private java.lang.String open;
    private java.lang.String high;
    private java.lang.String low;
    private java.lang.String last;
    private java.lang.String bid;
    private java.lang.String bid_Size;
    private java.lang.String ask;
    private java.lang.String ask_Size;
    private java.lang.String percent_Change;
    private java.lang.String change;
    private java.lang.String volume;
    private java.lang.String high_52_Weeks;
    private java.lang.String low_52_Weeks;
    private java.lang.String date;
    private java.lang.String time;

    public StockQuote() {
    }

    public java.lang.String getSymbol() {
        return symbol;
    }

    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }

    public java.lang.String getPrevious_Close() {
        return previous_Close;
    }

    public void setPrevious_Close(java.lang.String previous_Close) {
        this.previous_Close = previous_Close;
    }

    public java.lang.String getOpen() {
        return open;
    }

    public void setOpen(java.lang.String open) {
        this.open = open;
    }

    public java.lang.String getHigh() {
        return high;
    }

    public void setHigh(java.lang.String high) {
        this.high = high;
    }

    public java.lang.String getLow() {
        return low;
    }

    public void setLow(java.lang.String low) {
        this.low = low;
    }

    public java.lang.String getLast() {
        return last;
    }

    public void setLast(java.lang.String last) {
        this.last = last;
    }

    public java.lang.String getBid() {
        return bid;
    }

    public void setBid(java.lang.String bid) {
        this.bid = bid;
    }

    public java.lang.String getBid_Size() {
        return bid_Size;
    }

    public void setBid_Size(java.lang.String bid_Size) {
        this.bid_Size = bid_Size;
    }

    public java.lang.String getAsk() {
        return ask;
    }

    public void setAsk(java.lang.String ask) {
        this.ask = ask;
    }

    public java.lang.String getAsk_Size() {
        return ask_Size;
    }

    public void setAsk_Size(java.lang.String ask_Size) {
        this.ask_Size = ask_Size;
    }

    public java.lang.String getPercent_Change() {
        return percent_Change;
    }

    public void setPercent_Change(java.lang.String percent_Change) {
        this.percent_Change = percent_Change;
    }

    public java.lang.String getChange() {
        return change;
    }

    public void setChange(java.lang.String change) {
        this.change = change;
    }

    public java.lang.String getVolume() {
        return volume;
    }

    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }

    public java.lang.String getHigh_52_Weeks() {
        return high_52_Weeks;
    }

    public void setHigh_52_Weeks(java.lang.String high_52_Weeks) {
        this.high_52_Weeks = high_52_Weeks;
    }

    public java.lang.String getLow_52_Weeks() {
        return low_52_Weeks;
    }

    public void setLow_52_Weeks(java.lang.String low_52_Weeks) {
        this.low_52_Weeks = low_52_Weeks;
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
/*
    private transient java.lang.ThreadLocal __history;
    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        StockQuote other = (StockQuote) obj;
        boolean _equals;
        _equals = true
            && ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol())))
            && ((this.previous_Close==null && other.getPrevious_Close()==null) || 
             (this.previous_Close!=null &&
              this.previous_Close.equals(other.getPrevious_Close())))
            && ((this.open==null && other.getOpen()==null) || 
             (this.open!=null &&
              this.open.equals(other.getOpen())))
            && ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh())))
            && ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow())))
            && ((this.last==null && other.getLast()==null) || 
             (this.last!=null &&
              this.last.equals(other.getLast())))
            && ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid())))
            && ((this.bid_Size==null && other.getBid_Size()==null) || 
             (this.bid_Size!=null &&
              this.bid_Size.equals(other.getBid_Size())))
            && ((this.ask==null && other.getAsk()==null) || 
             (this.ask!=null &&
              this.ask.equals(other.getAsk())))
            && ((this.ask_Size==null && other.getAsk_Size()==null) || 
             (this.ask_Size!=null &&
              this.ask_Size.equals(other.getAsk_Size())))
            && ((this.percent_Change==null && other.getPercent_Change()==null) || 
             (this.percent_Change!=null &&
              this.percent_Change.equals(other.getPercent_Change())))
            && ((this.change==null && other.getChange()==null) || 
             (this.change!=null &&
              this.change.equals(other.getChange())))
            && ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume())))
            && ((this.high_52_Weeks==null && other.getHigh_52_Weeks()==null) || 
             (this.high_52_Weeks!=null &&
              this.high_52_Weeks.equals(other.getHigh_52_Weeks())))
            && ((this.low_52_Weeks==null && other.getLow_52_Weeks()==null) || 
             (this.low_52_Weeks!=null &&
              this.low_52_Weeks.equals(other.getLow_52_Weeks())))
            && ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())))
            && ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
        if (!_equals) { return false; }
        if (__history == null) {
            synchronized (this) {
                if (__history == null) {
                    __history = new java.lang.ThreadLocal();
                }
            }
        }
        StockQuote history = (StockQuote) __history.get();
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
        StockQuote history = (StockQuote) __hashHistory.get();
        if (history != null) { return 0; }
        __hashHistory.set(this);
        int _hashCode = 1;
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getPrevious_Close() != null) {
            _hashCode += getPrevious_Close().hashCode();
        }
        if (getOpen() != null) {
            _hashCode += getOpen().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        if (getLast() != null) {
            _hashCode += getLast().hashCode();
        }
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getBid_Size() != null) {
            _hashCode += getBid_Size().hashCode();
        }
        if (getAsk() != null) {
            _hashCode += getAsk().hashCode();
        }
        if (getAsk_Size() != null) {
            _hashCode += getAsk_Size().hashCode();
        }
        if (getPercent_Change() != null) {
            _hashCode += getPercent_Change().hashCode();
        }
        if (getChange() != null) {
            _hashCode += getChange().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getHigh_52_Weeks() != null) {
            _hashCode += getHigh_52_Weeks().hashCode();
        }
        if (getLow_52_Weeks() != null) {
            _hashCode += getLow_52_Weeks().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashHistory.set(null);
        return _hashCode;
    }
*/
}
