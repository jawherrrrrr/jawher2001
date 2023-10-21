public class Point {
    int abs;
    int ord;
    public Point() {
        this.abs=0;
        this.ord=0;
    }
    void setCoordonnéePoint(int u, int v){
        abs=u;
        ord=v;
    }
    void translate(int u, int v){
        abs=abs+u;
        ord=ord+v;
    }

    public  void affichePoint(){
        System.out.println("l'abs:"+abs+"ord:"+ord);
    }
    public boolean origine(){
        return abs==0 && ord==0;
    }
    public boolean egale( Point p1,Point q){
        return p1.abs==q.abs && p1.ord==q.ord ;
    }

    public Point(int u, int v) {
        this.abs = u;
        this.ord = v;
    }
    public void setCoordonnéePoint(Point p){
        abs=p.abs;
        ord=p.ord;
    }
}
