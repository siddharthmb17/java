class Simple{
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;
    void showVars(){
        System.out.print(privateVar + " " + defaultVar + " " + protectedVar + " " + publicVar);
    }
}
public class SimpleMain{
    public static void main(String[] args) {
        Simple obj = new Simple();
        //System.out.println(obj.privateVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
    }
}