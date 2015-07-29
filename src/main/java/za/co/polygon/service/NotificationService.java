package za.co.polygon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.polygon.domain.Broker;
import za.co.polygon.domain.Notification;
import za.co.polygon.domain.PolicyRequest;
import za.co.polygon.domain.QuotationRequest;
import za.co.polygon.repository.MailRepository;
import za.co.polygon.repository.MessageRepository;

@Service
public class NotificationService {

    @Autowired
    private MessageRepository messageRepository;
    private Notification notification;

    public void sendNotificationForNewQuotationRequest(QuotationRequest quotationRequest, Broker broker) {
        String to = broker.getEmail();
        String subject = "New Quotation Request";
        String message = String.format(
                "Ref : %s" + "\n"
                + "Click the link below to view quotation request : " + "\n"
                + "http://localhost:8080/polygon/broker.html#/quotation-requests/%s",
                quotationRequest.getReference(),
                quotationRequest.getReference());
        Notification notification = new Notification(to, subject, message);
        getMessageRepository().publish(notification, "q.notification");
    }

    public void sendNotificationForRejectQuotationRequest(QuotationRequest quotationRequest, String reason) {
        String to = quotationRequest.getApplicantEmail();
        String subject = "Quotation Request Rejected";
        String message = String.format(
                 "Dear %s ," +"\n"
                + "\n"
                +"Your request for quotation Ref : %s has been rejected for the following reason(s)" + "\n"
                + "\n"
                +"Reason(s):" + "\n"
                + "%s" + "\n"
                + "\n"
                + "Thanks" + "\n"
                + "Polygon Team",
                quotationRequest.getApplicantName(),
                quotationRequest.getReference(),
                reason);
        Notification notification = new Notification(to, subject, message);
        getMessageRepository().publish(notification, "q.notification");
    }
    
    public void sendNotificationForAcceptQuotationRequest(QuotationRequest quotationRequest,byte[] data){
        String to = quotationRequest.getApplicantEmail();
        String subject = "Quotation Request Accepted";
        String message = String.format(
                 "Dear %s ," +"\n"
                + "\n"
                +"Your request for quotation Ref : %s has been accepted" + "\n"
                + "\n"
                +"Please find the attachement t view your quotation" + "\n"
                + "\n"
                + "Please click the link below to apply for a policy" + " \n"
                + "http://localhost:8080/polygon/client.html#/quotations/%s " + " \n"
                + "\n"
                + "Thanks" + "\n"
                + "Polygon Team",
                quotationRequest.getApplicantName(),
                quotationRequest.getReference(),
                quotationRequest.getReference());
        String filename = quotationRequest.getApplicantName() + "_quotation.pdf";
        
        Notification notification = new Notification(to, subject, message, data, filename);
        getMessageRepository().publish(notification, "q.notification");
    }
   
    
    public void sendNotificationForNewPolicyRequest(PolicyRequest policyRequest, String toUnderwriterEmail,String underWriterName) {
        String to = toUnderwriterEmail;
        String subject = "New Policy Request";
        String message = String.format(
                "Dear " +underWriterName+ ",\n\n"
                + "You have a new Policy Request for Ref. :  %s\nClick the link below to view policy request details: " + "\n"
                + "http://localhost:8080/polygon/underwriter.html#/policy-requests/%s\n\nKind Regards,",
                policyRequest.getQuotation().getQuotationRequest().getReference(),
                policyRequest.getQuotation().getQuotationRequest().getReference());
        		setNotification(new Notification(to, subject, message));
//        		try {
//        			MailRepository mailRepository = new MailRepository();
//        			mailRepository.send(notification);
//        		} catch (Exception e) {
//        			e.printStackTrace();
//        		}
        		getMessageRepository().publish(getNotification(), "q.notification");     
    }

	public MessageRepository getMessageRepository() {
		return messageRepository;
	}

	public void setMessageRepository(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}
}
