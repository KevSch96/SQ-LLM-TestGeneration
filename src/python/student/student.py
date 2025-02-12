class Student:
    """
    A class to represent a student in a system.
    """
    
    def __init__(self, student_id: int, name: str, age: int, major: str):
        """
        Initialize a student with ID, name, age, and major.
        """
        self.student_id = student_id
        self.name = name
        self.age = age
        self.major = major
        self.grades = {}
    
    def add_grade(self, course: str, grade: float):
        """
        Add a grade for a specific course.
        """
        self.grades[course] = grade
    
    def get_gpa(self) -> float:
        """
        Calculate and return the student's GPA.
        """
        if not self.grades:
            return 0.0
        return sum(self.grades.values()) / len(self.grades)
    
    def change_major(self, new_major: str):
        """
        Change the student's major.
        """
        self.major = new_major
    
    def __str__(self):
        """
        Return a string representation of the student.
        """
        return f"Student {self.name} (ID: {self.student_id}), Age: {self.age}, Major: {self.major}, GPA: {self.get_gpa():.2f}"