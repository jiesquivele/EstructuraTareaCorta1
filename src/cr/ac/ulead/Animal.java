package cr.ac.ulead;

public abstract class Animal {

    private Sex sex;
    private TailSize tailSize;
    private TeethType teethType;
    private int fins;

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setTailSize(TailSize tailSize) {
        this.tailSize = tailSize;
    }

    public TailSize getTailSize() {
        return tailSize;
    }

    public void setTeethType(TeethType teethType) {
        this.teethType = teethType;
    }

    public TeethType getTeethType() {
        return teethType;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public int getFins() {
        return fins;
    }

    public void eat(TeethType teethType) {
        if (teethType != TeethType.NONE) {
            System.out.println("It devours with its " + teethType + " teeth!");
        } else {
            System.out.println("It does not have teeth, but it swallows, swallows and... SWALLOWS!");
        }
    }

    public void swim(int fins) {
        System.out.println("It swims really reeeally fast with its " + fins + " fins!");
    }

    public final void testTemplateMethod() {
        test1();
        test2();
        test3();
        test4();
    }

    public abstract void test1();

    public abstract void test2();
    
    public abstract void test3();

    public abstract void test4();
    
}
