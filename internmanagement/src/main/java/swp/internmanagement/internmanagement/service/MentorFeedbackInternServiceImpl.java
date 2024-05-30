package swp.internmanagement.internmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swp.internmanagement.internmanagement.repository.MentorFeedbackInternRepository;

@Service
public class MentorFeedbackInternServiceImpl {
    private MentorFeedbackInternRepository feedbackRepo;

    @Autowired
    public MentorFeedbackInternServiceImpl(MentorFeedbackInternRepository feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }
}
