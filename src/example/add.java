package example;

import javax.jws.WebService;

@WebService
public class add {
    public int Add(int a, int b)
    {
        return a+b;
}
}
