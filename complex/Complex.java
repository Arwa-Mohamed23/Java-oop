class Complex<T extends Number> {
    private T real;
    private T img;

    public Complex(T real, T img) {
        this.real = real;
        this.img = img;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return img;
    }

    public Complex<Double> add(Complex<T> c1) {
        double realres = this.real.doubleValue() + c1.real.doubleValue();
        double imgres = this.img.doubleValue() + c1.img.doubleValue();
        return new Complex<>(realres, imgres);
    }

    public Complex<Double> sub(Complex<T> c1) {
        double realres = this.real.doubleValue() - c1.real.doubleValue();
        double imgres = this.img.doubleValue() - c1.img.doubleValue();
        return new Complex<>(realres, imgres);
    }

    public Complex<Double> multiply (Complex<T> c1) {
        double realres = this.real.doubleValue() * c1.real.doubleValue();
        double imgres = this.img.doubleValue() * c1.img.doubleValue();
        return new Complex<>(realres, imgres);
    }

    public Complex<Double> Division (Complex<T> c1) {
        double realres = this.real.doubleValue() / c1.real.doubleValue();
        double imgres = this.img.doubleValue() / c1.img.doubleValue();
        return new Complex<>(realres, imgres);
    }

    @Override
    public String toString() {
        if(img.doubleValue()<0)return real +" "+ img + " i";
        return real + " +" + img + " i";
    }
}
