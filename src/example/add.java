package example;

import javax.jws.WebService;

@WebService
public class add {
    public double sum(double a, double b)
    {
        return a+b;
}
}
