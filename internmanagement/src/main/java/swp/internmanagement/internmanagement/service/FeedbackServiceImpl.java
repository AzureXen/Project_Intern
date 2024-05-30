package swp.internmanagement.internmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swp.internmanagement.internmanagement.entity.Intern;
import swp.internmanagement.internmanagement.entity.Mentor;
import swp.internmanagement.internmanagement.entity.MentorFeedbackIntern;
import swp.internmanagement.internmanagement.repository.MentorFeedbackInternRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService{
    /*
    FB: FEEDBACK
    REPO: REPOSITORY
    MI: MENTOR INTERN
     */
    private MentorFeedbackInternRepository FB_MI_REPO;

    @Autowired
    public FeedbackServiceImpl(MentorFeedbackInternRepository FB_MI_REPO) {
        this.FB_MI_REPO = FB_MI_REPO;
    }


    @Override
    public void sendFeedback(Intern intern, Mentor mentor, String feedbackContent) {
        MentorFeedbackIntern feedback = new MentorFeedbackIntern();
        feedback.setIntern(intern);
        feedback.setMentor(mentor);
        feedback.setFeedbackContent(feedbackContent);

        FB_MI_REPO.save(feedback);
    }
}
