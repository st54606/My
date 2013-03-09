package lv.citadele.models;

public class FormModel implements IModel {
	
	private String formdate;
	private String remitterName;
	private String beneficiaryName;
	private String persCode;
	private String accountNr;
	private String residenceCountry;
	private String beneficiaryBank;
	private String bankCode;
	private String currency;
	private String bankFee;
	private String amountInWords;
	private String paymentType;
	private String exchangeRate;
	private String valueDate;
	private String codeOfExternalPayment;
	private String paymentDetails;
	private String signature;
	private String customerNumber;
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getFormdate() {
		return formdate;
	}
	public void setFormdate(String formdate) {
		this.formdate = formdate;
	}
	public String getRemitterName() {
		return remitterName;
	}
	public void setRemitterName(String remitterName) {
		this.remitterName = remitterName;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getPersCode() {
		return persCode;
	}
	public void setPersCode(String persCode) {
		this.persCode = persCode;
	}
	public String getAccountNr() {
		return accountNr;
	}
	public void setAccountNr(String accountNr) {
		this.accountNr = accountNr;
	}
	public String getResidenceCountry() {
		return residenceCountry;
	}
	public void setResidenceCountry(String residenceCountry) {
		this.residenceCountry = residenceCountry;
	}
	public String getBeneficiaryBank() {
		return beneficiaryBank;
	}
	public void setBeneficiaryBank(String beneficiaryBank) {
		this.beneficiaryBank = beneficiaryBank;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBankFee() {
		return bankFee;
	}
	public void setBankFee(String bankFee) {
		this.bankFee = bankFee;
	}
	public String getAmountInWords() {
		return amountInWords;
	}
	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getCodeOfExternalPayment() {
		return codeOfExternalPayment;
	}
	public void setCodeOfExternalPayment(String codeOfExternalPayment) {
		this.codeOfExternalPayment = codeOfExternalPayment;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	

}
