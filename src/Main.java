public class Main {
    public static void main(String[] args) {
        RightTriangle tes = new RightTriangle();
        tes.rt(1.5,2.2);
        System.out.println(tes.rt(1.5,2.2));

        int rand = 0;
        while(rand<50 || rand>76){
            rand = (int)Math.random()*100;
        }
        System.out.print(rand);
    }
}