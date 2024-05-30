package swp.internmanagement.internmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swp.internmanagement.internmanagement.entity.Intern;
import swp.internmanagement.internmanagement.repository.InternRepository;

import java.util.Optional;

@Service
public class InternServiceImpl implements InternService{
    private InternRepository IRepository;
    @Autowired
    public InternServiceImpl(InternRepository IRepository) {
        this.IRepository = IRepository;
    }
    @Override
    public Intern findById(int id) {
        Optional<Intern> result = IRepository.findById(id);
        Intern intern = null;
        if (result.isPresent()) {
            intern = result.get();
        }else{
            throw new RuntimeException("Did not find the intern with id: " + id);
        }
        return intern;
    }
}
