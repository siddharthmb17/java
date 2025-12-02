class Studentt{
    int id;
    String name;
    Studentt(int i,String n){
        id=i;
        name=n;

    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        Studentt s1=new Studentt(101,"Amit");
        Studentt s2=new Studentt(102,"Rita");
        s1.display();
        s2.display();
    }
}