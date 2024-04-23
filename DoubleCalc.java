public class DoubleCalc implements Calculator{
        private double a;
        private double s;
        private double su;
        private double m;
        private double d;
        private double b;
        public DoubleCalc(double n1,double n2)
        {
            this.a=n1;
            this.b=n2;
        }
        public void add()
        {
            this.s=this.a+this.b;
        }
        public void sub()
        {
            this.su=this.a-this.b;
        }
        public void mult()
        {
            this.m=this.a*this.b;
        }
        public void div()
        {
            this.d=this.a/this.b;
        }
        public String toString()
        {
            return "the add is"+this.s+"the sub is"+this.su+"the mult is"+this.m+"the div is"+this.d;
        }
    }


