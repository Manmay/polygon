
package za.co.polygon.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quotation_requests")
public class QuotationRequest {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "reference")
    private String reference;
    
    @Column(name = "applicant_name")
    private String applicantName;
    
    @Column(name = "applicant_email")
    private String applicantEmail;
    
    @ManyToOne
    @JoinColumn(name = "broker_id")
    private Broker broker;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    @Column(name = "created_on")
    private Date date;
    
    @Column(name = "status")
    private String status;
    
    @OneToMany(mappedBy = "quotationRequest", fetch = FetchType.EAGER)
    private List<QuotationRequestQuestionnaires> quotationRequestQuestionnaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<QuotationRequestQuestionnaires> getQuotationRequestQuestionnaire() {
    	if(quotationRequestQuestionnaire== null) 
    		return new ArrayList<QuotationRequestQuestionnaires>();
    	else
    		return quotationRequestQuestionnaire;
    }

    public void setQuotationRequestQuestionnaire(List<QuotationRequestQuestionnaires> quotationRequestQuestionnaire) {
        this.quotationRequestQuestionnaire = quotationRequestQuestionnaire;
    }
    
}
