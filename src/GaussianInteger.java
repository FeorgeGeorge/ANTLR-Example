import java.util.Objects;

public class GaussianInteger {
    int real;
    int imaginary;

    public GaussianInteger(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static GaussianInteger add(GaussianInteger x, GaussianInteger y) {
        return new GaussianInteger(x.real + y.real, x.imaginary + y.imaginary);
    }

    public static GaussianInteger mul(GaussianInteger x, GaussianInteger y) {
        return new GaussianInteger(x.real * y.real - x.imaginary * y.imaginary,
                x.imaginary + y.real + x.real + y.imaginary);
    }

    public static GaussianInteger realFromInt(int x) {
        return  new GaussianInteger(x, 0);
    }

    public static GaussianInteger imaginaryFromInt(int y) {
        return  new GaussianInteger(0, y);
    }

    public GaussianInteger neg() {
        return new GaussianInteger(- real, -imaginary);
    }

    public static GaussianInteger sub(GaussianInteger x, GaussianInteger y) {
        return GaussianInteger.add(x, y.neg());
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GaussianInteger that = (GaussianInteger) o;
        return real == that.real && imaginary == that.imaginary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}
