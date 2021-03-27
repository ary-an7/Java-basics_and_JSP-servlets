/**
* A*x*x + B*x + C = 0, provided it has any roots. If A == 0 or
* if the discriminant, B*B - 4*A*C, is negative, then an exception
* of type IllegalArgumentException is thrown.
*/
class Eqn
{
static public double root( double A, double B, double C ) throws IllegalArgumentException {
if (A == 0) {
	throw new IllegalArgumentException("A can’t be zero.");
}
else {
	double disc = B*B - 4*A*C;
	if (disc < 0)
		throw new IllegalArgumentException("Discriminant < zero.");
	double D=(-B + Math.sqrt(disc)) / (2*A);
	return D;
}
}
}
class Main
{
    public static void main (String[] args) {
        Eqn e= new Eqn();
        e.root(1.0,5.2,3.0);
        //e.root(1.0,1.2,3.0);   for Discriminant<0
        // e.root(0.0,5.2,3.0);  for A cant be zero
        
    }
}
