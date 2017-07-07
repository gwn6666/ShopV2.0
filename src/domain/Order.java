package domain;

import java.sql.Timestamp;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private OrderId id;
	private Commodity commodity;
	private Timestamp purchaseTime;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(OrderId id, Commodity commodity) {
		this.id = id;
		this.commodity = commodity;
	}

	/** full constructor */
	public Order(OrderId id, Commodity commodity, Timestamp purchaseTime) {
		this.id = id;
		this.commodity = commodity;
		this.purchaseTime = purchaseTime;
	}

	// Property accessors

	public OrderId getId() {
		return this.id;
	}

	public void setId(OrderId id) {
		this.id = id;
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Timestamp getPurchaseTime() {
		return this.purchaseTime;
	}

	public void setPurchaseTime(Timestamp purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

}