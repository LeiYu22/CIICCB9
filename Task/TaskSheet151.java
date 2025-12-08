import java.util.ArrayList;
import java.util.List;

public class TaskSheet151 {

    public static void main(String[] args) {
        School mySchool = new School("Central High School");

        Teacher masterTeacher1 = new Teacher("Mr. Smith", "MT-001");
        Teacher teacher1a = new Teacher("Ms. Jones", "T-002");
        Teacher teacher1b = new Teacher("Mr. Davis", "T-003");

        Teacher masterTeacher2 = new Teacher("Mrs. Evans", "MT-004");
        Teacher teacher2a = new Teacher("Mr. White", "T-005");

        Office office1 = new Office("Main Office");
        Office office2 = new Office("Science Department Office");

        FacultyRoom facultyRoom = new FacultyRoom("Faculty Lounge");

        Department scienceDept = new Department("Science Department", masterTeacher1);
        scienceDept.addTeacher(teacher1a);
        scienceDept.addTeacher(teacher1b);
        scienceDept.addOffice(office2);

        Department mathDept = new Department("Mathematics Department", masterTeacher2);
        mathDept.addTeacher(teacher2a);
        mathDept.addOffice(office1);

        mySchool.addDepartment(scienceDept);
        mySchool.addDepartment(mathDept);
        mySchool.addOffice(office1);
        mySchool.addOffice(facultyRoom);

        System.out.println("--- School System Summary ---");
        System.out.println("School: " + mySchool.getName());
        System.out.println("Offices in school: " + mySchool.getOffices().size());
        System.out.println("Departments in school: " + mySchool.getDepartments().size());
        
        System.out.println("\n-- Department Details --");
        for (Department dept : mySchool.getDepartments()) {
            System.out.println("\nDepartment Name: " + dept.getName());
            System.out.println("Master Teacher: " + dept.getMasterTeacher().getName());
            System.out.println("Number of Teachers: " + dept.getTeachers().size());
            System.out.println("Associated Offices: " + dept.getOffices().size());
        }
        System.out.println("\n--- End of Summary ---");
    }
}

class School {
    private String name;
    private List<Department> departments;
    private List<Office> offices;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.offices = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void addOffice(Office office) {
        this.offices.add(office);
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
    
    public List<Office> getOffices() {
        return offices;
    }
}

class Department {
    private String name;
    private Teacher masterTeacher;
    private List<Teacher> teachers;
    private List<Office> offices;

    public Department(String name, Teacher masterTeacher) {
        this.name = name;
        this.masterTeacher = masterTeacher;
        this.teachers = new ArrayList<>();
        this.offices = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    
    public void addOffice(Office office) {
        this.offices.add(office);
    }

    public String getName() {
        return name;
    }

    public Teacher getMasterTeacher() {
        return masterTeacher;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    public List<Office> getOffices() {
        return offices;
    }
}

class Office {
    private String name;

    public Office(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FacultyRoom extends Office {
    public FacultyRoom(String name) {
        super(name);
    }
}

class Teacher {
    private String name;
    private String teacherID;

    public Teacher(String name, String teacherID) {
        this.name = name;
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public String getTeacherID() {
        return teacherID;
    }
}