import java.util.Scanner;

public class Test {
    private int AGE;
    public static void main(String[] args) {
        Test t=new Test();
        try {
            System.out.println("请输入年龄");
            Scanner ip=new Scanner(System.in);
            int age=ip.nextInt();
            if (age>1&&age<100){
                t.setAGE(age);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("类型错误");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("程序结束");
        }

    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }
}
