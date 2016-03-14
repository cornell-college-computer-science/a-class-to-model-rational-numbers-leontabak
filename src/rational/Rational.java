

   } // Rational( int, int )
 public class Rational {
   private int num;
       return a;
     if( b == 0 ) {
     } // if
   } // gcd( int, int )
   private int den;
     return new Rational( n, d );
   } // toString()
     this.den = den/gcd;
 } // Rational
   public Rational( int num, int den ) {
   public String toString() {
   public Rational add( Rational r ) {
     } // else
     int d = this.den * r.den;
     this.num = num/gcd;
   private int gcd( int a, int b ) {
   } // add( Rational )
     else {
     int gcd = gcd( num, den );
     int n = this.num * r.den + this.den * r.num;
       return gcd( b, a % b );
     return num + "/" + den;