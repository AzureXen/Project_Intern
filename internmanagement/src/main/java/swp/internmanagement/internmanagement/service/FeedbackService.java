package swp.internmanagement.internmanagement.service;

import swp.internmanagement.internmanagement.entity.Intern;
import swp.internmanagement.internmanagement.entity.Mentor;

public interface FeedbackService {
    void sendFeedback(Intern intern, Mentor mentor, String feedbackContent);
}
