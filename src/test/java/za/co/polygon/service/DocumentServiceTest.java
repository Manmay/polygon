package za.co.polygon.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import za.co.polygon.domain.Product;
import za.co.polygon.domain.Quotation;
import za.co.polygon.domain.QuotationOption;
import za.co.polygon.domain.QuotationRequest;

import com.itextpdf.text.DocumentException;
import java.util.List;

public class DocumentServiceTest {
	
	@Test
	public void test() throws DocumentException, IOException{
		DocumentService  service = new DocumentService();
                
		Quotation quotation = new Quotation();
		QuotationRequest  quotationRequest = new QuotationRequest();
		quotationRequest.setApplicantName("Thabo");
		quotationRequest.setCompanyName("Reverside");
                
		quotationRequest.setCreateDate(new Date());
                Product product = new Product();
		product.setName("Cash and Valuables in Transinsit");
                
                QuotationOption quotationOption = new QuotationOption();
                quotationOption.setCommodity("Gold");
                quotationOption.setLocation("Midrand");
                quotationOption.setExcess("1231");
                quotationOption.setLimit("1000");
                quotationOption.setPremium("12334");
                quotationOption.setPeroid("2 weeks");
                quotationOption.setCover("Static cover");
                quotationOption.setQuotation(quotation);
                
                QuotationOption quotationOption2 = new QuotationOption();
                quotationOption2.setCommodity("Cash");
                quotationOption2.setLocation("Sandton");
                quotationOption2.setExcess("12000");
                quotationOption2.setLimit("998");
                quotationOption2.setPremium("1999");
                quotationOption2.setPeroid("12 months");
                quotationOption2.setCover("Cash In Transit");
                quotationOption2.setQuotation(quotation);
                
		
		
		quotationRequest.setProduct(product);
		
		quotation.setQuotationRequest(quotationRequest);
		
                List<QuotationOption> quotationOptions = new ArrayList<QuotationOption>();
                
                quotationOptions.add(quotationOption);
                quotationOptions.add(quotationOption2);
                
		quotation.setQuotationOptions(quotationOptions);
		
		byte[] data = service.generateQuotation(quotation);
		FileOutputStream out = new FileOutputStream("target/test.pdf");
		out.write(data);
		out.close();
	}

}