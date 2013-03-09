package lv.citadele.modelCreater;

import javax.servlet.http.HttpServletRequest;

import lv.citadele.models.FormModel;
import lv.citadele.models.IModel;

public class FormModelCreater extends ModelCreater{

	@Override
	public IModel createModel(HttpServletRequest request) {
		IModel model = new FormModel();
		FormModel modelf = ((FormModel)model);
		
		addParametrsFromRequestToModel(request, modelf);
		
		return modelf;
	}

	public void addParametrsFromRequestToModel(HttpServletRequest request,
			FormModel modelf) {
		modelf.setCustomerNumber(request.getParameter("cust_number"));
		modelf.setFormdate(request.getParameter("formDate"));
		modelf.setRemitterName(request.getParameter("remitterName"));
		modelf.setBeneficiaryName(request.getParameter("beneficiaryName"));
		modelf.setPersCode(request.getParameter("personalId1alf")+request.getParameter("personalId2half"));
		modelf.setAccountNr(request.getParameter("accountNr"));
		modelf.setResidenceCountry(request.getParameter("residenceCountry"));
		modelf.setBeneficiaryBank(request.getParameter("beneficiaryBank"));
		modelf.setBankCode(request.getParameter("bankCode"));
		modelf.setCurrency(request.getParameter("currency"));
		modelf.setBankFee(request.getParameter("bankFee"));
		modelf.setAmountInWords(request.getParameter("amountInWords"));
		modelf.setPaymentType(request.getParameter("paymentType"));
		modelf.setExchangeRate(request.getParameter("exchangeRate"));
		modelf.setValueDate(request.getParameter("valueDate"));
		modelf.setCodeOfExternalPayment(request.getParameter("codeOfExternalPayment"));
		modelf.setPaymentDetails(request.getParameter("paymentDetails"));
		modelf.setSignature(request.getParameter("signature"));
	}

}
