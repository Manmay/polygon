package za.co.polygon.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "answertypes")
public class AnswerType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "answertype")
    private String answerType;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "answertype")
    private List<Questionnaire> questionnaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public List<Questionnaire> getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(List<Questionnaire> questionnaire) {
        this.questionnaire = questionnaire;
    }
    
    

}
