package webapp2.domain;

// Generated 12.Mar.2014 15:13:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * StockDailyRecord generated by hbm2java
 */
public class StockDailyRecord implements java.io.Serializable {

	private Integer recordId;
	private Stock stock;
	private Float prıceOpen;
	private Float prıceClose;
	private Float prıceChange;
	private Long volume;
	private Date date;

	public StockDailyRecord() {
	}

	public StockDailyRecord(Stock stock, Date date) {
		this.stock = stock;
		this.date = date;
	}

	public StockDailyRecord(Stock stock, Float prıceOpen, Float prıceClose,
			Float prıceChange, Long volume, Date date) {
		this.stock = stock;
		this.prıceOpen = prıceOpen;
		this.prıceClose = prıceClose;
		this.prıceChange = prıceChange;
		this.volume = volume;
		this.date = date;
	}

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Float getPrıceOpen() {
		return this.prıceOpen;
	}

	public void setPrıceOpen(Float prıceOpen) {
		this.prıceOpen = prıceOpen;
	}

	public Float getPrıceClose() {
		return this.prıceClose;
	}

	public void setPrıceClose(Float prıceClose) {
		this.prıceClose = prıceClose;
	}

	public Float getPrıceChange() {
		return this.prıceChange;
	}

	public void setPrıceChange(Float prıceChange) {
		this.prıceChange = prıceChange;
	}

	public Long getVolume() {
		return this.volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
