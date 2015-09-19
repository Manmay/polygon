package za.co.polygon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "indemnity_options")
public class IndemnityOption {
    
    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "indemity_item_option")
    private String indemnityItemOption;
    
    @Column(name = "indemnity_value")
    private String indemnityValue;
    
    @Column(name = "sum_insured")
    private double sumInsured;
    
    @Column(name = "premium")
    private double premium;
    
    @ManyToOne
    @JoinColumn(name = "policy_schedule_id")
    private PolicySchedule policySchedule;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndemnityItemOption() {
        return indemnityItemOption;
    }

    public void setIndemnityItemOption(String indemnityItemOption) {
        this.indemnityItemOption = indemnityItemOption;
    }
    
    
   
    public String getIndemnityValue() {
        return indemnityValue;
    }

    public void setIndemnityValue(String indemnityValue) {
        this.indemnityValue = indemnityValue;
    }

    public double getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public PolicySchedule getPolicySchedule() {
        return policySchedule;
    }

    public void setPolicySchedule(PolicySchedule policySchedule) {
        this.policySchedule = policySchedule;
    }
}