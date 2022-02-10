package com.studentData.Springboottutorial.DAO;

import com.studentData.Springboottutorial.DOMAIN.StudentDataEntity;
import org.springframework.data.repository.query.Param;

public interface StudentDao {
    void saveStudentData(StudentDataEntity studentData);
}
