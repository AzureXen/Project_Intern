package swp.internmanagement.internmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import swp.internmanagement.internmanagement.entity.Intern;
import swp.internmanagement.internmanagement.entity.Mentor;
import swp.internmanagement.internmanagement.service.FeedbackService;
import swp.internmanagement.internmanagement.service.InternService;
import swp.internmanagement.internmanagement.service.MentorService;

@SpringBootApplication
public class InternmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternmanagementApplication.class, args);
	}

	//Testing the feedback
	@Bean
	public CommandLineRunner commandLineRunner(FeedbackService FS, InternService IS, MentorService MS) {
		return runner -> {
			mentorSendFeedbackIntern(FS, IS, MS);
		};
	}

	private void mentorSendFeedbackIntern(FeedbackService FS, InternService IS, MentorService MS) {
		int intern_id = 1;
		int mentor_id = 1;
		String feedbackContent = "You've done well.";

		Intern intern = null;
		Mentor mentor = null;
		intern = IS.findById(3);
		mentor = MS.findById(2);
		if(intern==null || mentor==null) {
			throw new RuntimeException("Error occured: missing intern or mentor");
		}else{
			FS.sendFeedback(intern, mentor, feedbackContent);
			System.out.println("Saved to database: ");
			System.out.println("Mentor: " + mentor.getFullName());
			System.out.println("Intern: " + intern.getFullName());
			System.out.println("Feedback: " + feedbackContent);
		}
	}
}
