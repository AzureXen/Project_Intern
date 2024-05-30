package swp.internmanagement.internmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swp.internmanagement.internmanagement.entity.Field;
import swp.internmanagement.internmanagement.repository.FieldRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FieldServiceImpl implements FieldService{
    private FieldRepository FRepository;

    @Autowired
    public FieldServiceImpl(FieldRepository theFieldRepository){FRepository = theFieldRepository;}


    @Override
    public List<Field> findAll() {
        List<Field> list = new ArrayList<>();
        list = FRepository.findAll();
        if(list.isEmpty()) System.out.println("LIST IS EMPTY!");
        return list;
    }
}
