package com.rd;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Flight_Details")
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
public interface FlightDetails {

	@Id
	@GeneratedValue
	private int flightMasterUid;
	private String flightNo;
	private String flightType;
	private String flightStatus;
	private Date flightDate;
	/**
	 * @return the flightMasterUid
	 */
	public int getFlightMasterUid() {
		return flightMasterUid;
	}
	/**
	 * @param flightMasterUid the flightMasterUid to set
	 */
	public void setFlightMasterUid(int flightMasterUid) {
		this.flightMasterUid = flightMasterUid;
	}
	/**
	 * @return the flightNo
	 */
	public String getFlightNo() {
		return flightNo;
	}
	/**
	 * @param flightNo the flightNo to set
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	/**
	 * @return the flightType
	 */
	public String getFlightType() {
		return flightType;
	}
	/**
	 * @param flightType the flightType to set
	 */
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	/**
	 * @return the flightStatus
	 */
	public String getFlightStatus() {
		return flightStatus;
	}
	/**
	 * @param flightStatus the flightStatus to set
	 */
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		return flightDate;
	}
	/**
	 * @param flightDate the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
}
