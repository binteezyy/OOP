package activity101;

public class PanganibanACM_Act101Exer04 {
    public static void main(String[] args) {
        double value = 0.5236;
        double sinx = Math.sin(value);
        double cosx = Math.cos(value);
        double sum = Math.pow(sinx, 2) + Math.pow(cosx, 2);

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum);
    }
}