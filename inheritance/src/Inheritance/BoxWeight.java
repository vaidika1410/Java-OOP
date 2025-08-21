package Inheritance;

public class BoxWeight extends Box {
        double weight;

        public BoxWeight() {
            this.weight = -1;
        }

        BoxWeight (BoxWeight other) {
            super(other); // upcasting
            this.weight = weight;
        }

        BoxWeight(double l, double w, double h, double weight) {
            super(l, w, h); // used to initialize the parent class constructor having the same no. of arguments
//          a super class constructor should be called before a child class variable, because the child class needs
//          to know about the parent class variables
            this.weight = weight; 

        }
}
