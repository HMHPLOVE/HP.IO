package com.web.hp.service.Impl;
import com.web.hp.dao.StudentDao;
import com.web.hp.entity.Student;
import com.web.hp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 *
 */

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    /**
     * 获取到 Student 的总数
     *
     * @return
     */
    public int getTotal() {
        return studentDao.getTotal();
    }

    /**
     * 增加一条数据
     *
     * @param student
     */
    public void addStudent(Student student) {
        studentDao.addStudent(student);

    }

    /**
     * 删除一条数据
     *
     * @param id
     */
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);

    }

    /**
     * 更新一条数据
     *
     * @param student
     */
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    /**
     * 找到一条数据
     *
     * @param id
     * @return
     */
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    /**
     * 列举出从 start 位置开始的 count 条数据
     *
     * @param start
     * @param count
     * @return
     */
    public List<Student> list(int start, int count) {
        return studentDao.list(start,count);
    }
}
