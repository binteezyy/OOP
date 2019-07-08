package activity101;

public class PanganibanACM_Act101Exer05 {
    public static void main(String[] args) {
        double degrees = 30.0;
        double rad = degrees * Math.PI / 180;
        double sinx = Math.sin(rad);
        double cosx = Math.cos(rad);
        double sum = Math.pow(sinx, 2) + Math.pow(cosx, 2);

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum);
    }
}