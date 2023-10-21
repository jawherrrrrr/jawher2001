public class TestPoint {
    public static void main(String[] args) {
        Point p=new Point();
        System.out.println("les coordonnées du point p sont:");
        p.affichePoint();

        Point q=new Point(6,8);
        System.out.println("les coordonnées du point q sont:");
        q.affichePoint();

        p.setcoordonnerPoint(13,16);
        System.out.println("les nouvelles coordonnées du point p sont:");
        p.affichePoint();

        p.translate(2,4);
        System.out.println("les nouvelles coordonnées du point p sont:");
        p.affichePoint();
    }
}