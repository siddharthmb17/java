class Student{
    String name;
    int age;
    String course;
    Student(){
        this("unkown",0,"not assigned");
        System.out.println("default constructor called");
    }
    Student(String name,int age){
        this(name,age,"general");
        System.out.println("two argument constructor called");
    }
    Student(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
        System.out.println("three argument constructor called");
    }
    void display(){
        System.out.println("Name:"+name+",Age:"+age+",Course:"+course);
    }
     public static void main(String[] args) {
        System.out.println("Creating Student 1:");
        Student s1 = new Student();
        s1.display();

        System.out.println("\nCreating Student 2:");
        Student s2 = new Student("Alice", 20);
        s2.display();

        System.out.println("\nCreating Student 3:");
        Student s3 = new Student("Bob", 22, "Computer Science");
        s3.display();
    }
}