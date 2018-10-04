package gigstarter.api.service;

import gigstarter.api.model.EmployerUser;
import gigstarter.api.model.StudentUser;
import gigstarter.api.repository.EmployerUserRepository;
import gigstarter.api.repository.StudentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    StudentUserRepository studentUserRepository;

    @Autowired
    EmployerUserRepository employerUserRepository;

    public boolean createStudentUser(StudentUser user){
        studentUserRepository.save(user);
        return true;
    }

    public boolean createEmployerUser(EmployerUser user){
        employerUserRepository.save(user);
        return true;
    }

}
