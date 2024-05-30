package swp.internmanagement.internmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swp.internmanagement.internmanagement.entity.Mentor;
import swp.internmanagement.internmanagement.repository.MentorRepository;

import java.util.Optional;

@Service
public class MentorServiceImpl implements MentorService{
    private MentorRepository MRepository;
    @Autowired
    public MentorServiceImpl(MentorRepository MRepository) {
        this.MRepository = MRepository;
    }

    @Override
    public Mentor findById(int id) {
        Optional<Mentor> result = MRepository.findById(id);
        Mentor mentor = null;
        if(result.isPresent()){
            mentor = result.get();
        }else{
            throw new RuntimeException("Did not find the mentor with id: " + id);
        }
        return mentor;
    }
}
