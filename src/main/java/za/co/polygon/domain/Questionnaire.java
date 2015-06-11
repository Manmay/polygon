package za.co.polygon.domain;

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
@Table(name = "questionnaires")
public class Questionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
    
    @Column(name = "sequence_number")
    private Long sequenceNumber;
    
    @Column(name="question")
    private String question;

    @ManyToOne
    @JoinColumn(name = "answer_type_id")
    private AnswerType answertype;
    
    @OneToMany(mappedBy = "answerValue", targetEntity = AnswerValue.class, fetch = FetchType.EAGER)
    private List<AnswerValue> answerValues;
    
    @Column(name = "depends_on")
    private Long dependsOn;
    
    @Column(name = "if_answer")
    private String ifAnswer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public AnswerType getAnswertype() {
		return answertype;
	}

	public void setAnswertype(AnswerType answertype) {
		this.answertype = answertype;
	}

	public Long getDependsOn() {
		return dependsOn;
	}

	public void setDependsOn(Long dependsOn) {
		this.dependsOn = dependsOn;
	}

	public String getIfAnswer() {
		return ifAnswer;
	}

	public void setIfAnswer(String ifAnswer) {
		this.ifAnswer = ifAnswer;
	}

	public List<AnswerValue> getAnswerValues() {
		return answerValues;
	}

	public void setAnswerValues(List<AnswerValue> answerValues) {
		this.answerValues = answerValues;
	}
    
    
    

}
