package gr.aueb.cf.java.ch5;

public class Exercise5 {

    public static void main(String[] args) {

        System.out.println(findMax(-7,-2,0));
    }

    public static int findMax(int n1, int n2, int n3){
        int max = n1;

        if(n2>max){
            max = n2;
        }

        if(n3>max){
            max = n3;
        }

        return max;
    }
}
