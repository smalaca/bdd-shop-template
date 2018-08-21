package com.smalaca.api.rest;

import javax.validation.constraints.Pattern;

public class CreditCardDetails {
	@Pattern(regexp="[0-9]{12}")
	private String number;

	@Pattern(regexp="[0-9]{3}")
	private String cv2;
	private String expirationDate;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCv2() {
		return cv2;
	}

	public void setCv2(String cv2) {
		this.cv2 = cv2;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
}
