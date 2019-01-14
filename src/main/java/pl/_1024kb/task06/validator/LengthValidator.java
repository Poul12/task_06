package pl._1024kb.task06.validator;

import pl._1024kb.task06.exception.NotPositiveNumberException;

public class LengthValidator
{
    private static LengthValidator instance;

    public static LengthValidator getInstance()
    {
        instance = new LengthValidator();

        return instance;
    }

    public boolean checkProperNumberValue(double length) throws NotPositiveNumberException
    {
        if(!isPositiveNumber(length))
            throw new NotPositiveNumberException("Dlugość nie jest większa niż zero");

        return true;
    }

    private boolean isPositiveNumber(double length)
    {
        if(length > 0)
            return true;
        else
            return false;
    }
}
