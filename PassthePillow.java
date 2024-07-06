public class PassthePillow {
    public int passThePillow(int n, int time) {
        int laps = time / (n - 1);
        int remainder = time % (n - 1);
        return laps % 2 == 1 ? n - remainder : remainder + 1;
    }
}
