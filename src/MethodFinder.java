import java.lang.reflect.*;
import java.util.Arrays;

public class MethodFinder{
    public static Method findMethod(Class myClass, Object[] argTypes , Object returnType){
        Method[] myMethod = myClass.getMethods();
        for(Method method:myMethod){
            if(Arrays.deepEquals(method.getParameterTypes(),argTypes) && method.getReturnType().equals(returnType)){
                return method;
            }
        }
        return null;
    }

    public Object evaluateMethod(Class myClass,Object[] argTypes, Object returnType, Object[] arrayOfValues){
        Method myMethod = this.findMethod(myClass,argTypes,returnType);
        return myMethod.invoke(arrayOfValues);
    }
}
