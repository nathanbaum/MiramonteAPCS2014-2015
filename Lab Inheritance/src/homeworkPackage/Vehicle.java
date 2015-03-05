package homeworkPackage;

public abstract class Vehicle {
    private int maxDistance;
    private int gasTankSize;
    
    public double calcMPG()
    {
        return maxDistance/gasTankSize;
    }
    
    abstract public int determineEngineSize();
}