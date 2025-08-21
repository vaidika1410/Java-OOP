package inheritance;

class Box {
    double l;
    double w;
    double h;

    Box () {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

//    cube
    Box (double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

//    cuboid
    Box (double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box original) {
        this.l = original.l;
        this.w = original.w;
        this.h = original.h;
    }
}
