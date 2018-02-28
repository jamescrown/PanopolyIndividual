public class ReflectionMain {
    public void main(String[] args){
        Class myObjectClass = Dice.class;
        Class[] myArgTypes = {int.class,int.class};
        String answer = MethodFinder.findMethod(myObjectClass, myArgTypes, int.class).getName();
        int first = 2;
        int second = 6;
        Object[] myInput = {first ,second};
        MethodFinder.evaluateMethod(myObjectClass,myArgTypes, int.class, myInput);
        System.out.println("the answer is : "+ answer);
    }
}
