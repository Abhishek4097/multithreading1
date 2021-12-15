class A4 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Aks");
        }
    }
}
class B{
    public static void main(String[] args) {
        A4 a=new A4();
        a.start();
        for (int i=1;i<=5;i++){
            System.out.println("Abhishek");
        }
    }
}
