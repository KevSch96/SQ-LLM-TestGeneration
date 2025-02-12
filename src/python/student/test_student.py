from student import Student
import pytest

class TestStudent:
    
    def test_initialization(self):
        """
        Empty test case, just for setup.
        """

    def test_string_representation(self):
        student = Student(1, "Alice", 20, "Computer Science")
        student.add_grade("Math", 90.0)
        assert str(student) == "Student Alice (ID: 1), Age: 20, Major: Computer Science, GPA: 90.00"


    def test_get_gpa_no_grades(self):
        student = Student(1, "Alice", 20, "Computer Science")
        assert student.get_gpa() == 0.0


    def test_change_major(self):
        student = Student(1, "Alice", 20, "Computer Science")
        student.change_major("Biology")
        assert student.major == "Biology"


    def test_add_grade(self):
        student = Student(1, "Alice", 20, "Computer Science")
        student.add_grade("Math", 90.0)
        assert student.grades["Math"] == 90.0
